class Nas(var _nomer: String, var _date: String, var _time: Int, var _kod: Int): Telefon(_nomer, _date, _time, _kod)
{
    var cena: Int = 5;

    override fun price(){
        println("cтоимость разговора ${_time * cena}")
    }

    override fun info(){
        println("")
        println("номер телефона: $nomer")
        println("дата разговора: $date")
        println("время разговора: $time")
        println("код города: $kod")
    }
}