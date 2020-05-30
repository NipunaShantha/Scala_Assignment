object fibonacci{
    def fibo(n:Int):Int={
        if(n==0)
          0
        else if(n==1)
          1
        else
          fibo(n-1)+fibo(n-2)
    }

    def main(args:Array[String]){
        var a=0;
        print("Enter the value of n => ");
        val n= scala.io.StdIn.readInt();
        println("Fibonacci Series")
        for{a <- 0 to n}{
          print(fibo(a)+" ");
        }
    }
}
