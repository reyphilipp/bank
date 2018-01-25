package bank.kunde.konto

abstract class Konto(private val ktoNummer:String) {
    private var ktoStand = 0.0

    abstract fun zahleEin(betrag:Double)

    fun gibtKtoStandAus(){
        println(ktoStand)
    }
}