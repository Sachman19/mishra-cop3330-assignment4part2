/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import javafx.application.Application;

import java.util.*;

import static com.sun.javafx.scene.control.skin.Utils.getResource;


public class App {
    public static void main(String[] args){
        /*initialize arraylist of toDoList objects
        call menu function*/
        Application.launch("menu.fxml");
    }

    public static void menu(){
        /*while true,
            prompt for choice (handled by button in ui)
            if choice == 1, create toDoList object and add to arrayList, switch case without break here allows for easy modification
            choice == 2, modify toDoList object, if choice == 1, then use previously created toDoList, otherwise ask for which one
            choice == 3, import or export arraylist of todolist objects, format in file for reusability.

         */


    }
}
