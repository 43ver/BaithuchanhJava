import java.util.Scanner;

public class App74 {
    public static void main(String[] args) throws Exception {
        Scanner sc74 = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc74.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu cua mang: \n");
            for (int i = 0; i < n; i++) {
                System.out.printf("a[%d] = ", i);
                arr[i] = sc74.nextInt();
            }  
        sc74.close();
        System.out.print("Cac phan tu cua mang: ");
        in(arr);
          int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                tong += arr[i] ;
        }
        System.out.print("\n Tong cac phan tu chan trong mang la: " + tong);
    }
    public static void in(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}