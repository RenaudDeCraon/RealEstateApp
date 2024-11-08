package com.example.realestateapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.realestateapp.CellDetailActivity
import com.example.realestateapp.R

import com.example.realestateapp.model.Cell

class ItemAdapter(private val data: List<Cell>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view:View):RecyclerView.ViewHolder(view){

        private lateinit var cell: Cell

        val nameView: TextView = view.findViewById(R.id.nameTv)
        val addressView : TextView = view.findViewById(R.id.addressTv)
        val priceView : TextView = view.findViewById(R.id.priceTV)
        val roomCountView : TextView = view.findViewById(R.id.roomCountTV)

        init {
            view.setOnClickListener{
                val context = itemView.context
                val showUserIntent = Intent(context,CellDetailActivity::class.java)
                showUserIntent.putExtra(CellDetailActivity.CELL_NAME, cell.SellerName)
                showUserIntent.putExtra(CellDetailActivity.CELL_ADDRESS, cell.Address)
                showUserIntent.putExtra(CellDetailActivity.CELL_PRICE, cell.Price)
                showUserIntent.putExtra(CellDetailActivity.CELL_ROOMCOUNT, cell.RoomCount)
                context.startActivity(showUserIntent)

            }

        }
        fun bind(cell:Cell){
            this.cell = cell
            nameView.text = cell.SellerName
            addressView.text =cell.Address
            priceView.text=cell.Price
            roomCountView.text = cell.Address


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ItemViewHolder(view)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val cell = data[position]
        holder.nameView.text=cell.SellerName
        holder.addressView.text = cell.Address
        holder.priceView.text = cell.Price
        holder.roomCountView.text = cell.RoomCount


    }
}