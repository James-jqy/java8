package chapter2.Collector;

/**
 * @Classname Apple
 * @Description TODO
 * @Date 2020/9/26 15:17
 * @Created by Jieqiyue
 */
public class Apple {
    private int weight ;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
