package Questions;

import Linked_List.CirLinkedList;
import Linked_List.CircularLL;
import Linked_List.LL;
import Linked_List.doubly_LL;

//test to remember how interfaces work
public class LinkedList_revLL_etc {


    public static void main(String[] args) {
        LL list1 = new LL();

        list1.insertFirst(5);
        list1.insertFirst(4);
        list1.insertFirst(3);
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(2);
        list1.insertFirst(1);
        list1.insertFirst(1);
        list1.display();
        list1.duplicates();
        System.out.println();
        list1.display();
    }


}
