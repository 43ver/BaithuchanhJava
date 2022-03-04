import java.util.Scanner;

public class App1 {
	public static void main(String[] args) throws Exception {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		int a = sc1.nextInt();
		System.out.println("Nhap so thu hai: ");
		int b= sc1.nextInt();
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a & b = " + (a%b));
		System.out.println("a > b ?: " + (a>b));
		System.out.println("a = b ?: " + (a==b));
		
        sc1.close();
	}
}