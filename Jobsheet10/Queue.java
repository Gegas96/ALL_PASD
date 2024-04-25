public class Queue {
    Pembeli11[] data;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new Pembeli11[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Element terdepan: " + data[front].nama + " " + data[front].noId + " "
                    + data[front].umur + " " + data[front].jK);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Element terbelakang: " + data[rear].nama + " " + data[rear].noId + " "
                    + data[rear].umur + " " + data[rear].jK);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + " " + data[i].noId + " " + data[i].umur + " " + data[i].jK);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama + " " + " " + data[i].noId + " " + data[i].umur + " " + data[i].jK);
            System.out.println("Jumlah element = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikossongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli11 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Pembeli11 Dequeue() {
        Pembeli11 dt = new Pembeli11();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public int peekPosition(String nama) {
        if (IsEmpty()) {
            return -1;
        }
        int i = front;
        int position = 0;
        while (i != rear) {
            if (data[i].nama.equals(nama)) {
                System.out.println("Nama: " + data[i].nama + " No Id: " + data[i].noId + " Umur: " + data[i].umur
                        + " Jenis Kelamin: " + data[i].jK);
                return position;
            }
            position++;
            i = (i + 1) % max;
        }

        if (data[i].nama.equals(nama)) {
            System.out.println("Nama: " + data[i].nama + "No Id: " + data[i].noId + "Umur: " + data[i].umur
                    + "Jenis Kelamin: " + data[i].jK);
            return position;
        }
        return -1;
    }

    public void daftarPasien() {
        if (IsEmpty()) {
            System.out.println("Daftar pasien masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + data[i].nama + "No Id: " + data[i].noId + "Umur: " + data[i].umur
                        + "Jenis Kelamin: " + data[i].jK);

                i = (i + 1) % max;
            }
            System.out.println("Nama: " + data[i].nama + "No Id: " + data[i].noId + "Umur: " + data[i].umur
                    + "Jenis Kelamin: " + data[i].jK);
        }
    }
}
