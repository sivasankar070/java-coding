import java.util.Scanner;
class fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num = 1;
		int i = 0;
		System.out.println(i);
		while(i<=n){
			System.out.println(num);
			int a=num;
			num=num+i;
			if(num>n){
				break;
			}
			i=a;
		}
	}
}