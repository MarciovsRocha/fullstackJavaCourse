package s13_Generics.L02;

public class Data {
    private Object obj;

    public Data(Object obj){
        this.obj = obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Data{" + "obj=" + obj + '}';
    }
}
