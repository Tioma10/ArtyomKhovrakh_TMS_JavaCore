package lesson15.homework;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {

        getSolutionTaskOne();

        Animals animals = new Animals();
        animals.add("Pushok");
        animals.add("Vasya");
        animals.add("Sharik");
        animals.remove();
        System.out.println(animals.iterator());

        Student student1 = new Student("Artyom", "TV5", 1, new ArrayList<Integer>(Arrays.asList(5, 7, 8)));
        Student student2 = new Student("Sergey", "TV4", 2, new ArrayList<Integer>(Arrays.asList(1, 3, 4)));
        Student student3 = new Student("Tatyana", "TV4", 2, new ArrayList<Integer>(Arrays.asList(5, 3, 4)));
        University university = new University();
        university.add(student1);
        university.add(student2);
        university.add(student3);
        university.removeOrUp();
        printStudents(university.iterator(), 3);
    }

    public static void getSolutionTaskOne() {
        System.out.println("Enter the sequence of numbers");
        Scanner input = new Scanner(System.in);
        String userEnter = input.nextLine();

        String[] userEnterArray = userEnter.split(" ");

        LinkedHashSet<String> userEnterSet = new LinkedHashSet<>();
        Collections.addAll(userEnterSet, userEnterArray);

        System.out.println(userEnterSet);
    }

    public static void printStudents(Iterable<Student> students, int course) {
        for (Student s : students) {
            if (course == s.course) {
                System.out.println(s.getName());
            }
        }
    }
}

