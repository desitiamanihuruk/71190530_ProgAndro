package id.ac.ukdw.pertemuan7_71190530

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listKontak = arrayListOf<Kontak>()
        listKontak.add(Kontak("Gabby", "082255914757", R.mipmap.gabby))
        listKontak.add(Kontak("Windy", "085241046416", R.mipmap.windy))
        listKontak.add(Kontak("Yeni", "081263333602", R.mipmap.yeni))
        listKontak.add(Kontak("Fifi", "082329594322", R.mipmap.fifi))

        val rcyKontak = findViewById<RecyclerView>(R.id.rcykontak)
        rcyKontak.layoutManager = LinearLayoutManager(this)
        val adapter = KontakAdapter(listKontak, this)
        rcyKontak.adapter = adapter

        val nama = findViewById<TextView>(R.id.txtNama)

        rcyKontak.setOnClickListener{
            val i = Intent(this, SecondPageActivity::class.java)
            i.putExtra( "nama", nama.text.toString())
            startActivity(i)
        }

    }
}