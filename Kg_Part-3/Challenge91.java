package in.kkcoding;

import java.util.*;

class FrequencyElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,8,6,8,5,4,7,8,1);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,8));
        System.out.println(Collections.frequency(list,4));

    }
}
