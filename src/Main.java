import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

            //        Задание 1
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
        List<String> words = List.of("hello", "world", "hello", "how are you");
        task2(nums);
        task3(words);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task4(strings);
    }

            //        Задание 2
    public static void task2(List<Integer> nums){
        Set<Integer> result = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                result.add(num);
            }
            }
        System.out.println();
        System.out.println(result);
    }

             //         Задание 3
    public static void task3(List<String> words) {
        Set<String> uniqWords = new HashSet<>(words);
        System.out.println(uniqWords);
    }

            //        Задание 4
    public static void task4(List<String> strings) {
        Map<String, Integer> stringByCount = new HashMap<>();
        for (String string: strings) {
            if (stringByCount.containsKey(string)){
                stringByCount.put(string, stringByCount.get(string) + 1);
            } else {
                stringByCount.put(string, 1);
            }
        }
        for (Map.Entry<String, Integer> entry:stringByCount.entrySet()
             ) {
            if (entry.getValue() > 1) {
                System.out.println(entry);
            }

        }
//        System.out.println(stringByCount);
    }
}
