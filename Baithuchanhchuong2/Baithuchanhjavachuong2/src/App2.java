import java.util.Scanner;

public class App2 {
	public static void main(String[] args) throws Exception {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap so bat ky: ");
		int n = sc2.nextInt();
		if(n % 2 == 0) {
			System.out.println("So vua nhap la so chan");
		} else {
			System.out.println("So vua nhap la so le");
		}
		
        sc2.close();
	}
}