package s13_Generics.L04;

/*
* The naming conventions are as follows:
* T - Type
* E - Element
* K - Key
* N - Number
* V - Value
*/

public class Data<K,V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public <E,N> void display(E element, N number){
         System.out.println("Element: " + element + "\nNumber: " +number);
    }

}
