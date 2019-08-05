package com.singpaulee.submission_android_pemula_dicoding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import com.singpaulee.submission_android_pemula_dicoding.adapter.DinosaurCatalogAdapter
import com.singpaulee.submission_android_pemula_dicoding.helper.DinosaurBank
import com.singpaulee.submission_android_pemula_dicoding.model.DinosaurModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    var layoutManager : GridLayoutManager? = null
    var adapterDinosaur : DinosaurCatalogAdapter? = null
    var listDinosaur : ArrayList<DinosaurModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listDinosaur = DinosaurBank.listDinosaurTriassic

        main_rv_dinosaur_catalog.hasFixedSize()
        layoutManager = GridLayoutManager(this, 2)
        adapterDinosaur = DinosaurCatalogAdapter(this, listDinosaur)
        main_rv_dinosaur_catalog.layoutManager = layoutManager
        main_rv_dinosaur_catalog.adapter = adapterDinosaur

        Log.d(TAG, "Size of list : ${listDinosaur?.size}")
    }
}
