

object meses {
  
  
  def main(args: Array[String]): Unit = {
    println("Ingresa el numero de mes")
    val mes = readInt()
    
    if (mes==1 || mes==3 ||mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
      println("31 dias")
    
    if (mes==4 || mes==6 || mes==9 || mes==11)
    println("38 dias")
    
    if (mes==2)
      println("28 dias")
  }
}