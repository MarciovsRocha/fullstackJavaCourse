package s13_Generics.L06;

public class App {
    public static void main(String[] args) {
        Data<Integer, App> data = new Data<>(1,new App());
        data.display('C',1.2F);
        data.getValue().teste();
        System.out.println(data.getKey());;
    }

    public void teste(){
        System.out.println("Sample test method.");
    }
}
