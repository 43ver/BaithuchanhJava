import java.util.Scanner;

public class app47 {
    public static void main(String[] args) throws Exception {
        Scanner sc4 = new Scanner(System.in);
        int number, sum = 0;
        do {          
        System.out.println("Nhập vào số nguyên bất kỳ: ");
        number = sc4.nextInt();
            sum +=number;
        } while (sum < 100);
        System.out.println("Tổng các số nguyên vừa nhập là: " + sum);
        sc4.close();
    }
}
