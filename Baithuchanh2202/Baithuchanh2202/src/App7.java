import java.util.Scanner;

public class App7 {
	public static void main(String[] args) throws Exception {
		Scanner bai7 = new Scanner(System.in);	
		float n, max=0;
		do {
			System.out.println("Nhap so thuc: ");
			n = bai7.nextFloat();
			if (n> max) {
				max = n;
			}
		}
		while(n!=0);
		System.out.println("So lon nhat trong cac so vua nhap la: " + max);

        bai7.close();
	}
}
