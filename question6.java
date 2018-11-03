import java.util.Scanner;

public class question6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		System.out.println(mix3(num));
	}		

	public static String mix3(String num){
		String out_finall = "";
		if(num.length() <= 6)
			out_finall = mix2(num);
		if (num.length() == 7) 
			out_finall=n12(num.charAt(0)+"")+" million, "+mix2(num.substring(1,7));
		if (num.length() == 8) 
			out_finall = n12(num.charAt(0)+""+num.charAt(1))+" million, "+mix2(num.substring(2,8));
		if (num.length() == 9) 
			out_finall = mix1(num.substring(0,3))+" million, "+mix2(num.substring(3,9));
		return out_finall;
	}

	public static String mix2(String num){
		String out2="";
		if(num.length() <= 3)
			out2 = mix1(num);
		if (num.length() == 4){
			if(num.substring(0,1).toString().trim().equals("0")){

			}
			else{
			  out2 = mix1(num.substring(0,1))+" thousand";
				if(num.substring(1,4) != "")
				out2 += ", ";
			
			}
			out2 += ""+mix1(num.substring(1,4));
		}
		if (num.length() == 5){
			if(num.substring(0,2).toString().trim().equals("00")){

			}
			else{
			  out2 = mix1(num.substring(0,2))+" thousand";
			if(num.substring(2,5) != "")
				out2 += ", ";
			
			}
			out2 += ""+ mix1(num.substring(2,5));
		}


		if (num.length() == 6){
			if(num.substring(0,3).toString().trim().equals("000")){

			}
			else{
			  out2 = mix1(num.substring(0,3))+" thousand";
			if(num.substring(3,6) != "")
				out2 += ", ";
			
			}
			
			out2 += ""+mix1(num.substring(3,6));
		}
		return out2;
	}
	public static String mix1(String num){
		String out_f="";
		if (num.length()==1 || num.length()==2) {
			out_f = n12(num);
		}
		if (num.length()==3){
			String t_n = num.charAt(1)+""+num.charAt(2)+"";
			out_f = n3(num.charAt(0))+" "+n12(t_n);
		}
		return out_f;
	}

	public static String n3 (char s){
		String out3="";
		if(s=='1')
			out3 = "one hundred";
		if(s=='2')
			out3 = "two hundred";
		if(s=='3')
			out3 = "three hundred";;
		if(s=='4')
			out3 = "four hundred";
		if(s=='5')
			out3 = "five hundred";
		if(s=='6')
			out3 = "six hundred";
		if(s=='7')
			out3 = "seven hundred";
		if(s=='8')
			out3 = "eight hundred";
		if(s=='9')
			out3 = "nine hundred";
		return out3;
	}
	public static String n12 (String num){
		String out="" , out2="" , out3="";
		char a=' ',b=' ',s=' ';

		if (num.length()==1) {
			b=num.charAt(0);
		}
		if (num.length()==2) {
			a=num.charAt(0);
			b=num.charAt(1);
		}

		if(b=='1'&& a != '1')
			out = "one";
		if(b=='2'&& a != '1')
			out = "two";
		if(b=='3'&& a != '1')
			out = "three";
		if(b=='4'&& a != '1')
			out = "four";
		if(b=='5'&& a != '1')
			out = "five";
		if(b=='6'&& a != '1')
			out = "six";
		if(b=='7'&& a != '1')
			out = "seven";
		if(b=='8'&& a != '1')
			out = "eight";
		if(b=='9'&& a != '1')
			out = "nine";
// 10 ta 19
		if(b=='0' && a == '1')
			out = "ten";
		if(b=='1' && a == '1')
			out = "eleven";
		if(b=='2' && a == '1')
			out = "twelve";
		if(b=='3' && a == '1')
			out = "thirteen";
		if(b=='4' && a == '1')
			out = "fourteen";
		if(b=='5' && a == '1')
			out = "fifteen";
		if(b=='6' && a == '1')
			out = "sixteen";
		if(b=='7' && a == '1')
			out = "seventeen";
		if(b=='8' && a == '1')
			out = "eighteen";
		if(b=='9' && a == '1')
			out = "nineteen";
// 20 , 30 , ... , 90
		if (a == '2')
			out2="twenty";
		if (a == '3')
			out2="thirty";
		if (a == '4')
			out2="forty";
		if (a == '5')
			out2="fifty";
		if (a == '6')
			out2="sixty";
		if (a == '7')
			out2="seventy";
		if (a == '8')
			out2="eighty";
		if (a == '9')
			out2="ninety";

	String fl="";
	if (out2 != "") {
		fl= out2+"-"+out;
	}
	if (out2=="" && out != "") {
		fl = out;
	}
		return fl;
	}
}
