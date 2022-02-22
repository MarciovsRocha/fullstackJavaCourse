package s13_Generics.L04;

public class App {

    public static void main(String[] args) {
        Data<Integer, String> data = new Data<>(1,"Marcio");
        System.out.print("Key: "+data.getKey()+"\nValue: "+data.getValue());
        data.display("element","number");
    }
}
