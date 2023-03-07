abstract class Telefon (var nomer: String, var date: String, var time: Int, var kod: Int) : InterfaceTelefon
{
    override fun info(){
        println("выдача информации")
    }

    override fun price(){
        println("стоимость разговора")
    }
}