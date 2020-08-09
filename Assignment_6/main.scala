object Solution extends App{
    val p1 = Point(1,3);
    val p2 = Point(5,8);

    println(p1);
    println(p2);
    print("Question 1 :");
    println(p1 + p2);
  
    print("Question 2 :");
    println(p1.move(5,6));
  
    print("Question 3 :");
    println(p1.distance(5,8));
  
    print("Question 4 :");
    println(p2.invert());
}

case class Point(a:Int,b:Int){
    def x:Int = a;
    def y:Int = b;

    def +(p:Point) = Point(this.x + p.x,this.y + p.y);

    def move(dx:Int,dy:Int) = Point(this.x+dx, this.y+dy);

    def distance(dx:Int,dy:Int)= scala.math.sqrt(scala.math.pow(this.x - dx, 2) + scala.math.pow(this.y - dy, 2))

    def invert() = Point(this.y,this.x)
}