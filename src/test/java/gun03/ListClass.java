package gun03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass {

    public static void main(String[] args) {

        List<List<Integer>> listler = new ArrayList<>();
        listler.add(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        listler.add(new ArrayList<>(Arrays.asList(11,12,13,14,15)));

        System.out.println(listler);

        /*
            [
                [1,2,3,4,5],
                [11,12,13,14,15]
            ]

         */

    }
}
