package lesson15.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    protected final String name;
    protected final String group;
    public int course;
    protected final ArrayList<Integer> marks;

    public Student(String name, String group, int course, ArrayList<Integer> marks) {

        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public double getGPA() {
        int sum = 0;
        for (int m : this.marks) {
            sum += m;
        }
        return (double) sum / this.marks.size();
    }

    public String getName(){
        return this.name;
    }
}
