/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import java.lang.String;

public class item {

    private String desc; //Stores item description
    private int yr, mth, dy; // year, month, and day.
    private int status = 0; //Used to show completion status.

    //setters
    public void setDesc(String description){
        desc = description;
    }

    public void setDate(int year, int month, int day){
        yr = year;
        mth = month;
        dy = day;
    }

    public void changeStatus(){
        if(status == 0){
            status = 1;
        }
        else{
            status = 0;
        }
    }

    //getters
    public String desc(){
        return desc;
    }

    public String date(){
        return yr + "-" + mth + "-" + dy;
    }

    public int status(){
        return status;
    }



}
