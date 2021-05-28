import java.util.scanner;
class prime{
		//iteration method

		static void nsum(int number) {
	
	int count=0;
	        System.out.print("iteration is: ");

	        for (int i =2; i < number; i++) {

	            if ((number % i != 0) || (number % i == 0))
	            count=count+1;
	            {
	            }

	        }
	        System.out.print(count + " ");


	    }
	//iteration method
  static void sum(int num) {
	int count=0;

     for (int i =1; i < num; i++) {

         if (num % i != 0)
         count=count+1;
         {
         }

     }
        
              System.out.println("\n iteration is  " + count);}
  //method for factors
  static void pf(num){
    for(int i=num ; i >= 2 ; i--)
      if(num % i == 0){
        System.out.println("  "+ num / i);
      }
  }
  public static void main(String arg[]){
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number \n");
    n=in.nextInt();
     if(n % 2==0) {
   	  System.out.println(n+" is composite number and factors are");
  pf(n);
	     nsum(n);
     }else {   	  System.out.println(n+" is prime number");
        sum(n);
    	
    }
  }
}
