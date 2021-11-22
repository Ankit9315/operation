package operationusingmethod;

import java.util.Scanner;

public class methodrelation {
public static void relation(int a,int b) {
	if(a==b) {
		System.out.println(a+" is equal to "+b);
		
	}else if(a>b) {
		System.out.println(a+" is greater than "+b);
		
	}else if(a<b) {
		System.out.println(a+" is less than "+b);
		
	}
}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	relation( a, b);
	}
}
