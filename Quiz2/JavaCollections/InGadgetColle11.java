public class InGadgetColle11 {
    String id;
    double harga;
    String item;


    InGadgetColle11(String id, String item, double harga) {
        this.id = id;
        this.item = item;
        this.harga = harga;
    }

    InGadgetColle11() {

    }

    @Override
    public String toString() {
        return String.format("| %-7s | %-20s | Rp. %-10s", id, item, harga);
    }
}
