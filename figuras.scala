
import scala.math._
object figuras {
  def areaCirculo (rad: Double): Double = {
      pow(rad, 2) * Pi
    }
  
  def perimetroCirculo (rad: Double): Double={
    (2 * math.Pi) * rad
  }
  
  def areaTriangulo (b: Double, h: Double): Double={
    b * h / 2
  }
  
  def perimetroTriangulo(l1: Int, l2: Int, l3: Int): Int={
    l1 + l2 + l3
  }
  
  def areaRectangulo(b: Int, h: Int): Int={
    b * h
  }
  
  def perimetroRectangulo(b: Int, h: Int): Int={
    (b+h) * 2
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingresa radio del circulo")
    val rad = readDouble()
   println("Area del circulo= "+  areaCirculo(rad))
   println("Perimetro del ciruclo= " + perimetroCirculo(rad))
   
   println("Ingresa la base del triangulo")
   val base = readDouble()
   println("Ingresa la altura del triangulo")
   val altura = readDouble()
   println("Area del triangulo= " + areaTriangulo(base, altura))
   
   println("Ingresa primer lado del triangulo")
   val l1= readInt()
   println("Ingresa segundo lado del triangulo")
   val l2= readInt()
   println("Ingresa tercer lado del triangulo")
   val l3= readInt()   
   println("Perietro del triangulo: " + perimetroTriangulo(l1, l2, l3))
   
   println("Ingresa la base del rectangulo")
   val b = readInt()
   println("Ingresa la altura del triangulo")
   val h = readInt()
   println("Area del rectangulo= " + areaRectangulo(b, h))
   
    println("Ingresa la base del rectangulo")
   val b1 = readInt()
   println("Ingresa la altura del triangulo")
   val h1 = readInt()
   println("Area del rectangulo= " + perimetroRectangulo(b1, h1))
   
   
  }
  
}