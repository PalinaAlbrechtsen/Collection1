package homework.second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunStudent {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Анатолий", "Пупкин", 2.4, 25));
        studentList.add(new Student("Тракторина", "Лексусова", 6.6, 19));
        studentList.add(new Student("Кот", "Котовский", 9.0, 21));
        studentList.add(new Student("Малина", "Ягодкова", 9.8, 33));
        studentList.add(new Student("Кот", "Якубович", 7.5, 20));
        studentList.add(new Student("Малина", "Ягодкова", 5.7, 34));
        studentList.add(new Student("Тракторина", "Лексусова", 6.7, 19));
        studentList.add(new Student("Чемодан", "Черновский", 9.8, 50));

        System.out.println("Not sorted:");
        printTheListOfStudents(studentList);
        System.out.println();
        System.out.println("Sorted:");
        studentList.sort(new NameComparator());
        printTheListOfStudents(studentList);
        System.out.println();
        System.out.println("Sorted by score:");
        studentList.sort(new AverageScoreComparator());
        printTheListOfStudents(studentList);
        System.out.println();
        findTheCleverest(studentList);

    }

    public static void findTheCleverest(List<Student> listToIter) {
        List<Student> list = listToIter;
        double theBestScore = 0.0;
        for (Student student : list) {
            if (theBestScore < student.getAverageScore()) {
                theBestScore = student.getAverageScore();
            }
        }

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAverageScore() < theBestScore) {
                iterator.remove();
            }
        }

        if (list.size() > 1) {
            list.sort(new NameComparator());
            System.out.println("Студенты с самым высоким баллом:");
            for (Student student : list) {
                System.out.println(student);
            }
        } else {
            System.out.println("Студент с самым высоким баллом за год: " + list);
        }
    }

    public static void printTheListOfStudents(List<Student> list) {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}
