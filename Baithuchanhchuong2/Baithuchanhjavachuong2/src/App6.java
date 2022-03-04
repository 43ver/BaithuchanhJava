import java.util.Scanner;

public class App6 {
	public static void main(String[] args) throws Exception {
		Scanner sc6 = new Scanner(System.in);
		int n, giaithua = 1;
		do {
			System.out.println("Nhap vao so nguyen duong bat ky: ");
			n = sc6.nextInt();
		}
		while(n <= 0);
		for(int i = 1; i <= n; i++) {
			giaithua = giaithua * i;
		}
		System.out.println("Giai thua so vua nhap la: " + giaithua);
		
        sc6.close();
	}
}