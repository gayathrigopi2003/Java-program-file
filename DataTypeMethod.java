public class DataTypeMethod {
    public static void main(String[] args) {
        // Memory size and data range for primitive data types in Java

        // Byte
        System.out.println("Byte:");
        System.out.println("Size: " + Byte.SIZE + " bits");
        System.out.println("Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println();

        // Short
        System.out.println("Short:");
        System.out.println("Size: " + Short.SIZE + " bits");
        System.out.println("Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println();

        // Int
        System.out.println("Int:");
        System.out.println("Size: " + Integer.SIZE + " bits");
        System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();

        // Long
        System.out.println("Long:");
        System.out.println("Size: " + Long.SIZE + " bits");
        System.out.println("Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();

        // Float
        System.out.println("Float:");
        System.out.println("Size: " + Float.SIZE + " bits");
        System.out.println("Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println();

        // Double
        System.out.println("Double:");
        System.out.println("Size: " + Double.SIZE + " bits");
        System.out.println("Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();

        // Char
        System.out.println("Char:");
        System.out.println("Size: " + Character.SIZE + " bits");
        System.out.println("Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println();

        // Boolean
        System.out.println("Boolean:");
        // Size for boolean is not precisely defined in Java
        System.out.println("Range: " + Boolean.FALSE + " to " + Boolean.TRUE);
    }
}
