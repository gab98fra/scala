/*
	Scala documentation: https://docs.scala-lang.org/tour/basics.html

*/
//Variables with val & var 
val var1=13
val var2="String"
val var3: Int=2345
var var4=234
//re-assing value 
var4=2342322

println("This is value of var1: " +  var1)
println("This is value of var2: " +  var2)
println("This is value of var3: " +  var3)
println("This is value of var4: " +  var4)
/*Blocks*/
println ({
  val x = 23+23
  x +23
})

//Type of variable
println(var1.getClass())

/* Fuctions anonymous */
val fn1 = (arg1: Int)=> arg1 +23
println(fn1(567))
val fn2=(arg1: Int , arg2: Int) =>arg1 + arg2
println("This is value: "+fn2(23456, 345))

/* Methods */
def product (arg1: Int, arg2: Int): Int=arg1 * arg2
println("Method product: "+ product(23, 2938))

def getSquareString(input: Double): String =
  val square = input * input
  square.toString
println(getSquareString(2.5))

//classes
class Car(_type: String, year:Int):

	def model(name: String):Unit =
			println(_type + name + year)

val object_car= Car("car: ", 2023)
object_car.model("Audi: ")

