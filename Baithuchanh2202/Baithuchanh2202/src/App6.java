import java.util.Scanner;

public class App6 {
	public static boolean check(int n) {
		int sum=0;
		for (int i = 1; i < n; i++) {
			if (n%i == 0) {
				sum+=i;
			}
		}
		if (n == sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) throws Exception {
        int n;
		Scanner bai6 = new Scanner(System.in);
		System.out.println("Nhap mot so bat ky: ");
		n = bai6.nextInt();
		System.out.println("các số hoàn hảo nhỏ hơn "+n+" là: ");
		for(int i=1;i<n;i++) {
			if(check(i)) {
				System.out.print(i+" ");
			}
		}
        
		bai6.close();
	}
}