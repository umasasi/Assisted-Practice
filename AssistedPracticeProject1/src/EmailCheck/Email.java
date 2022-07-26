package EmailCheck;
import java.util.Scanner;
public class Email {

	 static boolean Valid(String Email)
	{
		
         String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
         return Email.matches(regex);
         
	
	
	}
	 public static void main(String args[])
	 {
		 Scanner name = new Scanner(System.in);
		 
		 String Email;
		 int a;
		 for(a=0;a<=1;a++)
		 {
			 System.out.println("Enter your email address");
			 Email = name.next();
			 
			 System.out.println("The email address is : "+Email);
			
			 System.out.println("Email address validity : "+Valid(Email));
			 
			 System.out.println();
			 
		 }
	 }
	


}