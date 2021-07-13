/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import java.lang.String;
import java.util.*;

public class toDoList {

    private String title;
    private ArrayList<item> itemList = new ArrayList<>();
    private int count = 0; //Length of list

    //Setters
    public void setTitle(String input){
        title = input;
    }

    //Getters
    public String title(){
        return title;
    }

    public int getCount(){
        return count;
    }

    public void readItem(int index, int filter){ //prints list of items
        //filter 0 corresponds to no filter, 1 corresponds to incomplete items, 2 corresponds to completed items only.
        for(int i = 0; i < index; i++){
            //Using printf here temporarily before implementing gui solution
            if((filter == 1 && itemList.get(i).status() == 1) || (filter == 2 && itemList.get(i).status() == 2)) break; //with those filters, skip respective items.

            System.out.printf("%s, due: %s.\n Complete? ", itemList.get(i).desc(), itemList.get(i).date());

            if(itemList.get(i).status() == 0) System.out.println("no");
            else System.out.println("yes");
        }

    }

    //Modifiers

    public void createItem(String desc, int yr, int mth, int dy){ //add item object
        item newItem = new item();

        newItem.setDesc(desc);
        newItem.setDate(yr, mth, dy);

        itemList.add(newItem);
        count++;
    }

    public void removeItem(int index){ //remove item object
        itemList.remove(index);
        count--;
    }

    public void clearList(){
        itemList.clear();
    }

    /*
    modifying item object is handled in the item class.
     */
}
