package operationusingmethod;

import java.util.Scanner;

public class operationall {
	public static double oper(int a,int b,char c) {
		double d=0;
		if(c=='+') {
			d=a+b;
		}
		else if(c=='-'){
			d=a-b;
		}else if(c=='*') {
			d=a*b;
		}else if(c=='/') {
			d=a/b;
		}else if(c=='%') {
			d=a%b;
		}else {
			System.out.println("Invalid operator sign");
		}
		return d;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char c=sc.next().charAt(0);
		double d=oper(a,b,c);
		System.out.println(d);
		
	}
}
