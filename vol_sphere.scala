object vol_sphere {
    def main(args:Array[String]){
      println("Volume Calculator")
      println("")
      val r=5
      val Pi=(22:Float)/7
      val vol=(((4:Float)/3)*Pi*r*r*r)
      println("When radius is "+r+",")
      print("The Volume of Sphere is "+vol)
    }
}