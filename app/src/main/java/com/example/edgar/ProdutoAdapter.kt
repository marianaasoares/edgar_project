package com.example.edgar

import android.graphics.Color
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import com.example.edgar.model.Produto
import kotlinx.android.synthetic.main.produto_item.view.*

class ProdutoAdapter ( val produtos: MutableList<Produto>) : RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.produto_item, parent , false)
        return ProdutoViewHolder(view)
    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.bind(produtos[position])
    }

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(produto: Produto) {
            with(produto) {
                val hash = produto.hashCode()
                itemView.txt_icon.background = itemView.oval(Color.rgb(hash, hash, hash))
                itemView.txt_produto.text = produtoName
                itemView.txt_marca.text = marca
                itemView.txt_date.text = date
            }

        }

    }
}


fun View.oval(@ColorInt color: Int): ShapeDrawable {
    val oval = ShapeDrawable(OvalShape())
    with(oval) {
        intrinsicHeight = height
        intrinsicWidth = width
        paint.color = color
    }
    return oval
}