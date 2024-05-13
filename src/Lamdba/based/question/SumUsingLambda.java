/**
 * 
 */
package Lamdba.based.question;

/**
 * @author deby7 12:36:50 am 2023 Java_8_Features_examples TODO
 */
public class SumUsingLambda {
	public static void main(String[] args) {
		SumFunction sumfunction=(a,b)->a+b;
		int num1=10;
		int num2=100;
		int result=sumfunction.calculate(num1,num2);
		System.out.println("sum of "+num1+" and "+num2 +" := "+result);
		
	}
	interface SumFunction{
		int calculate(int a,int b);
	}
}
