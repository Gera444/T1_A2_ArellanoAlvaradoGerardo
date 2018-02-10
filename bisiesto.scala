

object bisiesto {
  
  def main(args: Array[String]): Unit = {
    println("Ingresa el año")
    val a = readInt()
    val res = a % 400
    println(res)
    if (res == 0)
      println("Año bisiesto")
    else 
      println("Año no bisiesto")
  }
}