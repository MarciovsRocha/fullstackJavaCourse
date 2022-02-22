package s13_Generics.L06;

import java.util.Enumeration;

public class Data <K extends Integer,V extends App>{
    private K key;
    private V value;

    public Data(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }

    public <E extends Character,N extends Number> void display(E element, N number){
        System.out.println("Element: " + element + "\nNumber: "+ number);
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
