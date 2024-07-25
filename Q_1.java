class Number {
    int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Number add(Number other) {
        int sum = this.value + other.value;
        return new Number(sum);
    }
}

public class Q_1 {
    public static void main(String[] args) {
           Number num1 = new Number(10);
           Number num2 = new Number(20);

            Number result = num1.add(num2);

            System.out.println("The sum is: " + result.getValue());
    }
}
