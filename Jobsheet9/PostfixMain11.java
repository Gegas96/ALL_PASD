import java.util.Scanner;

public class PostfixMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika (infix): ");
        Q = sc.next();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix11 post = new Postfix11(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
        sc.close();
    }
}
