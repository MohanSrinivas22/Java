import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		int n,i,a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		n=sc.nextInt();
		if (n<=1) {
			System.out.println(0);
		}
		else if(n==2) {
			System.out.println(a+" "+b);
		}
		else {
			System.out.print(a+" "+b);
			for(i=3;i<=n;i++) {
				c=a+b;
				System.out.print(" "+c);
				a=b;b=c;
			}
		}
	}
}
