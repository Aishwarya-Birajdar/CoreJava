package Basic_Anudip;

  /*1. Java Program for Autoboxing (All Primitive Types)
    Autoboxing is the automatic conversion from primitive types to 
    their corresponding wrapper classes.
 */
public class Autoboxing {
	
    public static void main(String[] args) {
    	
        // Autoboxing (primitive types to wrapper classes)
    	
        int primitiveInt = 10;
        Integer integerObject = primitiveInt; // Autoboxing int to Integer
        
        double primitiveDouble = 5.5;
        Double doubleObject = primitiveDouble; // Autoboxing double to Double
        
        char primitiveChar = 'A';
        Character charObject = primitiveChar; // Autoboxing char to Character
        
        boolean primitiveBool = true;
        Boolean boolObject = primitiveBool; // Autoboxing boolean to Boolean
        
        float primitiveFloat = 3.14f;
        Float floatObject = primitiveFloat; // Autoboxing float to Float
        
        long primitiveLong = 1000000000L;
        Long longObject = primitiveLong; // Autoboxing long to Long
        
        byte primitiveByte = 100;
        Byte byteObject = primitiveByte; // Autoboxing byte to Byte
        
        short primitiveShort = 10;
        Short shortObject = primitiveShort; // Autoboxing short to Short
        
        // Printing the results
        System.out.println("Autoboxing Examples:");
        System.out.println("Integer: " + integerObject);
        System.out.println("Double: " + doubleObject);
        System.out.println("Character: " + charObject);
        System.out.println("Boolean: " + boolObject);
        System.out.println("Float: " + floatObject);
        System.out.println("Long: " + longObject);
        System.out.println("Byte: " + byteObject);
        System.out.println("Short: " + shortObject);
        
        /* Output:
        	```
        	Autoboxing Examples:
        	Integer: 10
        	Double: 5.5
        	Character: A
        	Boolean: true
        	Float: 3.14
        	Long: 1000000000
        	Byte: 100
        	Short: 10
        	
        */
    }
}


