trait Car:
  def model(model: String): Unit =
    println("The car is model, " + model + "!")

class DefaultCar extends Car

class CustomizableCar(prefix: String, postfix: String) extends Car:
  override def model(name: String): Unit =
    println(prefix + name + postfix)

val car = DefaultCar()
car.model("Audi") 

val customCar=CustomizableCar("This is a new model: ", "!!!")
customCar.model("BMW")
