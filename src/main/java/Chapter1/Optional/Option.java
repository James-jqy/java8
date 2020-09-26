package Chapter1.Optional;

import java.util.Optional;
import java.util.function.Function;

/**
 * @Classname Optional 类的一些用法
 * @Description TODO
 * @Date 2020/9/25 16:52
 * @Created by Jieqiyue
 */
public class Option {

    public static void main(String[] args) {
        // 构造方法
//        Optional<Person> alex = Optional.ofNullable(new Person("Alex"));
//        Optional<String> s = alex.map(Person::getName);
//        String unknow_name = s.orElse("UNKNOW NAME");
//        System.out.println(unknow_name);

        Function<Person, String> getName = Person::getName;
        String abc = getName.apply(new Person("abc"));


        Function<String,String> f2 = e->e.toUpperCase();
        // flatMap 方法

    }
}
