package com.example.edgar.model

data class Produto(
    val produtoName: String,
    val marca: String,
    val date: String,
    var selected: Boolean = false
)

class produtoBuilder{
    var produtoName: String = ""
    var marca: String = ""
    var date: String = ""

    fun build() : Produto = Produto(produtoName, marca, date, false)
}

fun produtoGenerate(block: produtoBuilder.() -> Unit): Produto = produtoBuilder().apply(block).build()

fun fakeProdutos() = mutableListOf(
    produtoGenerate {
        produtoName = "Protetor Solar"
        marca = "La Roche Posay"
        date = "maio/2026"
    },
    produtoGenerate {
        produtoName = "Arroz"
        marca = "Tio João"
        date = "julho/2022"
    },
    produtoGenerate {
        produtoName = "Pão Francês"
        marca = "Wickbold"
        date = "julho/2021"
    },
    produtoGenerate {
        produtoName = "Cerveja"
        marca = "Colorado"
        date = "Janeiro/2022"
    },
    produtoGenerate {
        produtoName = "Sabonete Facial"
        marca = "Vichy"
        date = "maio/2025"
    },
    produtoGenerate {
        produtoName = "Feijão"
        marca = "Maximo"
        date = "julho/2022"
    },
    produtoGenerate {
        produtoName = "Pão Doce"
        marca = "Mercado"
        date = "Abril/2021"
    },
    produtoGenerate {
        produtoName = "Suco"
        marca = "Del Valle"
        date = "Janeiro/2023"
    },
)