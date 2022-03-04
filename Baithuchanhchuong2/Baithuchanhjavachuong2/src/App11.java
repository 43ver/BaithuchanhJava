import java.util.Scanner;

public class App11 {
	public static void main(String[] args) throws Exception {
		Scanner sc11 = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu mang: ");
		int n = sc11.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1) + " : ");
			arr[i] = sc11.nextInt();
		}
		System.out.println("Mang vua nhap la: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for(int i = 0; i < n; i++) {	
            for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}

		System.out.println("Mang sau khi duoc sap xep la: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

        sc11.close();	
	}
}