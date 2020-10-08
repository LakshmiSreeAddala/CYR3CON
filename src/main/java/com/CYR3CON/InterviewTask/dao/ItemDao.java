package com.CYR3CON.InterviewTask.dao;

import com.CYR3CON.InterviewTask.model.Item;

public interface ItemDao {

    String makeAndDisplayOrder(int noOfItem1ToOrder, int noOfItem2ToOrder);

    Item getCurrentNoOfItems();



}
