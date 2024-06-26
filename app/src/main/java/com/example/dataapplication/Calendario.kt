package com.example.dataapplication;

import java.text.SimpleDateFormat
import java.util.*;
class Calendario {
    private var data: Calendar = Calendar.getInstance();
    fun diaDaSemana(): String {
        val diasDaSemana = arrayOf("Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado")
        return diasDaSemana[this.data.get(Calendar.DAY_OF_WEEK) - 1 ]
    }

    fun diaDaSemanaAlternativo(dia: Int, mes: Int, ano: Int): String {
        val diasDaSemana = arrayOf("Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado")
        data.set(ano, mes - 1, dia) // Mês começa do zero no Calendar
        return diasDaSemana[data.get(Calendar.DAY_OF_WEEK) - 1 ]
    }

    fun dataAtual(): String {
        val dia = data.get(Calendar.DAY_OF_MONTH)
        val mes = data.get(Calendar.MONTH) + 1 // Mês começa do zero no Calendar
        val ano = data.get(Calendar.YEAR)
        return String.format("%02d/%02d/%d", dia, mes, ano)
    }

    fun formatoHoras(time: Date): String {
        val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        return dateFormat.format(time)
    }

}
