package s13_Generics.L05;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Data data = new Data();
        System.out.println("Print integer list");
        data.printListData(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Marcio");
        list1.add("Mariana");
        list1.add("Juliana");
        list1.add("Ana");
        System.out.println("Print string list");
        data.printListData(list1);

        String[] stringArray = {"One","Two","Three"};
        System.out.println("print String array");
        data.printArrayData(stringArray);
        Integer[] integerArray = {1,2,3,4,5};
        System.out.println("Print integer array");
        data.printArrayData(integerArray);

    }
}
