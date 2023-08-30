import java.util.*;

public class Test1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 6, 1, 10, 10, 6, 6, 15};

        list(array);

    }

    public static void list(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int num : map.keySet()) {
            list.add(List.of(num, map.get(num)));
        }


        System.out.println(list);
    }
}
