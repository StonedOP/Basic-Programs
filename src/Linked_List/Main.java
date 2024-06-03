package Linked_List;

public class Main {
    public static void main(String[] args) throws Exception {
        LL list = new LL();
        list.insertFirst(22);
        list.insertFirst(63);
        list.insertFirst(11);
        list.insertFirst(4);
        list.insertLast(99);
        list.insert(100,3);
        try {
            list.insert(100,54);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            list.display();
        }
        System.out.println();
        System.out.println("doubly linked list");

        doubly_LL DLL = new doubly_LL();
        DLL.insertFirst(22);
        DLL.insertFirst(1);
        DLL.insertFirst(32);
        DLL.insertFirst(56);

        DLL.display();
      //  DLL.reverseDisplay();
        DLL.insertLast(55);

        DLL.otherWay();
        System.out.println();

        System.out.println("circular linked list");
        CircularLL list1 = new CircularLL();
        list1.insertFirst(34);
        list1.insertFirst(2);
        list1.insertFirst(543);
        list1.insertFirst(1);
        list1.display();
        list1.delete(2);
        list1.display();

    }
}
