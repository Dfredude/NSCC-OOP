package assignment03;

//A Ribbon class has fields that store values for color, length, and price. ✅
//
// Create methods to get and set ONLY color and length (in cm). ✅
// When the length attribute is updated, the price of the candy will be automatically calculated based on a rate of $1.99/cm.
//
//Create a default constructor to default the color to "red", the length to 1, and the price to 1.99.
//
//Create a secondary constructor to initialize the object with a color and length set when instantiated (price is to be automatically calculated).
//
//Create a display function to show the class's current state.
//
//Create a subclass named Bow that has extra attributes for thickness and loop size (e.g. 2cm).
//Create accessors and mutators for your new fields. Override your display method to show all 5 attributes. Override your mutator for the length attribute to calculate the price based on a rate of $5.99/cm. Create a default constructor and a constructor where all 5 values are set when the class is instantiated (using the super method(s) as appropriate).
//
//Create an application named TestRibbonBow to test your Ribbon and Bow classes (test all methods).

public class Ribbon {
    private String color;
    private int length; // centimeters
    private int price;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



}
