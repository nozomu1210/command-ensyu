import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);		
	System.out.print("1人目の身長を入力してください:");
	double height =sc.nextDouble();		
	System.out.print("1人目の体重を入力してください:");
	double weight =sc.nextDouble();

	System.out.print("2人目の身長を入力してください:");
	double height2=sc.nextDouble();
	System.out.print("2人目の体重を入力してください:");
	double weight2=sc.nextDouble();

	double bmi=weight / Math.pow(height,2);
	double bmi2=weight2 / Math.pow(height2,2);

	System.out.println("1人目のBMIは"+(String.format("%.2f",bmi))+"です。");
	System.out.println("2人目のBMIは"+(String.format("%.2f",bmi2))+"です。");
	}
}
