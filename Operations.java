import java.util.Scanner;
public class Operations{
	public static void main(String[] args){
		int num1,num2;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1");
		num1=sc.nextInt();
		System.out.println("enter the num2");
		num2=sc.nextInt();
		System.out.println("enter the operator(+,-,*,/)");
		op=sc.next().charAt(0);
		switch(op){
			case '+':System.out.println("result ="+(num1+num2));
				break;
			case '-':System.out.println("result ="+(num1-num2));
				break;
			case '*':System.out.println("result ="+(num1*num2));
				break;
			case '/':if(num2!=0)
				System.out.println("result ="+(num1+num2));
				else
				System.out.println("invalid num2");
				break;
			default:System.out.println("invalid operator");
		}
	}
}
		

			
		