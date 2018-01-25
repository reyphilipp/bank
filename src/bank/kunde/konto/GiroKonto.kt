package bank.kunde.konto

class GiroKonto(ktoNummer:String): Konto(ktoNummer) {
    override fun zahleEin(betrag:Double){
        if (betrag < 0){
            return
        }
    }
}