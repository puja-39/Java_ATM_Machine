import java.util.Scanner;
import java.util.HashMap;

 public class ATM
 {
	public static void main(String[] args)
	 {
		ATMop obj=new ATMop();
	 }
 }
 class Data
 {
	 float balance;
 }

 class ATMop
 {   //float balance;
	 Scanner sc=new Scanner(System.in);
	 HashMap<Integer,Data> map = new HashMap<>();

	 ATMop()
	 {
		System.out.println("Welcome To Our ATM");
		op();
	 }

     public void op()
	 {  System.out.println("***************************************************************");
		System.out.println("Enters Your Pin Code");
		int pincode = sc.nextInt();

		if (map.containsKey(pincode) == true)
		{
			Data obj = map.get(pincode);
			menu(obj);
		}
		else
		 {  
			System.out.println("*************************************************************");
			System.out.println("Please Creatae Account First");
			System.out.println("Set Your Pin Code");
			int pin = sc.nextInt();
			Data obj=new Data();
			map.put(pin , obj);
            menu(obj);
		 }
	 }


	 public void menu(Data obj)
	 {
		System.out.println("**********************************************************************");
        System.out.println("Plese Enter Valid Number");
		System.out.println("1.  Check Balance");
		System.out.println("2.  Deposit Money");
		System.out.println("3.  Withdraw Mpney");
		System.out.println("4.  Check another Account");
		System.out.println("5.  Exit");

		int x=sc.nextInt();

		if (x==1)
		{
			check_balance(obj);
		}
		else if(x==2)
		 {
			deposit(obj);
		 }
		 else if (x==3)
		 {
			 withdraw(obj);
		 }
		 else if (x==4)
		 {
			 op();
		 }
		 else if (x==5)
		 {
			 System.out.println("Thank You");		
         }
		 else
		 {   System.out.println("**********************************************************************");
			 System.out.println("Please Enter The Valid Number");
			 menu(obj);
		 }
      }
	  public void check_balance(Data obj)
	  { 
		 System.out.println("***************************************************************"); 
		System.out.println("Your Blance  " + obj.balance);
		System.out.println("****************************************************************");
		menu(obj);
	  }

	 public void deposit(Data obj)
	  {
		System.out.println("Enter Your Account");
		float a=sc.nextFloat();

		obj.balance = obj.balance + a;

		System.out.println("Amount Deposited Successfully");
		System.out.println("************************************************************************");
		menu(obj);
	   }

	 public void withdraw(Data obj)
	  {
		System.out.println("Enter Your Amount");
		float a=sc.nextFloat();
         if (obj.balance>=a)
         {
           obj.balance = obj.balance - a;
		   System.out.println("Amount withdeaw Successfully");
		 }
		 else{
              System.out.println("Insufficent balance");
		 }

		System.out.println("************************************************************************");
		menu(obj);
	  }
 }
