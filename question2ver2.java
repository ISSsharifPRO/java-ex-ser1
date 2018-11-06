import java.util.Scanner;
public class question2ver2{
public static void main(String[] args) {
	int out=0 , x1=0, n1=0, x2=0, n2=0, q=0;
	Scanner sc = new Scanner(System.in);
	int x_1 = sc.nextInt();
	int n_1 = sc.nextInt();
	int x_2 = sc.nextInt();
	int n_2 = sc.nextInt();

	if (x_1<x_2) {
		x1=x_1;
		x2=x_2;
		n1=(n_1<=n_2)? n_1 : n_2;
		n2=(n_1<=n_2)? n_2 : n_1;
	}
	if (x_1>x_2) {
		x1=x_2;
		x2=x_1;
		n1=(n_1<=n_2)? n_1 : n_2;
		n2=(n_1<=n_2)? n_2 : n_1;
	}

	q=(x1+n1)-(x2-n2);
	if(q<=0)
		out = q;
	if (q>=1 && q<=n1) {
		out += q*(q+1);
	}
	if (q==n1+1) {
		out += n1 * (n1 + 3) -1;
	}
	if (q>n1+1 && q<=2*n1){
		int qm = n1+1;
		for (int k=0; k<q-qm; k++) {
			out += 2*(n1-k-1)-1;
		}
		out += n1 * (n1 + 3) -1;
	}
	if (q>2*n1) {
		int qq = 2*n1;
		int qm = n1+1;
		for (int k=0; k<qq-qm; k++) {
			out += 2*(n1-k-1)-1;
		}
		out += n1 * (n1 + 3) -1+q-2*n1;
	}
	if(x2-n2<x1 && x1+n1>=x2+1)
		out -= 3;

	if(x2-n2<=x1-2 && x1+n1>=x2+1)
		out -= 7;
	System.out.println(out+n1+n2-q);
	}
}