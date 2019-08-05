package com.singpaulee.submission_android_pemula_dicoding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.singpaulee.submission_android_pemula_dicoding.adapter.DinosaurCatalogAdapter
import com.singpaulee.submission_android_pemula_dicoding.helper.DinosaurBank.listDinosaurJurassic
import com.singpaulee.submission_android_pemula_dicoding.helper.DinosaurBank.listDinosaurTriassic
import com.singpaulee.submission_android_pemula_dicoding.model.DinosaurModel
import kotlinx.android.synthetic.main.activity_catalog_dinosaur.*

class CatalogDinosaurActivity : AppCompatActivity() {

    var periode: String? = null
    var listDinosaur : ArrayList<DinosaurModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog_dinosaur)

        periode = intent.getStringExtra("periode")
        cda_tv_periode.text = "Periode $periode"

        getListDinosaurByPeriod(periode)

        cda_rv_dinosaur.hasFixedSize()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val lm = GridLayoutManager(this, 2)
        val adapter = DinosaurCatalogAdapter(this, listDinosaur)
        cda_rv_dinosaur.layoutManager = lm
        cda_rv_dinosaur.adapter = adapter
    }

    private fun getListDinosaurByPeriod(periode: String?) {
        listDinosaur = when(periode){
            "Triassic" -> listDinosaurTriassic
            "Jurassic" -> listDinosaurJurassic
            else -> ArrayList()
        }
    }
}
