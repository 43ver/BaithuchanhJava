package person.student;

import java.util.Scanner;

public class OnlineStudent extends Student{
    public String phuongTien;

    public void nhapPhuongTien() {
        System.out.println("Nhap phuong tien: " + phuongTien);
        Scanner scanner = new Scanner(System.in);
        phuongTien = scanner.nextLine();
        scanner.close();
    }
}
