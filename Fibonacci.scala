class Fibonacci 
{ 
     var fib0=1 
     var fib1=1 

     def fib(index:Int):Unit ={ 
	      fib2=fib0+fib1 
      	       fib0=fib1 
     	       fib1=fib2 
      if(index!=0)
	fib(index-1)
}	 
} 
object fib extends App  {
	val fibObj = new Fibonacci()
	val limit = 5
	if(limit==1) 
		println("0") 
	else if(limit==2) 
		println("0" + "1") 
	else 
	{ 
	println(0) 
	println(1) 
 		fibObj.fib(limit-3) 
	} 
} 	 
} 

