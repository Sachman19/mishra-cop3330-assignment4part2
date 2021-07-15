/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.util.*;

import static com.sun.javafx.scene.control.skin.Utils.getResource;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("remade menu.fxml"));
        primaryStage.setTitle("toDoList modifier");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args){
        /*initialize arraylist of toDoList objects
        call menu function*/
        Application.launch("remade menu.fxml");
    }

    @FXML
    private void toDoListScene(ActionEvent event) {
        //change stage to toDoList menu
    }


}
