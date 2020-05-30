
object add_num{
    def sum(num:Int):Int={
      if(num==1)
        1
      else
        sum(num-1)+num
    }

    def main(args:Array[String]){
      print("Enter the value of n => ");
      val num= scala.io.StdIn.readInt();
      println("");
      println("Sum = "+sum(num));
    }
}
