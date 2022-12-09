package com.test.databindingbasicmdjamal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.test.databindingbasicmdjamal.databinding.ActivityMainBinding
import com.test.databindingbasicmdjamal.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var databinding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
//        databinding.apply { p1 = Product("hello") }
//         val productObj = Product("water")
//        databinding.p1 = productObj

//        databinding.p1 = viewModelObj.productObj

//        mainViewModel.txtLiveData.observe(this, {
//            databinding.txtText.text = it
//        })
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        databinding.mainViewModel = mainViewModel
        databinding.lifecycleOwner = this
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}