package com.CYR3CON.InterviewTask.dao;

import com.CYR3CON.InterviewTask.model.Item;
import org.springframework.stereotype.Repository;


@Repository("fakeItemImpl")
public class ItemDaoImpl implements ItemDao {

    Item item;

public ItemDaoImpl()
{
    item = new Item(20,10);
    item.setItem1(20);
    item.setItem2(10);

}

    @Override
    public String makeAndDisplayOrder(int noOfItem1ToOrder, int noOfItem2ToOrder) {
        if (item.getItem1() == 0 && item.getItem2() == 0) {
            return "Currently the store is empty";
        } else if (item.getItem1() - noOfItem1ToOrder < 0 || item.getItem2() - noOfItem2ToOrder < 0) {
            return "We currently don't have either " + noOfItem1ToOrder + "of item1 or ," + noOfItem2ToOrder + " units of Item2 in stock.";
        } else {
            item.setItem1(item.getItem1() - noOfItem1ToOrder);
            item.setItem2(item.getItem2() - noOfItem2ToOrder);

            return noOfItem1ToOrder + " Of Item1," + noOfItem2ToOrder + " Of Item2 are being ordered";
        }
    }

    @Override
    public Item getCurrentNoOfItems() {

        return item;
    }
}
