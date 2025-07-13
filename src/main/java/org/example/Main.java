package org.example;
import org.example.List.Node;
import org.example.List1.Node1;
public class Main {
    public static void main(String[] args) {
//        List list = new List();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        Node node = list.find(2);
//        list.add(8, node);
//        list.showList();
//        list.delete(1);
//        list.showList();
//        list.revert();
//        list.showList();

        List1 list1 = new List1();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.showList();
        System.out.println();
        list1.revert();
        list1.showList();
    }
}