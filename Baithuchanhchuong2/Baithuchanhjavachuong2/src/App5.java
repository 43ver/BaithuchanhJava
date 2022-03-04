import java.util.Scanner;

public class App5 {
	public static void main(String[] args) throws Exception {
		Scanner sc5 = new Scanner(System.in);
		int n, sum = 0;
		do {
			System.out.println("Nhap so nguyen bat ky: ");
			n = sc5.nextInt();
			sum += n;
		}
		while(sum < 100);
		System.out.println("Tong cac so vua nhap la: " + sum);
			
        sc5.close();
	}
}