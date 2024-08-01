package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class MenuDrivenProgram {
    Node head;

    public void beginsert() {
        Node ptr = new Node();
        if (ptr == null) {
            System.out.println("\nOVERFLOW");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter value");
            int item = sc.nextInt();
            ptr.data = item;
            ptr.next = head;
            head = ptr;
            System.out.println("\nNode inserted");
        }
    }

    public void lastinsert() {
        Node ptr = new Node();
        if (ptr == null) {
            System.out.println("\nOVERFLOW");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter value?");
            int item = sc.nextInt();
            ptr.data = item;
            if (head == null) {
                ptr.next = null;
                head = ptr;
                System.out.println("\nNode inserted");
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = ptr;
                ptr.next = null;
                System.out.println("\nNode inserted");
            }
        }
    }

    public void randominsert() {
        Node ptr = new Node();
        if (ptr == null) {
            System.out.println("\nOVERFLOW");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter element value");
            int item = sc.nextInt();
            ptr.data = item;
            System.out.println("\nEnter the location after which you want to insert ");
            int loc = sc.nextInt();
            Node temp = head;
            for (int i = 0; i < loc; i++) {
                if (temp == null) {
                    System.out.println("\ncan't insert\n");
                    return;
                }
                temp = temp.next;
            }
            ptr.next = temp.next;
            temp.next = ptr;
            System.out.println("\nNode inserted");
        }
    }

    public void begin_delete() {
        if (head == null) {
            System.out.println("\nList is empty\n");
        } else {
            Node ptr = head;
            head = ptr.next;
            ptr = null;
            System.out.println("\nNode deleted from the beginning...\n");
        }
    }

    public void last_delete() {
        if (head == null) {
            System.out.println("\nlist is empty");
        } else if (head.next == null) {
            head = null;
            System.out.println("\nOnly node of the list deleted...\n");
        } else {
            Node ptr = head;
            Node ptr1 = null;
            while (ptr.next != null) {
                ptr1 = ptr;
                ptr = ptr.next;
            }
            ptr1.next = null;
            ptr = null;
            System.out.println("\nDeleted Node from the last...\n");
        }
    }

    public void random_delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the location of the node after which you want to perform deletion");
        int loc = sc.nextInt();
        Node ptr = head;
        Node ptr1 = null;
        for (int i = 0; i < loc; i++) {
            if (ptr == null) {
                System.out.println("\nCan't delete");
                return;
            }
            ptr1 = ptr;
            ptr = ptr.next;
        }
        ptr1.next = ptr.next;
        ptr = null;
        System.out.println("\nDeleted node " + (loc + 1));
    }

    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter item which you want to search?");
        int item = sc.nextInt();
        Node ptr = head;
        int i = 0;
        boolean flag = false;
        while (ptr != null) {
            if (ptr.data == item) {
                System.out.println("Item found at location " + (i + 1));
                flag = true;
                break;
            }
            ptr = ptr.next;
            i++;
        }
        if (!flag) {
            System.out.println("Item not found");
        }
    }

    public void display() {
        Node ptr = head;
        if (ptr == null) {
            System.out.println("Nothing to print");
        } else {
            System.out.println("\nPrinting values . . . . .\n");
            while (ptr != null) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }

    public static void main(String[] args) {
        MenuDrivenProgram list = new MenuDrivenProgram();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 9) {
            System.out.println("\n\n*********Main Menu*********\n");
            System.out.println("Choose one option from the following list ...");
            System.out.println("===============================================\n");
            System.out.println("1.Insert in beginning\n2.Insert at last\n3.Insert at any random location\n4.Delete from Beginning\n5.Delete from last\n6.Delete node after specified location\n7.Search for an element\n8.Show\n9.Exit\n");
            System.out.println("Enter your choice?");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    list.beginsert();
                    break;
                case 2:
                    list.lastinsert();
                    break;
                case 3:
                    list.randominsert();
                    break;
                case 4:
                    list.begin_delete();
                    break;
                case 5:
                    list.last_delete();
                    break;
                case 6:
                    list.random_delete();
                    break;
                case 7:
                    list.search();
                    break;
                case 8:
                    list.display();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }
    }
}
