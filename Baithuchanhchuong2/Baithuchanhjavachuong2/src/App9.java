import java.util.Scanner;

public class App9 {
	public static void main(String[] args) throws Exception {
		Scanner sc9 = new Scanner(System.in);
		System.out.println("Nhap chuoi bat ky: ");
		String chuoi = sc9.nextLine();
		int dem = 0, chuhoa = 0, chuthuong = 0;
		System.out.println("Chuoi vua nhap la: " + chuoi);
		int dodai = chuoi.length();
		for(int i = 0; i < dodai; i++) {
			if(Character.isUpperCase(chuoi.charAt(i))) {
					chuhoa++;
			}
			if(Character.isLowerCase(chuoi.charAt(i))) {
					chuthuong++;
			}
			if(Character.isDigit(chuoi.charAt(i))) {
					dem++;
			}
		}
		int kytu = dodai - chuhoa - chuthuong - dem;
		System.out.println("co " + chuhoa +" ky tu in hoa");
		System.out.println("co " + chuthuong +" ky tu chu thuong");
		System.out.println("co " + dem +" ky tu so");
		System.out.println("co " + kytu +" ky tu khac");

        sc9.close();
	}
}