import java.lang.reflect.Array;
import java.util.Arrays;

public class NamesTable {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Ola";
        names[1] = "Ula";
        names[2] = "Ela";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

//        System.out.println(Arrays.toString(names));
    }
}
