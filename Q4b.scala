object Q4b extends App {
    def attendees(price:Int):Int=120+(15-price)/5*20
    def revenue(price:Int):Int = attendees(price)*price
    def cost(price:Int):Int=500+(attendees(price)*3)
    def profit(price:Int):Int =revenue(price)- cost(price)
    println(profit(10), profit(15),profit(20))

    val m1 = List(profit(10), profit(15),profit(20)) 
    val result = m1.max
    println("Maximum profit is Rs." +result)
}