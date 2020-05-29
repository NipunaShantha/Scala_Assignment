object theater{
    def attendees(p:Int):Int=120+((15-p)*4);

    def cost(p:Int):Int=500+(3*attendees(p));

    def main(args:Array[String]){
      println("Profit Calculator");
      println("");
      print("Enter the price of a ticket => ");
      val p=scala.io.StdIn.readInt();
      val profit=(p*attendees(p))-cost(p); 
      println("Profit = "+profit);
    }
}
