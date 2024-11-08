package com.example.realestateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.realestateapp.databinding.ActivityCellDetailBinding
import com.example.realestateapp.model.Cell

class CellDetailActivity : AppCompatActivity() {
    companion object{
        const val CELL_NAME = "Name"
        const val CELL_ADDRESS = "Address"
        const val CELL_PRICE= "Price"
        const val CELL_ROOMCOUNT="RoomCount"


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cell_detail)
        val binding : ActivityCellDetailBinding = DataBindingUtil.setContentView(this,R.layout.activity_cell_detail)

        val cellname = intent.getStringExtra(CELL_NAME)
        val celladdress = intent.getStringExtra(CELL_ADDRESS)
        val cellprice = intent.getStringExtra(CELL_PRICE)
        val cellroomcount = intent.getStringExtra(CELL_ROOMCOUNT)

        binding.nameTV.text = cellname
        binding.priceTV.text = cellprice
        binding.addressTV.text = celladdress
        binding.roomCountTV.text = cellroomcount



    }








}