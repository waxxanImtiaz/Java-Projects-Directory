package genericsprograms;



public class GenericsPrograms<T> {

    public static void main(String[] args) {

        Integer[] intgr = {1,2,3,4,5,6};
        Double[] d = {1.2,32.4,12.4,43.22};
        GenericClass obj = new GenericClass();
        System.out.println("Integer array");
        obj.print(intgr);
//        
        System.out.println("max of 3 and 4 is "+(obj.maximum(3, 4)));
        System.out.println("Double array");
        obj.print(d);
    }
    public static <T> void display( T[] t )
    {
        for( T temp: t)
        System.out.println(temp+" ");
    }
}
