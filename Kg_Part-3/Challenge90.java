package in.kkcoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomComparator
{
    public static void main(String[] args)
    {
                           //array use as a list...(variable argument wali list leta h...)
        List<String> list= Arrays.asList("Bear", "Zebra", "Lion", "Ant");
        sortInDescending(list);
        System.out.println(list);


    }

    public static void sortInDescending(List<String> stringList)
    {
        Collections.sort(stringList);

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.equals(t1)){
                    return 0;
                } else if (s.charAt(0) < t1.charAt(0)) {
                    return 1;
                }else {
                    return -1;
                }

            }
        });

    }
}
