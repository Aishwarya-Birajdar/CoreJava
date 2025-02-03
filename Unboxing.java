package Basic_Anudip;

 /* 2. Java Program for Unboxing (All Primitive Types)

   Unboxing is the automatic conversion from wrapper class objects to their
    corresponding primitive types.
  */

public class Unboxing {
	
    public static void main(String[] args) {
    	
        // Unboxing (wrapper class objects to primitive types)
    	
        Integer integerObject = 10;
        int primitiveInt = integerObject; // Unboxing Integer to int
        
        Double doubleObject = 5.5;
        double primitiveDouble = doubleObject; // Unboxing Double to double
        
        Character charObject = 'A';
        char primitiveChar = charObject; // Unboxing Character to char
        
        Boolean boolObject = true;
        boolean primitiveBool = boolObject; // Unboxing Boolean to boolean
        
        Float floatObject = 3.14f;
        float primitiveFloat = floatObject; // Unboxing Float to float
        
        Long longObject = 1000000000L;
        long primitiveLong = longObject; // Unboxing Long to long
        
        Byte byteObject = 100;
        byte primitiveByte = byteObject; // Unboxing Byte to byte
        
        Short shortObject = 10;
        short primitiveShort = shortObject; // Unboxing Short to short
        
        // Printing the results
        System.out.println("Unboxing Examples:");
        System.out.println("int: " + primitiveInt);
        System.out.println("double: " + primitiveDouble);
        System.out.println("char: " + primitiveChar);
        System.out.println("boolean: " + primitiveBool);
        System.out.println("float: " + primitiveFloat);
        System.out.println("long: " + primitiveLong);
        System.out.println("byte: " + primitiveByte);
        System.out.println("short: " + primitiveShort);
        
   /*     Output:
        
        	Unboxing Examples:
        	int: 10
        	double: 5.5
        	char: A
        	boolean: true
        	float: 3.14
        	long: 1000000000
        	byte: 100
        	short: 10
        	
    */
    }
}


