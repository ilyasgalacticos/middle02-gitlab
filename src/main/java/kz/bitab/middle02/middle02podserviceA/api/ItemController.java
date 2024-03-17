package kz.bitab.middle02.middle02podserviceA.api;


import kz.bitab.middle02.middle02podserviceA.dto.Item;
import kz.bitab.middle02.middle02podserviceA.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public List<Item> getItems(){
        return itemService.getItems();
    }

    @PostMapping
    public Item addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

}
