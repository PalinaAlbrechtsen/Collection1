package homework.second;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getAge().compareTo(o2.getAge());
        if (result == 0) {
            result = new AverageScoreComparator().compare(o1, o2);
        }

        return result;
    }
}
