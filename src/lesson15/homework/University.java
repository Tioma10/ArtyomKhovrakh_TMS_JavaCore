package lesson15.homework;

import java.util.ArrayList;

public class University {
    public ArrayList<Student> university;

    public University() {
        this.university = new ArrayList<>();
    }


    public void add(Student student) {
        university.add(student);
    }

    public void removeOrUp() {
        for(int i = university.size()-1; i >= 0; i--) {
            if (university.get(i).getGPA() > 3) {
                university.get(i).course += 1;
            } else {
                university.remove(i);
            }
        }
    }

    public Iterable<Student> iterator(){
        return university;
    }

}
