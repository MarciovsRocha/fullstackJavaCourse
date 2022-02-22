package s13_Generics.L07;

public class App {
    public static void main(String[] args) {
        Data<Integer> data = new Data<>(1); // part1
        System.out.println(data.compareTo(0)); //part2
    }
}
