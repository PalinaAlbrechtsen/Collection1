package homework.first;

import java.util.ArrayList;
import java.util.List;

public class HomeListRun {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("This");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("developer");

        MarkLengthFunc.markLength4(list);
    }
}
