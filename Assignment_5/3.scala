object trans extends App{
  val acc1=new account("Acc1",1800167,1000.00)
  val acc2=new account("Acc2",1800168,2000.00)
  println(acc1)
  println(acc2)
  acc1.transfer(acc2,500.00)
  println("Transfered")
  println(acc1)
  println(acc2)
}
class account(id:String,n:Int,b:Double){
  val nic:String=id
  val acnumber:Int=n
  var balance :Double=b
  override def toString= nic + " " +acnumber+ " " +balance
  def withdraw(a:Double)=
    {this.balance=this.balance-a}
  def deposit(a:Double)=
    this.balance= this.balance+a
  def transfer(a:account,b:Double)={
    this.withdraw(b)
    a.deposit(b)
  }
}
