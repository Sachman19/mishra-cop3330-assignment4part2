/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import java.lang.String;
import java.util.*;
import java.io.*;

import static java.lang.Integer.parseInt;

public class toDoList {

    private String title;
    private ArrayList<item> itemList = new ArrayList<>();
    private int count = 0; //Length of list

    private String filepath;

    //Setters
    public void setTitle(String input){
        title = input;
    }

    public void setFilename(String input){
        filepath = "~/" + input;
    }

    //Getters
    public String title(){
        return title;
    }

    public int count(){
        return count;
    }

    public String filepath(){
        return filepath;
    }

    public String readItemDesc(int index){
        return itemList.get(index).desc();
    }
    public String readItemDate(int index){
        return itemList.get(index).date();
    }
    public int readItemStat(int index){
        return itemList.get(index).status();
    }


    public void readItem(int filter){ //prints list of items
        //filter 0 corresponds to no filter, 1 corresponds to incomplete items, 2 corresponds to completed items only.
        for(int i = 0; i < count; i++){
            //Using printf here temporarily before implementing gui solution
            if((filter == 1 && itemList.get(i).status() == 1) || (filter == 2 && itemList.get(i).status() == 2)) break; //with those filters, skip respective items.

            System.out.printf("%d. %s, due: %s.\n Complete? ", i+1, itemList.get(i).desc(), itemList.get(i).date());

            if(itemList.get(i).status() == 0) System.out.println("No.");
            else System.out.println("Yes.");
        }

    }

    //Modifiers
    public void createItem(){ //add item object
        item newItem = new item();

        itemList.add(newItem);
        count++;
    }

    public void removeItem(int index){ //remove item object
        itemList.remove(index);
        count--;
    }

    public void clearList(){
        itemList.clear();
        count = 0;
    }

    //modify item fields
    public void cngItemStat(int index){ //change item status
        itemList.get(index).changeStatus();
    }

    public void cngItemDesc(int index, String desc){
        itemList.get(index).setDesc(desc);
    }

    public void cngItemDate(int index, int year, int month, int day){
        itemList.get(index).setDate(year, month, day);
    }

    public void cngItemDate(int index, String date){
        int year, month, day;

        String[] parseString = date.split("-");

        year = parseInt(parseString[0]);
        month = parseInt(parseString[1]);
        day = parseInt(parseString[2]);

        itemList.get(index).setDate(year, month, day);
    }

    //save/load from file
    public void saveToFile() throws IOException {
        //Check if file exists. if true, overwrite it.
        //Else, create new file
        File outFile = new File(filepath);
        if(!outFile.isFile()){
            outFile.createNewFile();
        }
        //Write title to file
        FileWriter writeFile = new FileWriter(filepath);
        writeFile.write(title);
        //loop, format desc, date, and status per item.
        for(int i = 0; i < count; i++){
            writeFile.write(itemList.get(i).desc());
            writeFile.write(itemList.get(i).date());
            writeFile.write(itemList.get(i).status());
        }
        writeFile.close();
    }

    public int readFromFile(){
        //Check if file exists. If not, return error code.
        File inFile = new File(filepath);
        if(!inFile.isFile()){
            return -1;
        }
        //Read first line and save as title.
        Scanner readFile = new Scanner(filepath);
        title = readFile.nextLine();
        //While has next line is true, keep creating item objects and assigning values.
        int i = 0;
        while(readFile.hasNextLine()){
            if(i%3 == 0){
                createItem();
                cngItemDesc(i/3, readFile.nextLine());
            }
            if(i%3 == 1){
                cngItemDate(i/3, readFile.nextLine());
            }
            if(i%3 == 2){
                if(parseInt(readFile.nextLine()) == 1) itemList.get(i/3).changeStatus();
            }
            i++;
        }
        return 0;
    }




}
