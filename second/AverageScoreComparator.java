package homework.second;

import java.util.Comparator;

public class AverageScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverageScore().compareTo(o2.getAverageScore());
    }
}
