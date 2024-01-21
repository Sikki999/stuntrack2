package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import java.util.*
import kotlin.collections.ArrayList

class faq : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)
        // Panggil fungsi untuk setup toolbar
        setupToolbar()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = LanguageAdapter(mList)
        recyclerView.adapter = adapter
        val btnClick1 = findViewById<MaterialButton>(R.id.button_kirimpesan)
//
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                filterList(newText)
//                return true
//            }
//
//        })
        btnClick1.setOnClickListener {
            Intent(this,kirim_pesan::class.java).also {
                startActivity(it)
            }
        }

    }


    private fun filterList(query: String?) {

        if (query != null) {
            val filteredList = ArrayList<LanguageData>()
            for (i in mList) {
                if (i.title.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(i)
                }
            }

            if (filteredList.isEmpty()) {
                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
            } else {
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList() {
        mList.add(
            LanguageData(
                " Apa itu Stunting? ",
                R.drawable.img_1,
                " Stunting adalah kondisi yang ditandai dengan kurangnya tinggi badan anak apabila dibandingkan dengan anak-anak seusianya. "
            )
        )
        mList.add(
            LanguageData(
                " Bagaimana cara pencegahan stunting pada anak? ",
                R.drawable.img_1,
                " Pemberian Nutrisi yang Baik ,Makanan Pendamping ASI yang Sehat ,sosialisasi Kesehatan dan Higienis, Edukasi Ibu dan Keluarga, Akses Terhadap Layanan Kesehatan. "
            )
        )
        mList.add(
            LanguageData(
                " Apa penyebab utama stunting pada anak? ",
                R.drawable.img_1,
                " Stunting pada anak disebabkan oleh kombinasi faktor, termasuk kekurangan gizi kronis, infeksi berulang, sanitasi yang buruk, dan aspek-aspek lingkungan sosial-ekonomi. Pemahaman dan penanganan holistik terhadap faktor-faktor ini diperlukan untuk mencegah stunting. "
            )
        )
        mList.add(
            LanguageData(
                " Kapan waktu kritis untuk pencegahan stunting pada anak? ",
                R.drawable.img_1,
                " Waktu kritis untuk pencegahan stunting pada anak terutama terjadi pada 1.000 hari pertama kehidupan, mulai dari kehamilan hingga 2 tahun pertama. Upaya pencegahan yang efektif sejak awal kehidupan dapat memberikan dampak besar pada pertumbuhan dan perkembangan anak. "
            )
        )
        mList.add(
            LanguageData(
                " Apa peran nutrisi dalam pencegahan stunting? ",
                R.drawable.img_1,
                " Nutrisi memainkan peran kunci dalam pencegahan stunting. Anak yang menerima nutrisi yang cukup, terutama selama 1.000 hari pertama kehidupan, memiliki peluang lebih besar untuk tumbuh dan berkembang dengan baik. Nutrisi yang adekuat, terutama melalui pemberian ASI eksklusif selama enam bulan pertama dan makanan pendamping ASI yang sehat, memberikan dasar yang kuat untuk pertumbuhan optimal anak, mengurangi risiko stunting, dan mendukung perkembangan fisik dan kognitif yang baik."

            )
        )
        mList.add(
            LanguageData(
                "Apa saja efek jangka panjang dari stunting pada anak?",
                R.drawable.img_1,
                " Keterlambatan perkembangan kognitif, Penurunan produktivitas, Kemungkinan penyakit kronis, Penurunan daya tahan tubuh, Cicilan kemiskinan berkelanjutan. "
            )
        )
//        mList.add(
//            LanguageData(
//                "JavaScript",
//                R.drawable.img_1,
//                "JavaScript, often abbreviated as JS, is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS. As of 2022, 98% of websites use JavaScript on the client side for webpage behavior, often incorporating third-party libraries."
//            )
//        )
//        mList.add(
//            LanguageData(
//                "C#",
//                R.drawable.img_1,
//                "C# is a general-purpose, high-level multi-paradigm programming language. C# encompasses static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented, and component-oriented programming disciplines."
//            )
//        )
    }



    private fun setupToolbar() {
        val toolbar: Toolbar = findViewById(R.id.tbDetailMbl)
        toolbar.title = "FAQ" // Ganti dengan judul yang sesuai
        setSupportActionBar(toolbar)

        // Tambahkan tombol kembali
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Override untuk menangani klik tombol kembali di toolbar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}