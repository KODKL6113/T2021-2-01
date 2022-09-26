import java.util.Scanner;

public class Programme3java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		if(a%2==0) {
			a=a-1;
		}
		int i=0;
		int j=0;
		while(i<a) {
			if(j%2!=0) {
				System.out.println(j);
				i++;
				j++;
			}
			j++;
		}
	}

}
