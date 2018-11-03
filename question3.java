import java.util.Scanner;

public class question3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int aa = sc.nextInt();
		int b = sc.nextInt();
		int bb = sc.nextInt();
		int k=0, kk=0 ,m=0 ,j=0 , x1=0,x2=0,n1=0,n2=0;
		if (a<=b) {
			x1=a;
			x2=b;
			n1=aa;
			n2=bb;	
		}
		if (a>b){
			x1=b;
			x2=a;
			n1=bb;
			n2=aa;
		}
		k=n2-x2+x1+n1;

		if((x2)-(n2) >= x1+n1){
 			m=n1+n2;
		}

	/*	if (k<=n1) {
			// 2*(sum of 1 to k)
			m=k*(k+1);
		}
		if (k == n1+1){
			// 2*k + 2*(sum of 1 to k)
			m = k*(k+3);
		}

		if(2*n1-2<=k){
			while(kk != n1){
				kk--;
				m += kk*2;
			}
			//m += kk*(kk+3);
		}*/

		int i=1;
		if(k<=n1){
			while(i<=k){
			m+=2*i;
			i++;
			}
		}
		
		if (k==n1+1) {
			while(i<=k-1){
			m+=2*i;
			i++;
			}
			m+=2*(i-1);
			m--;
		}
		if (k>n1+1) {
			while(i>=1){
				i--;
				m+=2*i;
				m--;
			}
			m += 2*(i);
			while(i<=k-1){
			m+=2*i;
			i++;
			}
		}
		m += x2-x1;
		System.out.println(m);
	}
}