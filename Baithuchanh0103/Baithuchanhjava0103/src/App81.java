import java.util.Scanner;

public class App81 {
	public static void main(String[] args) throws Exception{
		Scanner sc81 = new Scanner(System.in);
		System.out.println("Nhap so dong cua ma tran: ");
		int a = sc81.nextInt();
		System.out.println("Nhap so cot cua ma tran: ");
		int b = sc81.nextInt();
		int arr[][]= new int[a][b];
		int max = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.println("A[" + i + "][" + j + "]= ");
				arr[i][j]= sc81.nextInt();
			}
		}
		System.out.println("Ma tran vua nhap la: ");
		for(int i = 0; i < a; i++) {
			for(int j=0;j<b;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("Phan tu lon nhat trong mang vua nhap la: " + max);
        sc81.close();
	}
}