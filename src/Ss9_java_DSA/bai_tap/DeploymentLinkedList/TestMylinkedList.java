package Ss9_java_DSA.bai_tap.DeploymentLinkedList;

public class TestMylinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2,"Handsome");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);
        System.out.println(list.indexOf("Handsome"));
    }
}
