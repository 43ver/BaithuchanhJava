import java.util.Scanner;

public class App8 {
    public static void main(String[] args) throws Exception {
		Scanner sc8 = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu: ");
		int n = sc8.nextInt();
		int arr[] = new int [n];
		double sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap so thu " +(i + 1) +" : ");
			arr[i] = sc8.nextInt();
		}
		for(int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Trung binh cong cac so vua nhap la: " + (sum / n));
	
		sc8.close();
	}
}