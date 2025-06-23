

  class Employee{
    int id;
    String name;
    public void PrintDetails(){
        System.out.println("My Number is " + id);
        System.out.println("And My name is "+ name );

    }
        }


        


public class Custom_Class {
    public static void main(String[] args) {

        System.out.println("This is our custom class");
        Employee aryan=new Employee();
        Employee aman=new Employee();

        // Instantiating a new Aryan Object
        // Setting Attributes
        aryan.id=12;
        aryan.name="Hello Bufddy";
        aman.id=12;
        aman.name="Hello Guys";

        aryan.PrintDetails();
        aman.PrintDetails();


//        System.out.println(aryan.id);
//        System.out.println(aryan.name);


    }
}
