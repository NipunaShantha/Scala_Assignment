object Bank extends App{

	val acc1 = new account("12345", 11111, 19780)
	val acc2 = new account("67898", 22222, 100000)
	val acc3 = new account("77885", 55555, -285000)
	var bank: List[account] = List(acc1, acc2,acc3)

	for(temp<-bank){
		println(temp)
	}

	val negetiveBal = bank.filter(x => x.balance<0)
	val Bal  = bank.reduce((x, y) => x.add(y))

	val positiveBal = bank.filter(x => x.balance>0)
	val interest1 = negetiveBal.map(x => x.mulx)
	val interest2 = positiveBal.map(x => x.muly)
	bank = List.concat(interest1, interest2)

	println("Negative balance Accounts")
	for(temp<-negetiveBal){
		println(temp)
	}
	println("Sum of all accounts ======> " + (Bal.balance * 100).round / 100.toDouble)
	println("All acounts balances")
	for(temp<-bank){
		println(temp)
	}

}

class account(nic: String, account: Int, Bal: Double){
	val id = nic
	val acc = account
	var balance = Bal
	def add(r: account) = new account(this.id, this.acc, this.balance + r.balance)
	def mulx = new account(this.id, this.acc, this.balance + this.balance * 0.1)
	def muly = new account(this.id, this.acc, this.balance + this.balance * 0.05)

	override def toString = s"($id, $acc, $balance)"
}
