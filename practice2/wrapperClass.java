package practice2;


public class wrapperClass {
    public static void main(String[] args) {
        // wrapper class = provides a way to use primitive data types as reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections (ex.ArrayList)

        // primitive        // wrapper
        //----------        //---------
        // boolean          Boolean
        // char             Character
        // int              integer
        // double           Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding wrapper class
        // unboxing = the revers of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true; 
        Character b = '@';
        Integer c = 212;
        Double d = 3.14;
        String e = "Aj";

        if (a==true) { // unboxing 
            System.out.println("This is true");
        }

        
    }
}
