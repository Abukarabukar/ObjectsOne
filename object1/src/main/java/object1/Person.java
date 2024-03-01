package object1;

// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height; //centimeters

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0;
    }
  //  public int getHeight() {
   //     return height;


//    public void setHeight (int height) {
//        this.height = height;
//    }
//public static void main(String[] args) {
    // Declare and initialize an object
//    Person person1 = new Person("John", 30, 0);

    /* Now you can use the Object `person1` */

//}

}