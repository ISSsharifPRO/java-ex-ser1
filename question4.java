import java.util.Scanner;

public class question4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int k=1 ; k<=num ; k++){
			if (is_fibo(k)) {
				System.out.print("O");
			}
			else{
				System.out.print("o");
			}
		}
	}

	public static Boolean is_fibo(int f){
		Boolean out = false;
		int i=1;
		while(f>=fibo(i)){
			if (f == fibo(i)) {
				out = true;
				break;
			}else{
				i++;
			}
		}
		return out;
	}
	public static Integer fibo(int i){
			int out=0;
			if (i==1){
				out += 1;
			} 
			if (i==2) {
				out += 2;
			}
			if (i>=3) {
				out = fibo(i-1)+fibo(i-2);
			}
			return out;
	}


}