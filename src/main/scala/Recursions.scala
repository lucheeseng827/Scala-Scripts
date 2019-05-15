object Recursions extends App{
  def someFunctions(x: String) : Unit = {
    println (x)
  }
  someFunctions("hey there")

  def tailFunctions(a:Int) : Int = {
  if (a <= 1) 1
  else 1 * tailFunctions(a-1)
  }
  println(tailFunctions(3))



}
