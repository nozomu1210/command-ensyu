import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);		
	System.out.print("�g������͂��Ă�������:");
	double height =sc.nextDouble();		
	System.out.print("�̏d����͂��Ă�������:");
	double weight =sc.nextDouble();
	double bmi=weight/Math.pow(height,2);
	System.out.println("BMI��"+(String.format("%.2f",bmi))+"�ł��B");
	}
}
