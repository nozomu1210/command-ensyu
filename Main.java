import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);		
	System.out.print("身長を入力してください:");
	double height =sc.nextDouble();		
	System.out.print("体重を入力してください:");
	double weight =sc.nextDouble();
	double bmi=weight/Math.pow(height,2);
	System.out.println("BMIは"+(String.format("%.2f",bmi))+"です。");
	}
}
