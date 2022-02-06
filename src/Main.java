public class Main {
    public static void main(String[] args) {
        // Create an instance of the ExampleClass
        ExampleClass exampleObject = new ExampleClass();

        // Print out the field names from the exampleObject's class
        for (String fieldName : exampleObject.getFieldNames()) {
            System.out.println(fieldName);
        }
    }
}
