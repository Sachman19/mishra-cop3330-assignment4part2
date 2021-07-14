package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @org.junit.Test
    public void testing(){

        toDoList testList = new toDoList();
        //A user shall be able to add a new item to the list
        testList.createItem();
        assertEquals(1, testList.count());

        //A user shall be able to remove an item from the list
        testList.removeItem(0);
        assertEquals(0, testList.count());

        //A user shall be able to clear the list of all items
        testList.createItem();
        testList.createItem();
        testList.createItem();

        testList.clearList();
        assertEquals(0, testList.count());

        //A user shall be able to edit the description of an item within the list
        testList.createItem();
        testList.cngItemDesc(0, "New Description");
        assertEquals(0, testList.readItemDesc(0).compareTo("New Description"));

        //A user shall be able to edit the due date of an item within the list
        testList.cngItemDate(0, 2002, 07, 13);
        assertEquals(0, testList.readItemDate(0).compareTo("2002-07-13"));

        //A user shall be able to mark an item in the list as either complete or incomplete
        testList.cngItemStat(0);
        assertEquals(1, testList.readItemStat(0));

        //A user shall be able to display all of the existing items in the list

        //A user shall be able to display only the incomplete items in the list

        //A user shall be able to display only the completed items in the list

        //A user shall be able to save the list (and all of its items) to external storage

        //A user shall be able to load a list (and all of its items) from external storage

    }
}