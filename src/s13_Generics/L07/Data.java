package s13_Generics.L07;

public class Data<T extends java.lang.Comparable> implements Comparable<T>{
    private T myvar;

    public Data(T myvar) {
        super();
        this.myvar = myvar;
    }

    public T getMyvar() {
        return myvar;
    }

    @Override
    public String toString() {
        return "Data{" +
                "myvar=" + myvar +
                '}';
    }


    @Override
    public int compareTo(T o) {
        return o.compareTo(getMyvar());
    }
}
