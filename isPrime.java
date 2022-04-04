public class Main{
	public static void main(String args[]) {
		int n,i;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<=1) {
			System.out.println(n+" is not a prime");
		}
		else {
			for(i=2	;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					flag=false;break;
				}
			}
			if (flag) {
				System.out.println(n+" is a prime");
			}
			else {
				System.out.println(n+" is not a prime");
			}
		}
	}
}
