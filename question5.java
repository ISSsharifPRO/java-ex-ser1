import java.util.Scanner;

public class question5{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int mab = s.nextInt();
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int javab=0;

		String num1_mab = mabna(num1,mab);
		String num2_mab = mabna(num2,mab);

//becouse i can't use from math.min class!!
		if (num1_mab.length() >= num2_mab.length()) {
			javab=str_ch(num2_mab,num1_mab);
		}else{
			javab=str_ch(num1_mab,num2_mab);
		}

		System.out.println(javab);
	}
	public static Integer str_ch(String ss , String sl){
		int shabahat =0 , j=sl.length()-ss.length();
		for (int k=0; k<ss.length(); k++) {
			if (ss.charAt(k)==sl.charAt(j+k)) {
				shabahat++;
			}
		}
		return shabahat;
	}

	public static String mabna(int num , int mab){
		int k = num;
		String ou="" , out="";
		while(k != 0){
			ou += (k%mab)+"";
			k /= mab;
		}
		for (int t=ou.length()-1; t>=0 ; t--) {
			out += ou.charAt(t);
		}
		return out;
	}
}