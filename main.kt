import kotlinx.coroutines.*
import java.lang.NumberFormatException

suspend fun main() = coroutineScope {
    println("cколько будет функций?")
    val n: Int = readln()!!.toInt()
    for(i in 1..n)
    {
        println("введите номер")
        val nomer: String = readln()!!.toString()
        println("введите дату разговора")
        val date: String = readln()!!.toString()

        try
        {
            println("сколько длился разговор")
            val time: Int = readln()!!.toInt()
            if(time <= 0) println("разговор не мог быть меньше 0")

            else
            {
                println("введите код города")
                val kod: Int = readln()!!.toInt()
                if (kod <= 0) println("неправильно введен код города")
                else {
                    var telefon1 = Nas(nomer, date, time, kod)
                    launch{
                        telefon1.price()
                        delay(100)
                    }

                    delay(3000)
                    telefon1.info()
                }
            }
        }

        catch (e: NumberFormatException){
            println("нужно ввести число")
        }
    }
}