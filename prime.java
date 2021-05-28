import java.util.scanner;
class prime{
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
     }
  }
}
