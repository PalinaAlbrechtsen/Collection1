package homework.second;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getSurname().compareTo(o2.getSurname());
        if (result == 0) {
            result = new AgeComparator().compare(o1, o2);
        }

        return result;
    }
}
