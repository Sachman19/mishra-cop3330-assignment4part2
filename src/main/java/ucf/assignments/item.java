/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import java.lang.String;

public class item {

    private String desc; //Stores item description
    private int yr, mth, dy; // year, month, and day.
    private int status; //Used to show completion status.

    //setters
    public void setDesc(String description){
        desc = description;
    }

    public void setDate(int year, int month, int day){
        yr = year;
        mth = month;
        dy = day;
    }

    public void setStatus(int stat){
        status = stat;
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
