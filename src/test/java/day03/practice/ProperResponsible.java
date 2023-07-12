package day03.practice;

public class ProperResponsible {
    private int value;
    private String str;

//    public ProperResponsible() {
//        // Default constructor
//        value = 0;
//    }
    
    public ProperResponsible() {
        // Constructor with parameter
        str = " ";
    }

    public ProperResponsible(int initialValue) {
        // Constructor with parameter
        value = 5;
    }
    
    public ProperResponsible(String initialValue) {
        // Constructor with parameter
//        str = initialValue;
    }

    public int ProperResponsible() {
        return value;
    }

    public static void main(String[] args) {
        // Creating objects of MyClass
        ProperResponsible obj1 = new ProperResponsible();           // Using default constructor
        ProperResponsible obj2 = new ProperResponsible(10);  
        ProperResponsible obj3 = new ProperResponsible("Gowtham");// Using constructor with parameter

        System.out.println(obj1.ProperResponsible());
        System.out.println(obj2.str); 
        System.out.println(obj2.ProperResponsible());  
    }
}

