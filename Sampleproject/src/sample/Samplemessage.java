package sample;

import java.util.Scanner;

public class Samplemessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		int n,r;
		int s=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}
		System.out.println(s);
	}

}
