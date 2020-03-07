package com.example.kulinerjawatimur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createresepdata()
        rv_bag.layoutManager = LinearLayoutManager(this)
        rv_bag.setHasFixedSize(true)
        rv_bag.adapter = resepAdapter(data,{resepItem : resepdata -> resepItemClicked(resepItem) })


    }
    private fun resepItemClicked(resepItem :resepdata) {
        val showDetailActivityIntent = Intent (this, detailresep::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, resepItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, resepItem.gambar)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, resepItem.resep)
        startActivity(showDetailActivityIntent)
    }
    private fun createresepdata() : List<resepdata> {
        val rvlist = ArrayList<resepdata>()
        rvlist.add(resepdata("Rawon","Bahan dasar :\n" +
                "500 gr daging sapi, potong kecil dan tipis\n" +
                "200 cc air bersih\n" +
                "4 lbr daun jeruk\n" +
                "3 sdm minyak sayur\n" +
                "2 cm lengkuas, memarkan\n" +
                "1 btg serai, memarkan\n" +
                "Bumbu halus :\n" +
                "5 siung bawang putih\n" +
                "2 bh cabe merah\n" +
                "8 btr bawang merah\n" +
                "1 ruas jahe\n" +
                "1 ½ sdt ketumbar sangrai\n" +
                "3 bh kluwek, ambil isinya saja\n" +
                "1 sdt gula merah (sisir halus)\n","https://pngimage.net/wp-content/uploads/2018/06/rawon-png-3.png"))
        rvlist.add(
            resepdata("Kupang Lontong","Bahan - Bahan : \n" +"1 bungkus lontong siap pakai\n" +
                    "250 gram kupang yg sudah di rebus\n" +
                    "3 batang daun bawang merah\n" +
                    "Bumbu kuah:\n" +
                    "3 siung baput\n" +
                    "1/3 sendok teh merica bubuk\n" +
                    "400 ml air\n" +
                    "Secukupnya garam dan gula pasir\n" +
                    "Bumbu pelengkap:\n" +
                    "1 sendok makan petis\n" +
                    "1/3 siung baput\n" +
                    "1/2 sendok teh gula merah\n" +
                    "1/2 sendok teh gula pasir\n" +
                    "3 buah cabe rawit\n" +
                    "1 sendok teh air jeruk nipis\n" +
                    "Taburan:\n" +
                    "Secukupnya irisan baput yg di goreng setengah matang\n","https://media.travelingyuk.com/wp-content/uploads/2017/02/featured-14.jpg")
        )
        rvlist.add(
            resepdata("Soto Ayam","Bahan - Bahan : \n" +
                    " 1 ekor ayam kampung, potong 4 bagian\n" +
                    "3 batang serai, memarkan\n" +
                    "6 lembar daun jeruk\n" +
                    "1 ruas jahe, memarkan\n" +
                    "1 ruas lengkuas, memarkan\n" +
                    "1/2 buah pala, memarkan\n" +
                    "1 batang daun bawang, potong kasar\n" +
                    "2 batang seledri, simpulkan\n" +
                    "Bumbu halus:\n" +
                    "8 butir bawang merah\n" +
                    "6 siung bawang putih\n" +
                    "1 cm kunyit\n" +
                    "4 butir kemiri\n" +
                    "1/2 sdm ketumbar\n" +
                    "1/2 sdt merica butiran\n" +
                    "Pelengkap:\n" +
                    "1 bgks Soun, seduh air panas\n" +
                    "3 butir Telur rebus\n" +
                    "1/4 kg Kol, iris halus\n" +
                    "1 genggam Tauge pendek, seduh air panas\n" +
                    "sesuai selera Bawang merah goreng\n" +
                    "1 batang Daun bawang & seledri, iris halus\n" +
                    "secukupnya Sambal rawit, jeruk nipis\n" +
                    "Koya:\n" +
                    "4 siung bawang putih\n" +
                    "3 buah kerupuk udang goreng \n ","https://i2.wp.com/www.romadecade.org/wp-content/uploads/2019/09/4-resep-dan-cara-membuat-soto-ayam-bening-enak-dan-sederhana-kln.jpg?w=671&ssl=1")
        )
        rvlist.add(
            resepdata("Rujak Cingur"," Bahan - Bahan : \n "+"1/4 ikat kangkung, siangi\n" +
                    "100 gr taoge, buang ekor dan tutup kepalanya\n" +
                    "4 buah timun, iris tipis\n" +
                    "250 gr cingur sapi\n" +
                    "1 buah tahu, goreng lalu potong-potong\n" +
                    "1/2 papan tempe, potong lalu goreng\n" +
                    "2 buah lontong ukuran kecil, potong-potong\n" +
                    "Bumbu perendam cingur:\n" +
                    "2 siung bawang putih\n" +
                    "1/2 sdt ketumbar\n" +
                    "secukupnya garam\n" +
                    "Bumbu yang dihaluskan:\n" +
                    "10 buah cabe rawit merah\n" +
                    "1 sachet terasi\n" +
                    "1/2 buah pisang batu, iris tipis\n" +
                    "8 sdm kacang tanah goreng\n" +
                    "200 gr gula merah\n" +
                    "1 sdt asam jawa\n" +
                    "8 sdm petis udang\n" +
                    "secukupnya garam\n" +
                    "secukupnya air\n" +
                    "Pelengkap:\n" +
                    "secukupnya kerupuk\n","https://www.masakapahariini.com/wp-content/uploads/2019/05/6-1.jpg")
        )
        rvlist.add(
            resepdata("Tahu Tek"," Bahan - Bahan : \n "+"3 sendok makan Kacang Tanah\n" +
                    "1 sendok teh Petis Udang/petis madura\n" +
                    "1/2 siung Bawang Putih\n" +
                    "3 batang Cabe Rawit\n" +
                    "1 butir Telur Ayam\n" +
                    "3 buah Tahu\n" +
                    "secukupnya Timun\n" +
                    "secukupnya Tauge\n" +
                    "secukupnya Bawang Goreng (Bawang Merah)\n" +
                    "secukupnya Kecap Manis\n" +
                    "secukupnya Lontong\n" +
                    "secukupnya Garam\n","http://www.indoresep.web.id/wp-content/uploads/2014/01/tahu-tek_zpsoavmnw8h.jpg")
        )
        return rvlist
    }
}
