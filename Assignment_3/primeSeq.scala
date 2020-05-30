
object primeSeq{
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


    def seq(num:Int){
       if(num!=0 && num!=1){
          if(prime(num)==true){
             println(num);
             seq(num-1);
          }
          else{
             seq(num-1);
          }
       }
    }

    def main(args:Array[String]){
       print("Enter the value of n => ");
       var num = scala.io.StdIn.readInt();
       seq(num);
    }
}
