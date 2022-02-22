package s13_Generics.L02;

public class App {
    public static void main(String[] args) {
        // normal case
        // this will work fine
        Data data = new Data("Some String");
        String myStr = (String) data.getObj();
        System.out.println(myStr);
        // this will cause runtime error
        /* this scenario will be confusing and ambiguous
        data = new Data(1);
        myStr = (String) data.getObj();
        System.out.println(myStr);
        */

        // Using generic class
        GenericClass<String> genericData= new GenericClass<>("Some Data");
        myStr = genericData.getData();
        System.out.println(myStr);
        // this wll cause compile type error
        /* this scenario is clean
        genericData= new GenericClass<String>(1);
        myStr = genericData.getData();
        System.out.println(myStr);
         */

    }
}
