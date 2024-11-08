package com.example.realestateapp.data

import android.content.Context
import com.example.realestateapp.R
import com.example.realestateapp.model.Cell

class DataSource(val context: Context) {

fun getSellerNameList() : Array<String> {
    return context.resources.getStringArray(R.array.name_array);

}
    fun getAddressList() : Array<String> {
        return context.resources.getStringArray(R.array.address_array);

    }
    fun getRoomCountList() : Array<String> {
        return context.resources.getStringArray(R.array.roomcount_array);

    }
    fun getPriceList() : Array<String> {
        return context.resources.getStringArray(R.array.price_array);

    }

    fun LoadCells() : List<Cell>{
        val sellerList = getSellerNameList();
        val addressList = getAddressList();
        val roomCountList = getRoomCountList();
        val priceList = getPriceList();


        val cells = mutableListOf<Cell>()

        for (i in sellerList.indices){
            cells.add(Cell(sellerList[i],addressList[i],roomCountList[i],priceList[i]))
        }
        return cells
    }
}