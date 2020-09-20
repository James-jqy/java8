package Chapter1;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Classname StreamReduce
 * @Description TODO
 * @Date 2020/9/20 17:12
 * @Created by Jieqiyue
 */
public class StreamReduce {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream();
        Integer reduce = stream1.reduce(0, (i, j) -> i + j);
        System.out.println(reduce);
        // 和上面的代码一样的
        Stream<Integer> stream2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream();
        Integer reduce2 = stream2.reduce(0, Integer::sum);
        System.out.println(reduce2);


        Stream<Integer> stream3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream();
        Integer reduce1 = stream3.filter(e -> e % 2 == 0).reduce(1, (i, j) -> i * j);
        Optional.of(reduce1).ifPresent(System.out::println);

    }
}
