package Chapter1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Classname Stream_mothed
 * @Description 本类就是介绍了一些stream的方法。
 * @Date 2020/9/20 16:02
 * @Created by Jieqiyue
 */
public class Stream_method {

    public static void main(String[] args) {
        // map方法可以接收一个Function.所以可以对stream中的每一个元素进行改变。
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> collect = list.stream().map(e -> e * 2).collect(Collectors.toList());
        System.out.println(collect);

        // filter 方法接收一个Predicate的函数式接口。
        List<Integer> collect1 = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(collect1);

        // flatmap (扁平化)
        String[] words = {"hello","kitty"};

        Stream<String[]> stream = Arrays.stream(words).map(w -> w.split(""));

        Stream<String> stringStream = stream.flatMap(Arrays::stream);

        stringStream.distinct().forEach(System.out::println);

        // match 方法，返回的是bool值
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        boolean b = list2.stream().allMatch(e -> e > 0);
        System.out.println(b);

        // find 方法,optional 详细可以看它的api。
        Stream<Integer> stream1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream();
        // 要注意这个地方，它返回的是一个optional。原来的stream已经被中断了。
        Optional<Integer> any = stream1.filter(e->e>7).findAny();
        Integer integer = any.get();
        System.out.println(integer);

    }
}
