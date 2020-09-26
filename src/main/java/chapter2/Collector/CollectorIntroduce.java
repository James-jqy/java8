package chapter2.Collector;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @Classname CollectorIntroduce
 * @Description TODO
 * @Date 2020/9/26 15:18
 * @Created by Jieqiyue
 */
public class CollectorIntroduce {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple(15, "green"),
                new Apple(153, "green"),
                new Apple(155, "green"),
                new Apple(13, "green"),
                new Apple(25, "red"),
                new Apple(14, "green"),
                new Apple(78, "red")
        );

      //  List<Apple> green = apples.stream().filter(a -> a.getColor().equals("green")).collect(Collectors.toList());
        //Optional.ofNullable(green).ifPresent(System.out::println);

        Map<String, List<Apple>> stringListMap = groupByFunction(apples);
        System.out.println(stringListMap);


    }

    // 要求要按照颜色分组
    private static Map<String,List<Apple>> groupByFunction(List<Apple> apples){
        Map<String,List<Apple>> ret = new HashMap<>();
        apples.stream().forEach(apple -> {
            List<Apple> appleList = Optional.ofNullable(ret.get(apple.getColor())).orElseGet(() -> {
                List<Apple> create = new ArrayList<>();
                ret.put(apple.getColor(), create);
                return create;
            });
            appleList.add(apple);
        });
        return ret;
    }
    // 比上面更加精简
    private static Map<String,List<Apple>> groupByCollect(List<Apple> apples){
        return apples.stream().collect(groupingBy(Apple::getColor));
    }
}
