import java.util.Scanner;

public class question1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int num =1;
		for (int i =1; i<k ; i++) {
			num += i;
			if (num > k) {
				num -= k;
			}
		if(i != k-1)
		System.out.print(num +" ");
		if(i == k-1)
		System.out.print(num);
		}
	}
}
