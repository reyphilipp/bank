package bank.kunde.konto

class SparKonto (ktoNummer:String): Konto(ktoNummer) {
    override fun zahleEin(betrag:Double){
        if (betrag < 0){
            return
        }
    }
}