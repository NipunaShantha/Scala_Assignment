
object salary {
    def normalH(H:Int):Int=(H*150);

    def otH(H:Int):Int=(H*75);

    def tax(H1:Int,H2:Int):Double=(normalH(H1)+otH(H2))*0.1;

    def main (args:Array[String]){
      println("Salary Calculator");
      val emp_sal=normalH(40)+otH(20)-tax(40,20);
      println("Takehome Salary of a Employee = "+emp_sal);
    }
}
