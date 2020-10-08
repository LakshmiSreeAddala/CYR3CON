package com.CYR3CON.InterviewTask.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    private int Item1;
    private int Item2;

    public Item(
            @JsonProperty("Item1") int Item1,
            @JsonProperty("Item2") int Item2) {
        this.Item1 = Item1;
        this.Item2 = Item2;
    }

    public Item() {}



    public int getItem1() {
        return Item1;
    }

    public void setItem1(int item1)
    {
        Item1 = item1;
    }

    public int getItem2() {
        return Item2;
    }

    public void setItem2(int item2) {
        Item2 = item2;
    }
}
