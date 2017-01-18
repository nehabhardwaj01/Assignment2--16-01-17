class Area { 
  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String = s"Area of $shape is ${f(first, second)}" 
} 
object Area extends App { 
	val areaobj = new Area() 
	val shape = "Rectangle" 
	shape match{ 
	case "Rectangle" =>   
		println(areaobj.area("Rectangle", 5, 4, (x,y)=> x*y)) 
	case "Rhombus" => 
		println(areaobj.area("Rhombus", 5, 4, (x,y)=> x*y)) 
	case "Parallelogram"=>   
		println(areaobj.area("Parallelogram", 5, 4, (x,y)=> x*y/2)) 
	} 
}

