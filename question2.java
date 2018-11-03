import java.util.Scanner;

public class question2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		long k1=0 , k2=0;

		k1 = s.nextLong();
		k2 = s.nextLong();

		String out_r = "";
		String out_l = "";
		String k2_str = " \""+k2+"\"";
		String k2_str2 = k2_str+ ", " +(k2+1);

		if (k2 >= 4) {
			out_r = "1, ..., "+(k2-1)+",";
		}else{
			if (k2 == 3) {
				out_r = "1, 2,";
			}
			if (k2 == 2) {
				out_r = "1, ";
			}
			if (k2 == 1) {
				out_r = "";
			}
		}

		if (k1-k2 >= 4) {
			out_l = k2_str2 + ", ..., "+k1;
		}else{
			if (k1-k2 == 3) {
				out_l = k2_str+","+(k2+1)+", ..., "+k1;
			}
			if (k1-k2 == 2) {
				out_l = k2_str+", "+(k2+1)+", "+k1;
			}
			if (k1-k2 == 1) {
				out_l = k2_str+", "+k1;
			}
			if (k1-k2 == 0) {
				out_l = k2_str;
			}
		}

		String output = out_r+out_l;
		System.out.println(output);
	}
}
