package com.test.databindingbasicmdjamal.viewModels


import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.test.databindingbasicmdjamal.R
import com.test.databindingbasicmdjamal.models.Product


class MainViewModel : ViewModel() {
    val txtLiveData = MutableLiveData("water what are you doing ???")
    val watar = Product("You Are Water")

    fun clear() {
        txtLiveData.value = ""
    }

    fun updateData() {
        txtLiveData.value = watar.pname
    }

    val imageUrl: String
        get() = "https://i0.wp.com/mundoviajar.com.br/wp-content/uploads/2019/09/turquia-istambul-capadocia.jpg?w=965&ssl=1"

    companion object {

        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(view: ImageView, imageUrl: String?) {
            Glide.with(view.context)
                .load(imageUrl)
                .placeholder(R.drawable.placeholder)
                .into(view)
        }
    }


}