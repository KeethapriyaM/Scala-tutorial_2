object Q4a extends App {
    def normal(hrs:Int):Int=hrs*250
    def ot(hrs:Int):Int=hrs*85
    def salary(x:Int,y:Int):Int=normal(x)+ot(y)
    def tax(salary:Int):Double=salary*.12
    def netSalary(x:Int,y:Int):Double=salary(x,y)-tax(salary(x,y))
    println(netSalary(40,30))
}