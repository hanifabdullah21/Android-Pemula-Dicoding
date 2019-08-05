package com.singpaulee.submission_android_pemula_dicoding.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.singpaulee.submission_android_pemula_dicoding.R
import com.singpaulee.submission_android_pemula_dicoding.model.DinosaurModel
import kotlinx.android.synthetic.main.item_dinosaur.view.*


class DinosaurCatalogAdapter(val context: Context, val listDinosaur: ArrayList<DinosaurModel>?) :
    RecyclerView.Adapter<DinosaurCatalogAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_dinosaur, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDinosaur!!.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bind(context, listDinosaur?.get(p1))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("CheckResult")
        fun bind(context: Context, dinosaur: DinosaurModel?) {
            Glide.with(itemView.context)
                .load(dinosaur?.image.toString())
                .into(itemView.idi_iv_dinosaur)

            itemView.idi_tv_name_dinosaur.text = dinosaur?.name.toString()

            Log.d("DinosaurAdapter", dinosaur.toString())
        }
    }
}