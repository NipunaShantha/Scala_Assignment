object cost {
    def main(args:Array[String]){
      println("Cost Calculator")
      println("")
      val book = 24.95;
      val copies = 60
      val discount = book*0.4;
      val ship_cost = (3*50)+(10*0.75)
      val total = ((book-discount)*copies)+ship_cost
      print ("Wholesale Cost = "+total)
    }
}