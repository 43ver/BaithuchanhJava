public class app55 {
    public static void main(String[] args) throws Exception {
        int i = 0;
        System.out.println("Các số chia hết cho 5 là: ");
    for(;i <= 20;i++){
        if(i % 5 != 0) {
            continue;
        }
        System.out.println(i);
    }
    }
}