package Chapter1;

/**
 * @Classname MyFunction
 * @Description TODO
 * @Date 2020/9/23 20:42
 * @Created by Jieqiyue
 */
public class MyFunction {
    public static String toUp(String str){
        return str.toUpperCase();
    }

    public static String ret(){
        return "str.toUpperCase()";
    }

    public static int compare(String s1,String s2){
        if (s1 == s2)
            return 0;
        if (s1.compareTo(s2) < 0){
            return -1;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {

    }
}
