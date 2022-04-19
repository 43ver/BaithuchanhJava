package person.student;

import person.Person;
import java.util.Scanner;

public class Student extends Person{
    private int MSV;
    
    public Student() {
        ngheNghiep = "Hoc Sinh";
    }

    public void layThongTin() {
        System.out.println("Nhap ma sinh vien: " + MSV);
        Scanner scanner = new Scanner(System.in);
        MSV = scanner.nextInt();
        scanner.close();

        System.out.println("Nhap ho va ten: " + hoVaTen);
        Scanner scanner1 = new Scanner(System.in);
        hoVaTen = scanner1.nextLine();
        scanner1.close();

        System.out.println("Nhap tuoi: " + tuoi);
        Scanner scanner2 = new Scanner(System.in);
        tuoi = scanner2.nextInt();
        scanner2.close();

        System.out.println("Nhap gioi tinh: " + gioiTinh);
        Scanner scanner3 = new Scanner(System.in);
        gioiTinh = scanner3.nextLine();
        scanner3.close();
    }
}
