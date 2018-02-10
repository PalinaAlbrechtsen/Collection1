package homework.first;

import java.util.List;

public class MarkLengthFunc {

    public static void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
        System.out.println(list.toString());
    }
}
