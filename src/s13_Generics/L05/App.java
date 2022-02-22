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
        data.printListData(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Marcio");
        list1.add("Mariana");
        list1.add("Juliana");
        list1.add("Ana");
        data.printListData(list1);

        String[] stringArray = {"One","Two","Three"};
        data.printArrayData(stringArray);
        Integer[] integerArray = {1,2,3,4,5};
        data.printArrayData(integerArray);

    }
}
