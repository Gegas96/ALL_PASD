import java.util.Scanner;

public class LinkedList {
    
    ScavengerHunt head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
           System.out.println("-------------------------");
           System.out.println("Daftar Pertanyaan");
           System.out.println("-------------------------");

           ScavengerHunt currentNode = head;

            while (currentNode != null) {
                System.out.println("-->" + currentNode.soal);
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked List kosong!");
        }
    }

    public void addLast(String soal, String kunci) {
        ScavengerHunt newNode = new ScavengerHunt(soal, kunci, null);
        if (head == null) {
            head = newNode;
        } else {
            ScavengerHunt currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void start() {
        Scanner gs = new Scanner(System.in);
        ScavengerHunt currentNode = head;

        int benar = 0;
        int jmlSoal = 0;

        while (currentNode != null) {
            System.out.println("Pertanyaan yang harus dijawab\t: " + currentNode.soal);
            System.out.print("Isi jawaban dari pertanyaan\t: ");
            String jawaban = gs.next();

            if (jawaban.equalsIgnoreCase(currentNode.kunci)) {
                System.out.println("Jawaban benar, lanjut ke soal berikutnya");
                System.out.println();
                benar++;
                currentNode = currentNode.next;

            } else {
                System.out.println("Jawaban salah, coba lagi!");
                System.out.println();
            }
            jmlSoal++;
        }

        System.out.println("-----------");
        System.out.println("SUKSES");
        System.out.println("-----------");
        System.out.println("Skor anda: ");
        System.out.println("Benar: " + benar);
        System.out.println("Salah: " + (jmlSoal - benar));
        System.out.println("Total percobaan: " + (jmlSoal));
        System.out.println();
        System.out.println();
    }

}
