package com.singpaulee.submission_android_pemula_dicoding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.singpaulee.submission_android_pemula_dicoding.model.DinosaurModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    var dinosaurModel: DinosaurModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        dinosaurModel = intent.getParcelableExtra("dinosaur")

        da_tv_name_dinosaur.text = dinosaurModel?.name.toString()
        Glide.with(this).load(dinosaurModel?.image.toString()).into(da_iv_image_dinosaur)
        da_tv_description_dinosaur.text = dinosaurModel?.shortDescryption.toString()
        da_tv_quick_fact_dinosaur.text = dinosaurModel?.quictFacts.toString()
    }
}
