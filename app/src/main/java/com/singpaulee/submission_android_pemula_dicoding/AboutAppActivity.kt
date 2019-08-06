package com.singpaulee.submission_android_pemula_dicoding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_about_app.*

class AboutAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)

        Glide.with(this).load(R.drawable.sandec_logo).into(aaa_iv_sandec)

        aaa_tv_email.text = Html.fromHtml("<a href=\"mailto:hanifabdullah7@gmail.com\">Kirim Email</a>")
        aaa_tv_email.movementMethod = LinkMovementMethod.getInstance()

        aaa_tv_github.text = Html.fromHtml("<a href=\"https://github.com/hanifabdullah21\">Github saya</a>")
        aaa_tv_github.movementMethod = LinkMovementMethod.getInstance()

        aaa_tv_medium.text = Html.fromHtml("<a href=\"https://medium.com/@hanifabdullah7\">Medium saya</a>")
        aaa_tv_medium.movementMethod = LinkMovementMethod.getInstance()
    }
}
