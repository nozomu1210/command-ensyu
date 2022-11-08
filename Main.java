import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);		
	System.out.print("g’·‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
	double height =sc.nextDouble();		
	System.out.print("‘Ìd‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
	double weight =sc.nextDouble();
	double bmi=weight/Math.pow(height,2);
	System.out.println("BMI‚Í"+(String.format("%.2f",bmi))+"‚Å‚·B");
	}
}
