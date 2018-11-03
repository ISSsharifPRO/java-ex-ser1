import java.util.Scanner;

public class question5ver2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int mab = s.nextInt();
		int num1 = s.nextInt();
		int num2 = s.nextInt();

		int a = (num1<num2)? num1 : num2;
		int b = (num1>=num2)? num1 : num2;

		String n1 = mabna(mab,a);
		String n2 = mabna(mab,b);
		
		System.out.println(shba(n1,n2));
	}
	public static String mabna(int mab , int num){
		int j=num;
		String out="";

		while(j>=1){
			String q = j%mab+"";
			j /= mab;
			if(q.length()==1){
				out += "0"+q+" ";
			}
			else{
				out += q+" ";
			}
		}
		return out;
	}
	public static Integer shba(String n_1 , String n_2){
		int shabahat=0;
		for(int k=1; k<=n_1.length()/3; k++){
			if(n_1.charAt(3*k-2)==n_2.charAt(3*k-2) && n_1.charAt(3*k-3)==n_2.charAt(3*k-3))
				shabahat++;
		}
		return shabahat;
	}
}