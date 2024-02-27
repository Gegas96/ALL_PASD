import java.util.Scanner;

public class Perulangan11 {
    public static void main(String[] args) {
        
        Scanner gs = new Scanner(System.in);
        Long nim;
        int n;

        System.out.print("Masukkan NIM: ");
        nim = gs.nextLong();
        System.out.println("===============");
        
        n = (int) (nim % 100);      
        if (n < 10) {
            n += 10;
        }
        System.out.println("n: " +n);
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
        gs.close();
    }
}
