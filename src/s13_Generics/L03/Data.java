package s13_Generics.L03;

public class Data<T> {
    private T myVar;

    public Data(T data){
        super();
        this.myVar=data;
    }

    public T getMyVar() {
        return myVar;
    }

    @Override
    public String toString() {
        return "Data{" +
                "myVar=" + myVar +
                '}';
    }
}
