import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner bai4 = new Scanner(System.in);
        int n, i =0;
        int num =0;
        String  primeNumbers = "";
        System.out.println("Nhap vao so n bat ky:");
        n = bai4.nextInt();
        bai4.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Cac so nguyen to nho hon " + n + " la: ");
        System.out.println(primeNumbers);
    }
}
