
import scala.math._

object IMC {
  
  def obtenerIMC(peso: Int,altura: Double): Double = {
    peso / pow(altura, 2)
  }
  def main(args: Array[String]): Unit = {
    println("Ingresa tu peso")
    val peso = readInt()
    println("Ingresa tu altura")
    val altura = readDouble()
    val imc = obtenerIMC(peso, altura)
    println ("Tu IMC es: " + imc)
    
    if(imc<16 )
      println("Criterio de ingreso en hospital")
    if(imc >= 16 && imc < 17)
      println("Infrapeso")
     if(imc >= 17 && imc < 18)
      println("Bajo peso")
     if(imc >= 18 && imc < 25)
      println("Peso normal (saludable)")
      if(imc >= 25 && imc < 30)
      println("sobrepeso(Obesidad tipo I)")
    if(imc >= 30 && imc < 35)
      println("sobrepeso cronico (Obesidad tipo II)")
     if(imc >= 35 && imc < 40)
      println("obesidad premórbida (Obesidad tipo III)")
     if(imc > 40)
      println("Obesidad Morbida (Obesidad tipo IV)")
    
  }
  
}