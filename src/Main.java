import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("TEST1");
        set.add("TEST2");
        for (String s : set) {
            System.out.println(s);
        }
        List list = new ArrayList();

        for (int i = 0; i < 15; i++) {
            int randomNumber = (int) (Math.random() * 100);
            list.add(randomNumber);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}