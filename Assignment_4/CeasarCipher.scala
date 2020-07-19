object CaesarCipher extends App{
    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val E=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
    val D=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)
    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
    val encrypt=cipher(E,"Nipuna",2,alphabet)
    println(encrypt)
    val decrypt=cipher(D,en,2,alphabet)
    println(decrypt)
}
