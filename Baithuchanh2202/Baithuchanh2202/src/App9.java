import java.util.Scanner;

public class App9 {
	public static void main(String[] args) throws Exception {
        int n, soNguoc = 0;
		Scanner bai9 = new Scanner(System.in);
		System.out.println("Nhap so bat ky: ");
		n = bai9.nextInt();
		while (n > 0) {
			soNguoc = soNguoc * 10 + (n % 10);
			n = n / 10;
		}
		System.out.println("So vua nhap dao nguoc lai la: " + soNguoc);

		bai9.close();
	}
}