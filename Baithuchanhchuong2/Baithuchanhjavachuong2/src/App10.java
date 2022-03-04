import java.util.Scanner;

public class App10 {
	public static void main(String[] args) throws Exception {
		Scanner sc10 = new Scanner(System.in);
		String chuoi;
		char kitu;
		int dem = 0;
		do {
			System.out.println("Nhap chuoi bat ky: ");
			chuoi = sc10.nextLine();
		}
		while(chuoi.length() > 80);
		System.out.println("Nhap vao ky tu bat ky: ");
		kitu = sc10.next().charAt(0);
		char mang[] = chuoi.toCharArray();
		for(int i = 0; i < mang.length; i++) {
			if(mang[i]==kitu) {
				dem++;
			}
		}
		System.out.println("co " + dem + " ky tu " + kitu + " trong chuoi vua nhap");
		
        sc10.close();
	}
}