package com.CYR3CON.InterviewTask.controller;

import com.CYR3CON.InterviewTask.model.Item;
import com.CYR3CON.InterviewTask.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/item")
@RestController
public class ItemController {

    private static ItemService itemService;

    @Autowired
    ItemController(ItemService itemService)
    {
        this.itemService = itemService;
    }

    /**
     * Type of Request: GET
     * URL for this endpoint: localhost:8080/api/v1/item
     *
     */
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Item getItems() {

        return itemService.getCurrentNoOfItems();
    }

    /**
     * Type of Request: POST
     * URL for this endpoint: localhost:8080/api/v1/item/placeOrder
     *
     * Sample JSON Request: {
     *     "item1": 5,
     *     "item2": 0
     *  }
     *
     */

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "/placeOrder"
    )
    public String placeOrder(@RequestBody Item item)
    {
        return itemService.makeAndDisplayOrder(item.getItem1(), item.getItem2());
    }

    }
