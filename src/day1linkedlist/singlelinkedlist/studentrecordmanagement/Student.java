package day1linkedlist.singlelinkedlist.studentrecordmanagement;

import java.util.Scanner;
public class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;
    Student(int rollNumber, String name, int age, char garde){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age=age;
        this.grade=grade;
        this.next=null;


    }
}
