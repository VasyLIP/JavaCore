package CollectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();//создан экземпляр LinkedList, который хранит обьекты LinkedList.

        System.out.print("Adding elemnts to linkedList...");

        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");

        linkedList.addFirst("First");
        linkedList.addLast("Fifth");

        linkedList.add(1, "One and half");

        System.out.println("Initial linkedList content:");
        System.out.println(linkedList);

        System.out.println("Removinf elements First, Fifth and One and half...");

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("One and half");

        System.out.println("Changing element with value Second");
        linkedList.set(0, "Changed  " + linkedList.get(0));

        System.out.println("Final linkedList content:");
        System.out.println(linkedList);
    }}