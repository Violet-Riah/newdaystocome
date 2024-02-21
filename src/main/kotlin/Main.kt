fun main() {
    name("Violet")
    var z=division(8,2.0)
    println(z)
    var r=number(3,4.0,6,9.5)
    println(r)
    var l=fact("I am the first Malawian in akiraChix")
    println(l)
}

fun name(name:String){
    var greetings= "hello ${name}"
    println(greetings)

}
fun division(num1:Int, num2:Double):Double{
    var remender= num1%num2
    return remender


}
fun number(num3:Int, num4:Double, num6:Int, num9:Double):Double{
    var result=num3+num4+num6+num9
    return result

}
fun fact(funFact:String):String{
    var text=funFact
    return text

}
