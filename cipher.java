import java.util.scanner;
class cipher{
final int maxc=256;
  	static void getChar(String str)
    {int count[]=new int[maxc];
     int len = str.length();
     
    for (int i = 0; i < len; i++)
        count[str.charAt(i)]++;
      char ch[] = new char[str.length()];
    for (int i = 0; i < len; i++) {
        ch[i] = str.charAt(i);
        int find = 0;
        for (int j = 0; j <= i; j++) {
          //find freq
          if (str.charAt(i) == ch[j])
                find++;
        }

        if (find == 1)
        	 System.out.println(
                     ""
                     + str.charAt(i)
                     + " ->" + count[str.charAt(i)]);
    }
    
}
  public static void main(String arg[]){
String s;
    int x;
    Scanner in=new Scanner(System.in);
   system.ot.println("enter a text");
    s=in.nextLine();
   system.ot.println("analysis:\n");
    getChar(s);
    system.out.println("option:\n 1)take replace \n 2)exit");
    x=in.nextInt();
    if(x==1){
    }elseif(x==2){}else{
    }
}
}
