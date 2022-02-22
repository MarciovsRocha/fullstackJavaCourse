package s13_Generics.L03;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        // old scenario NOT RECOMENDED
        List<Object> elements = new LinkedList<>();
        elements.add(new Names("Chaand"));
        elements.add(new Names("Ed"));
        elements.add(new Names("John"));
        elements.add(new Names("Mia"));
        elements.add("Some String");
        elements.add(1);
        elements.add(1.5);
        elements.add('#');

        // using generic class
        List<Data<Object>> myList = new LinkedList<>();
        myList.add(new Data<>("Some text"));
        myList.add(new Data<>(1.0));
        myList.add(new Data<>(1));
        myList.add(new Data<>('%'));
        myList.add(new Data<>(5.0f));

        // using generic class of String type
        List<Data<String>> myStrList = new LinkedList<>();
        myStrList.add(new Data<>("Some text"));
        myStrList.add(new Data<>("1.0"));
        myStrList.add(new Data<>("1"));
        myStrList.add(new Data<>("%"));
        myStrList.add(new Data<>("5.0"));

        App app = new App();
        app.printListOb(elements);
        app.printList(myList);
        app.printListStr(myStrList);
    }

    void printListOb(List<Object> list){
        System.out.println("------------------------- OLD WAY -------------------------");
        for (Object o : list) {
            System.out.println("Element: " + o);
        }
    }

    void printList(List<Data<Object>> list){
        System.out.println("------------------------- NEW WAY -------------------------");
        ListIterator<Data<Object>> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: " + iterator.next().getMyVar());
        }
    }

    void printListStr(List<Data<String>> list){
        System.out.println("------------------------- STRING ONLY TYPE -------------------------");
        ListIterator<Data<String>> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: " + iterator.next().getMyVar());
        }
    }


}
