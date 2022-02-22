import java.util.Scanner;

public class App8 {
	public static void main(String[] args) throws Exception {
		Scanner bai8 = new Scanner(System.in);
		int n, max=0;
		do {
			System.out.println("Nhap so nguyen: ");
			n = bai8.nextInt();
			if (n%5 == 0 && n > max) {
				max = n;
			}
		} while (n!=0);
		System.out.println("So lon nhat chia het cho 5 trong cac so vua nhap la: " + max);
		
        bai8.close();
	}
}