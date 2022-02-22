package s13_Generics.L02;

public class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "data=" + data +
                '}';
    }
}
