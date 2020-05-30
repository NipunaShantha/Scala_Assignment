
object OddEven{
   def isEven(num:Int):String={
      if(num%2==0)
        "Even number"
      else
        "Odd number"
   }

   def num_gen(num:Int){
      print("Enter a number = ");
      var num= scala.io.StdIn.readInt();
      if(num!=0){
        println(isEven(num));
        num_gen(num);
      }
      else
        println("Execution Stopped");
   }

   def main(args:Array[String]){
      num_gen(0);
   }
}
