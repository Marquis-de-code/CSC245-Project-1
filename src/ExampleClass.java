/*
 * Author: Alexander Marquis
 * Date: 2/5/2022
 * Course: CSC245 Secure Software Development
 * Assignment: Project 1 - Write program to print out an Object's Fields
 */
import java.lang.reflect.Field;

// This is a class with fields/instance variables that can print out the names of it's fields using Java Reflection
public class ExampleClass {

    // Fields
    private int field1;
    private boolean field2;
    private String field3;

    // Constructor
    public ExampleClass() {}

    // Method to get field/instance variable names in a String array
    public String[] getFieldNames() {

        // Get the fields from the class in an array
        Field[] fields = this.getClass().getDeclaredFields();

        // Create a String array to store the field names
        String[] fieldNames = new String[fields.length];

        // Populate the String array with the field names
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
        }

        return fieldNames;
    }
}
