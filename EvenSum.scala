
object EvenSum{
   def isEven(num:Int):Boolean={
      if(num%2==0)
        true
      else
        false
   }
   def sum(num:Int):Int={
      if(num==1)
        0
      else if(isEven(num)==true)
        sum(num-1)+num
      else
        sum(num-1)
   }

   def main(args:Array[String]){
      print("Enter tha value of n = ");
      var num= scala.io.StdIn.readInt();
      println("Sum = "+sum(num));
   }
}
