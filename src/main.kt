fun main(){
    helloname()
    remainder(479, 11)
    sum(34, 75, 67, 95)
    interesting()
}
fun helloname(){
    val name = "Ashly"
    println("Hello "+name)
}
fun remainder(a:Int, b:Int){
   var modulus = a%b
    println(modulus)
}
fun sum(a:Int, b:Int, c:Int, d:Int){
   var sum = (a + b + c + d)
    println(sum)
}
fun interesting(){
   println("I can read more than five hundred chapters of a novel in a day")
}