import java.util.ArrayList;
import java.util.Collections;

public class ListInGadget11 {

    private ArrayList<InGadgetColle11> gadget;

    public ListInGadget11() {
        gadget = new ArrayList<>();
    }

    public void add(InGadgetColle11 data) {
        gadget.add(data);
    }

    public InGadgetColle11 get(String id) {
        for (InGadgetColle11 gadget : gadget) {
            if (gadget.id.equals(id)) {
                return gadget;
            }
        }
        return null;
    }

    public void printAll() {
        System.out.println("---------------------------------------------------");
        System.out.printf("| %-7s| %-20s | %-15s |", "Id", "Nama Gadget", "Harga");
        System.out.println("\n---------------------------------------------------");
        for (InGadgetColle11 gadget : gadget) {
            System.out.println(gadget);
        }
    }

    public void delete(String id) {
        int index = -1;
        for (int i = 0; i < gadget.size(); i++) {
            if (gadget.get(i).id.equals(id)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            gadget.remove(index);
        }
    }

    public void sortAsc() {
        Collections.sort(gadget, (gadget1, gadget2) -> Double.compare(gadget1.harga, gadget2.harga));
        printAll();
    }
}
