
object isPrime{
   def gcd(x:Int, y:Int):Int=y match{
     case 0 => x
     case y if (y>x) => gcd(y,x)
     case _ => gcd(y,x%y) 
   }

   def prime(p:Int,n:Int=2):Boolean=n match{
     case x if(p==x) => true
     case x if(gcd(p,x)>1) => false
     case x => prime(p, x+1)
   }


   def num_gen(num:Int){
      print("Enter a number = ");
      var num= scala.io.StdIn.readInt();
      if(num!=0 && num!=2){
        println(prime(num));
        num_gen(num);
      }
      else
        println("Execution Stopped");
      }

   def main(args:Array[String]){
      num_gen(0);
   }
}
