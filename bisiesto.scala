

object bisiesto {
  
  def main(args: Array[String]): Unit = {
    println("Ingresa el a�o")
    val a = readInt()
    val res = a % 400
    println(res)
    if (res == 0)
      println("A�o bisiesto")
    else 
      println("A�o no bisiesto")
  }
}