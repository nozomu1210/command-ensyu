import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);		
	System.out.print("1�l�ڂ̐g������͂��Ă�������:");
	double height =sc.nextDouble();		
	System.out.print("1�l�ڂ̑̏d����͂��Ă�������:");
	double weight =sc.nextDouble();

	System.out.print("2�l�ڂ̐g������͂��Ă�������:");
	double height2=sc.nextDouble();
	System.out.print("2�l�ڂ̑̏d����͂��Ă�������:");
	double weight2=sc.nextDouble();

	double bmi=weight / Math.pow(height,2);
	double bmi2=weight2 / Math.pow(height2,2);

	System.out.println("1�l�ڂ�BMI��"+(String.format("%.2f",bmi))+"�ł��B");
	System.out.println("2�l�ڂ�BMI��"+(String.format("%.2f",bmi2))+"�ł��B");
	}
}
