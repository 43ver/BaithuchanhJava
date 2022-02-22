import java.util.Scanner;

public class App10 {

	public static void main(String[] args) throws Exception {
        int n, dem=0;
		Scanner bai10 = new Scanner(System.in);
		System.out.println("Nhap so n bat ky: ");
		n = bai10.nextInt();
		while(n > 0) {
			dem++;
			n=n/10;
		}
		System.out.println("So vua nhap co " + dem + " chu so");
        
		bai10.close();
	}
}