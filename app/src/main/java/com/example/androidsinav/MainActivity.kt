package com.example.androidsinav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.coroutines.coroutineContext
import com.example.androidsinav.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val adapterFirst = AdapterFirst()
    var sayiList: ArrayList<Int> = arrayListOf()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)*/
        for(i in 0..100){
            sayiList.add((0..100).random())

        }
        binding.apply {

            rv_num_list.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
            rv_num_list.adapter = adapterFirst
            adapterFirst.datayiAl(sayiList)
        }

    }
}