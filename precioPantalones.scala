
import scala.math._
object precioPantalones {
  def obtenerPrecio(Pantalones: Int): Double ={
    Pantalones * 356.82
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingresa el numero de pantalones")
    val p = readInt()
    if(p < 5)
      println("Total a pagar: " + obtenerPrecio(p))
    if (p >=5 && p < 12)
    println("Total a pagar: " + (obtenerPrecio(p) / 15))  
    if (p > 12)
    println("Total a pagar: " + (obtenerPrecio(p) / 30))  
  }
}

