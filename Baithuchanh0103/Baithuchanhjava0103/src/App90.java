import java.util.Scanner;

public class App90 {
	public static void main(String[] args) throws Exception {
		Scanner sc90 = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String chuoi = sc90.nextLine();
		System.out.println("Chuoi vua nhap la: ");
		for(int i = 0; i < chuoi.length(); i++) {
			System.out.println(chuoi.charAt(i));
		}
		sc90.close();
	}
}