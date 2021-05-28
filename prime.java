import java.util.scanner;
class prime{
  static	void sum(int num) {
	int count=0;
    // System.out.print("Factors of " + num + " are: ");

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
     }else {   	  System.out.println(n+" is prime number");
        sum(n);
    	
    }
  }
}
