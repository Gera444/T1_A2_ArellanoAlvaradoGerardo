
import scala.math._
object promedio {
    def obtenerPromedio(n1: Int,n2: Int, n3: Int, n4: Int,n5: Int): Int = {
      (n1 + n2 + n3 + n4 + n5) / 5
    }
    
     
  
  def main(args: Array[String]): Unit = {
    println("Ingresa 5 calificaciones")
    val n1 = readInt()
    val n2 = readInt()
    val n3 = readInt()
    val n4 = readInt()
    val n5 = readInt()
    val prom = obtenerPromedio(n1, n2, n3, n4, n5)
    println("Promedio= " + prom)
    
    if(prom<= 100 && prom>= 90)
      println("Excelente")
    if(prom< 90 && prom>= 80)
      println("Bien")
     if(prom< 80  && prom>= 70)
      println("Regular")
     if(prom< 70)
      println("Terrible")
    
  }
  
}