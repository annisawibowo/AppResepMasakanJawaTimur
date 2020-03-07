package com.example.kulinerjawatimur

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.detail_resep.*

class detailresep : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_resep)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var juduli = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)

            var resep = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)

         judul.text = juduli
       //    Picasso.get().load(intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)).into(gmbr)
            Picasso.get().load(intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)).into(gmbr)
            desk.text = resep
        }
    }

}