import java.util.Scanner;
public class CircleRadius{
	public static void main(String[] args){
		double r,pi=3.14 ;
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		r=sc.nextDouble();
		System.out.println("1. area of circle");
		System.out.println("2. circumference of circle");
		System.out.println("3.volume of sphere");
		System.out.println("enter the choice");
		choice=sc.nextInt();
		switch(choice){
			case 1:System.out.println("area="+(pi*r*r));
				break;
			case 2:System.out.println("circumferance="+(2*pi*r));
				break;
			case 3:System.out.println("volume="+(4/3)*(pi*r*r*r));
				break;
			default:System.out.println("invalid choice");
		}
	}
}