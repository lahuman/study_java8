package lahuman;

public class Apple {
    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    private String color;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "사과의 색상은 [" + color + "] 이고 크기는 [" + weight + "] 입니다.";
    }
}
