fun main(args: Array<String>) {
    println("Digite o Ano")
    val ano:Float=readLine()!!.toFloat()


    if (ano % 4 == 0F && ano % 100 == 0F && ano%400==0F)
        { println("Ano Bissexto") }
    else {
        println("Não é Bissexto")
    }


}
