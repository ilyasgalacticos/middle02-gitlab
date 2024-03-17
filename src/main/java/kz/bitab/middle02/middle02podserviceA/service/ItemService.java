package kz.bitab.middle02.middle02podserviceA.service;

import kz.bitab.middle02.middle02podserviceA.dto.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items;
    private Long id;

    public ItemService(){
        items = new ArrayList<>();
        items.add(new Item(1L, "IPhone 15", 600000, 10));
        items.add(new Item(2L, "IPhone 14", 500000, 10));
        items.add(new Item(3L, "IPhone 13", 400000, 10));
        items.add(new Item(4L, "IPhone 12", 300000, 10));
        id = 5L;
    }

    public List<Item> getItems(){
        return items;
    }

    public Item addItem(Item item){
        item.setId(id);
        items.add(item);
        id++;
        return item;
    }

}