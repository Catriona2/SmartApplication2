package moduleitem;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private List<Items> items = new ArrayList<>();


    public void addItem(String name, double price) {
        items.add(new Items(name, price));
    }

    public List<Items> getItems() {

        return items;
    }
}
