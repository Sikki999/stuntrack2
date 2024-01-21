package com.example.stuntrack

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import java.util.*

class scan_dataAnak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan_data_anak)

        val calendar = Calendar.getInstance()
        val btnClick1 = findViewById<Button>(R.id.btnCekSekarang)


        // Gunakan id EditText sesuai dengan layout Anda
        val etTanggalLahir = findViewById<EditText>(R.id.eTTanggalLahir)

        etTanggalLahir.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                    // Format the selected date as needed
                    val selectedDate = "$dayOfMonth/${month + 1}/$year"
                    // Atur teks pada EditText
                    etTanggalLahir.setText(selectedDate)
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )

            // Set the maximum date (optional)
            datePickerDialog.datePicker.maxDate = System.currentTimeMillis()

            // Show the date picker dialog
            datePickerDialog.show()
        }

        btnClick1.setOnClickListener {
            Intent(this,camera::class.java).also {
                startActivity(it)
            }
        }

    }
}