package kata.kyu8;

public class Multiply {
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
}



//Be Concise I - The Ternary Operator

const describeAge = a => a<=12 ? "You're a(n) kid":
a >= 13 && a <= 17?"You're a(n) teenager":
a >=65?"You're a(n) elderly":
"You're a(n) adult";
