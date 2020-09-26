package Chapter1.Optional;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2020/9/25 16:53
 * @Created by Jieqiyue
 */
public class Person {

    private String name;

    public  String getName() {
        return name;
    }

    public String func(){
        return "abc";
    }

//    public void help(TreeNode root, int now, List<Integer> list ){
//        if(root == null) return;
//
//        int temp = now + root.val;
//        list.add(root.val);
//        if(root.left == null && root.right == null){
//            if(temp == target)
//                ret.add(new ArrayList<>());
//        }
//
//        help(root.left,temp);
//        help(root.right,temp);
//        list.remove(list.size() - 1);
//    }

    public static void main(String[] args) {
//        Function<Person, String> getName = Person::getName;
//        Function<Person, String> function = Person::func;
//        String ccc = function.apply(new Person("ccc"));
//        System.out.println(ccc);
//        Function<String,String>  function1 = e->e.toUpperCase();

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(32);
        list.add(36);
        list.add(34);

        System.out.println(list);
        list.remove(list.size() - 1);
        System.out.println(list);

        ArrayList<Integer> integers = new ArrayList<>(list);
        System.out.println(integers);
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }



    public void setName(String name) {
        this.name = name;
    }
}
