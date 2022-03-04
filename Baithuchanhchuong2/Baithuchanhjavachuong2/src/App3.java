import java.util.Scanner;

public class App3 {
	public static void main(String[] args) throws Exception {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhap ten cua ban: ");
		String ten = sc3.nextLine();
		System.out.println("Nhap nam sinh: ");
		int n = sc3.nextInt();
		if(2022 - n < 16) {
		    System.out.println("Ban " + ten + " o tuoi vi thanh nien");
		} else if(2022 - n >= 16 && 2022 - n< 18) {
					System.out.println("Ban " + ten + " o tuoi truong thanh");
				} else {
		    	    System.out.println("Ban " + ten + " da gia");
		        }
              sc3.close();
	}
}