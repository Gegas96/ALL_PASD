public class InGadget11 {
    String id;
    double harga;
    String item;

    InGadget11() {

    }

    InGadget11(String id, String item, double harga) {
        this.id = id;
        this.item = item;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return String.format("| %-7s | %-20s | Rp. %-10s", id, item, harga);
    }
}