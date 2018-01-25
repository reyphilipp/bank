package client

import bank.kunde.konto.GiroKonto
import bank.kunde.konto.Konto
import bank.kunde.konto.SparKonto

fun main(args: Array<String>) {
    val giro = GiroKonto("123-44")
    val spar = SparKonto("8346-284")


    val kontos = arrayListOf<Konto>(giro, spar)


    for(einKonto in kontos){
        einKonto.zahleEin(22.1)
    }
}