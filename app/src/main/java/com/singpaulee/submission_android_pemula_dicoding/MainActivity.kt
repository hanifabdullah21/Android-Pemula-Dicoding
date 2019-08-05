package com.singpaulee.submission_android_pemula_dicoding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_cv_triassic.setOnClickListener(this)
        main_cv_jurassic.setOnClickListener(this)
        main_cv_cretaceous.setOnClickListener(this)
        main_iv_about.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            main_cv_triassic -> startActivity(intentFor<CatalogDinosaurActivity>("periode" to "Triassic"))
            main_cv_jurassic -> startActivity(intentFor<CatalogDinosaurActivity>("periode" to "Jurassic"))
            main_cv_cretaceous -> toast("Maaf menu ini masih dalam pengembangan")
            main_iv_about -> startActivity(intentFor<AboutAppActivity>())
        }
    }
}
