@FunctionalInterface
interface A{
    void show();
}

class B implements A{
    @Override
    public void show() {
        System.out.println("Hello World");
    }
}



public class lambda {
    public static void main(String[] args)
    {
        // LAMBDA EXPRESSION IS A FUNCTION WITHOUT A NAME, IT IS AN ANONYMOUS FUNCTION, IT IS A FUNCTION THAT CAN BE PASSED AS AN ARGUMENT TO ANOTHER FUNCTION, OR CAN BE RETURNED AS A VALUE FROM ANOTHER FUNCTION //
        // LAMBDA EXPRESSION IS A FUNCTION THAT CAN BE USED TO IMPLEMENT A FUNCTIONAL INTERFACE, WHICH IS AN INTERFACE THAT HAS ONLY ONE ABSTRACT METHOD //
        // LAMBDA EXPRESSION CAN BE USED TO IMPLEMENT THE ABSTRACT METHOD OF A FUNCTIONAL INTERFACE IN A MORE CONCISE WAY THAN ANONYMOUS CLASS //
        // LAMBDA EXPRESSION CAN BE USED TO PASS A BLOCK OF CODE AS AN ARGUMENT TO A FUNCTION, OR TO RETURN A BLOCK OF CODE FROM a function //
        // LAMBDA EXPRESSION CAN BE USED TO CREATE INLINE IMPLEMENTATIONS OF FUNCTIONAL INTERFACES, WHICH CAN BE USEFUL FOR EVENT HANDLERS, CALLBACKS, AND OTHER SITUATIONS WHERE YOU NEED TO PASS A BLOCK OF CODE AS AN ARGUMENT TO A FUNCTION //

        // EXAMPLE OF LAMBDA EXPRESSION TO IMPLEMENT A FUNCTIONAL INTERFACE //
//        A obj = new A(); // This will give an error because A is an interface and we cannot create an object of an interface //
//          A obj = new B(); // This will work because B is a class that implements A and we can create an object of B //
//            obj.show(); // This will call the show method of B and print "Hello World"

        // NOW LET'S SEE HOW TO USE LAMBDA EXPRESSION TO IMPLEMENT THE SHOW METHOD OF A IN A MORE CONCISE WAY THAN ANONYMOUS CLASS //
//        A obj = new A(){
//            public void show() {
//                System.out.println("Hello World");
//            }
//        }; // This is an anonymous class that implements A and overrides the show method to print "Hello World"
//        obj.show(); // This will call the show method of the anonymous class and print "Hello World"


        // NOW LET'S SEE HOW TO USE LAMBDA EXPRESSION TO IMPLEMENT THE SHOW METHOD OF A IN A MORE CONCISE WAY THAN ANONYMOUS CLASS//
        A obj = () -> System.out.println("Hello World!");
        obj.show(); // This will call the show method of the lambda expression and print "Hello World!"
    }
}