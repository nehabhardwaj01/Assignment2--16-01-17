object AddList extends App {				 
 val listOne = List(10,20,30) 
 val listTwo = List(1,2,3) 
 val sumList = for { 
		index <- 0 to listOne.length-1 		   //List iteration
		newList = listOne(index) + listTwo(index) //Adding corresponding
								//elements

		} yield newList				   //Retrieve newList and Store it into sumList
println(s"List after addition : $sumList") 
}

