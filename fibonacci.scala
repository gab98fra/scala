 def fibonacci(n: Int)={
   	var n1=0
    var n2=1
    var aux=0
    var count=0
		
   if (n==1){1}
   if (n>1){
      while(count < n){
				aux=n1 + n2
        println(n1)
        count +=1
        n1=n2
        n2=aux
      	
      }
    }
   
 }

print(fibonacci(2))
