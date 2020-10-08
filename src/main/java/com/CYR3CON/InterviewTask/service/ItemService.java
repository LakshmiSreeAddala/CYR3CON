package com.CYR3CON.InterviewTask.service;

import com.CYR3CON.InterviewTask.dao.ItemDao;
import com.CYR3CON.InterviewTask.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    ItemDao itemDao;
    @Autowired()
    public ItemService(@Qualifier("fakeItemImpl") ItemDao itemDao)
    {
        this.itemDao = itemDao;
    }

    public String makeAndDisplayOrder(int noOfItem1ToOrder, int noOfItem2ToOrder)
    {
        return itemDao.makeAndDisplayOrder(noOfItem1ToOrder,noOfItem2ToOrder);
    }

    public Item getCurrentNoOfItems()
    {
        return itemDao.getCurrentNoOfItems();
    }


}

