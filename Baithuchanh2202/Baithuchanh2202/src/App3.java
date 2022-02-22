import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        int temp;
        boolean isPrime=true;
        Scanner bai3= new Scanner(System.in);
        System.out.println("Nhap vao so bat ky: ");
        int num=bai3.nextInt();

        for(int i = 2; i <= num/2; i++)
            {
                temp=num%i;
                if(temp==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(num + " la so nguyen to");
            else
                System.out.println(num + " khong la so nguyen to");
        
        bai3.close();
    }
}
