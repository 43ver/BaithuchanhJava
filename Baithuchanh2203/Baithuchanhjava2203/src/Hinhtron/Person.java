package Hinhtron;

import java.util.Scanner;

public class Person {
    String PersonID, PersonName, Genderr, Address;
    Boolean Gender;
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập ID người dùng: ");
        PersonID = sc.nextLine();
        System.out.println("Mời nhập tên người dùng: ");
        PersonName = sc.nextLine();
        System.out.println("Mời nhập giới tính người dùng (nam/nu): ");
        Genderr = sc.nextLine();
        if(Genderr == "nam") {
            Gender = true;
        }else{
            Gender = false;
        }
        System.out.println("Mời nhập địa chỉ người dùng: ");
        Address = sc.nextLine();
        sc.close();
    }
    public void inThongTin() {
        System.out.println("Thông tin người dùng:\n");
        System.out.println("ID: " + PersonID);
        System.out.println("Tên: " + PersonName);
        if(Gender == false){
            System.out.println("Giới tính: Nam");
        }else{
            System.out.println("Giới tính: Nữ");
        }
        System.out.println("Địa chỉ: " + Address);
    }
}
