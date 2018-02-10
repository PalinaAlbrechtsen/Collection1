package homework.second;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = new SurnameComparator().compare(o1, o2);
        }

        return result;
    }
}
