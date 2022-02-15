import java.util.Scanner;

public class app40 {
    public static void main(String[] args) throws Exception {
        Scanner sc3 = new Scanner(System.in);
        int day;
        System.out.println("Nhập số: ");
        day = sc3.nextInt();
        switch(day){
            case 0: System.out.println("Hôm nay là chủ nhật");
            break;
            case 1: System.out.println("Hôm nay là thứ hai");
            break;
            case 2: System.out.println("Hôm nay là thứ ba");
            break;
            case 3: System.out.println("Hôm nay là thứ tư");
            break;
            case 4: System.out.println("Hôm nay là thứ năm");
            break;
            case 5: System.out.println("Hôm nay là thứ sáu");
            break;
            case 6: System.out.println("Hôm nay là thứ bảy");
            break;
            default: System.out.println("Nhập số ngày không đúng!!");
        }
         sc3.close();
    }
}
