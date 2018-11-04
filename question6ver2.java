import java.util.Scanner;
public class question6ver2{
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String num = scanner.nextLine();
	if(!num.toString().trim().equals("0"))
	System.out.println(n1to9(num));
	else
	System.out.print("zero");
}
public static String n1to9(String num){
String out="",  str1="" , str2="";
Boolean b2 = true , b1=true;


if (num.length() <= 6)
	out = n1to6(num,true);

if (num.length() == 7){
	str1 = num.charAt(0)+"";
	str2 = num.substring(1,7);
}	
if (num.length() == 8){
	str1 = num.substring(0,2);
	str2 = num.substring(2,8);
}
if (num.length() == 9){
	str1 = num.substring(0,3);
	str2 = num.substring(3,9);
}
if(str2.toString().trim().equals("000000"))
	b2=false;
if(num.length() >=7){
out += n123(str1);
out += " million";
if(b2)
out += ",";

if(!str2.toString().trim().equals("000000")){
	out += " ";
	out += n1to6(str2,b1);
}
}
return out;
}


public static String n1to6(String num , Boolean b1){
String out="",  str1="" , str2="";
if (num.length() <= 3)
	out = n123(num);

if (num.length() == 4){
	str1 = num.charAt(0)+"";
	str2 = num.substring(1,4);
}	
if (num.length() == 5){
	str1 = num.substring(0,2);
	str2 = num.substring(2,5);
}
if (num.length() == 6){
	str1 = num.substring(0,3);
	str2 = num.substring(3,6);
}
if(num.length() >= 4){
out += n123(str1);
out += " thousand";
if(b1 && !str2.toString().trim().equals("000"))
	out += ",";
if(!str2.toString().trim().equals("000")){
	out += " ";
	out += n123(str2);
}
}
return out;
}


public static String n123(String num){
String out="";
if(num.length()==1 || num.length()==2)
	out = n12(num);
if (num.length()==3) {
	out=n3(num.charAt(0));
	if (num.charAt(1) !='0' && num.charAt(2) != 0)
		out += " ";
	out += n12(num.substring(1,3));
	}
	return out;
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
	if (out2 != ""){
		fl = out2;
		if(out != "")
			fl += "-";
		fl += out;
	} 
	if (out2=="" && out != "")
		fl = out;

	return fl;
	}
}