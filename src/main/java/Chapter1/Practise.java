package Chapter1;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Classname Exescri
 * @Description TODO
 * @Date 2020/9/23 20:38
 * @Created by Jieqiyue
 */
public class Practise {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("hello", "lEEtcode", "say").stream();
        // 看下面那个map中传入的。map中要求传入的是一个function，就是一个函数式接口。如果传入MyFunction中的另外一个函数ret，就会
        // 报错。因为参数不符合规定。
        stream.map(MyFunction::toUp).forEach(System.out::println);


        Arrays.asList("z","hello", "lEEtcode","say").stream()
                .sorted().forEach(System.out::println);


        Arrays.asList("z","hello", "lEEtcode", "say").stream()
                .sorted(MyFunction::compare).forEach(System.out::println);
	    // 新添加的内容
	    System.out.println(123);

        System.out.println("hello git" );
    }
}
