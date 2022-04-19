package person.student;

import java.util.Scanner;

public class OfflineStudent extends Student{
    private String diaChi;

    public void nhapDiaChi() {
        System.out.println("Nhap dia chi: ");
        Scanner scanner = new Scanner(System.in);
        diaChi = scanner.nextLine();
        scanner.close();
    }

    public void inDiaChi() {
        System.out.println("Dia chi: " + diaChi);
    }
}
