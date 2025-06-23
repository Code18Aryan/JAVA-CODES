/*class Box{

    private int length,breath,height; // Variable declaration
    // These are called Instance variable
    // above used private int... is called properties

    public void setDimension(int l ,int b, int h ) {

        length=l; breath=b; height=h;  // From public void to height h is the function

    }

    public void showDimension() {

        System.out.println("L=" + length);
        System.out.println("B=" + breath);
        System.out.println("H=" + height);

        // It is the second function and

        // And public void setDimension and showDimension is called as methods
    }

}



public class Example  {
    public static void main(String[] args) {

            Box smallBox=new Box();
            smallBox.setDimension(12,10,5);
            smallBox.showDimension();
            smallBox=new Box();
            smallBox.showDimension();
    }
}
*/










/*public class Example {

    int x;     //Instance variable
    static int y; // static member variable

    public void fun1() {
    }  // Instance member function

    public static void fun2( ) {
        y=4;
    }  // Static member function


    static class test{
        public static String country="India";
    }

    public static void main(String[] args) {

        Example ex1= new Example();
        Example ex2= new Example();   // Two object banaye toh doo baar x banega kiyuki yeh instance variable hai
        // jitne object banaoge sbke andar x hoga par y kisi ke object ke andar nhi hoga

        Example.y=5;
        Example.fun2();
        System.out.println(Example.test.country);

        // For Example hm instance variable isliye banate hai kiyuki
        // agar socha jaye ki bank ka acc. number , balanace lekin rate of interest toh sbka same hoga toh usko static banayege
    }



} */
















/*


         public class Example {


       public static void main(String[] args) {

                  Integer i1=   Integer.valueOf("123");  // Interger class ke valueOf ko call kiya gya hai toh woh integer class ka hi object banayega aur woh object ke andar value rakhega 123
                     Double d1=        Double.valueOf("3.14");



                    int a= Integer.parseInt("123");  // Integer type mein jo function hai uska naam hai pasrseInt
                    double b= Double.parseDouble("13.45");
   //Static fn hai isliye integer class ka naam hai


                    int c= i1.intValue();
           System.out.println(c);



          }
       }

*/









   // Access modifier private , protected, public default during outer class we can never made outer class private or protected either it should be public or default



/*public class Example {
    private int l,b,h;

    public Example(){

        l=10;
        b=8;
        h=4;}

    public Example(int L, int B, int H){

        l=L; b=B;
        h=H;

    }

    public static void main(String[] args) {

        Example b1= new Example();
        Example b2= new Example(10, 20 ,30);




    }

}
*/




            //    INHERITANCE FROM NOW ON





 /*public class Example{

          public static void main(String[] args) {


                  Student s1= new Student();

                  s1.setRollno(100);
                  s1.setName("Rahul");
                  s1.setAge(18);
                  System.out.println("Rollno: "+ s1.getRollno() );
                  System.out.println("Name: "+ s1.getName() );
                  System.out.println("Age: "+ s1.getAge() );




          }
  }


  */



 /*      public class Example{
                private int x; // Instance variable mein by default zero value hoti hai
               {
                       System.out.println("Initialization Block:x="+x);
                       x=5;  // Instance Initialization block
                       // isme return type nhi intemaal kiya ja skta
               }

               public Example()
               {
                       System.out.println("Constructor:x="+x);

               }

               public static void main(String[] args) {
                       Example  t1=new Example();
                               Example t2=new Example();

                            // Yaha 2nd object mein Initialization block mein x ka value 5 nhi hoga kiyuki haar object ke
                       //   x alag alag hota hai

               }


        }





  */










//    public class Example{
//
//            private static int k; // Yeh puri class ke liye ek hota hai aur ek hi baar chalta hai
//            static  // Static likh diye isliye static block kaha jayega
//            {
//                    System.out.println("Static Initialization Block: k="+k);
//                    k=10;
//            }
//
//        public static void main(String[] args) {
//                new Example(); // Object banayege toh ek hi baar chalega
//
//
//
//
//        }
//
//
//}









                // Overloading and Overriding


                // Phele Overloading

//  class Example1{
//
//      public void f1(int x){
//          System.out.println("Example");
//
//         }
//  }
//
//
//
//      class Example2 extends Example1{
//
//      public void f1(int x, int y){
//          System.out.println("Example2");
//
//      }
//
//      }
//
//      public class Example{
//
//          public static void main(String[] args) {
//
//                Example2 obj=new Example2();
//                obj.f1(5);
//                obj.f1(3,4);
//
//                // Function ka naam same hoga toh chalega
//
//
//
//          }
//      }




             // Overriding








//class Example1{
//
//      public void f1(int x){
//          System.out.println("Example");
//
//         }
//  }
//
//
//
//      class Example2 extends Example1{
//
//      public void f1(int x){
//          System.out.println("Example2");
//
//      }
//
//      }
//
//      public class Example{
//
//          public static void main(String[] args) {
//
//                Example2 obj=new Example2(); // Yaha child class ka object banaye hai toh uska   hi function call karega or example 2 ne example1 ko inherit kr diya hai toh preference  example 2 ko milt hai
//                obj.f1(5);
//                // for example ,       example 1 ko car or example 2 ko sports car toh doono shift gear alag alag kaam karega toh diffrent use krne ke liye usko alag alag likte hai
//
//
//                // Function ka naam same hoga toh chalega
//
//
//
//          }
//      }









                // FINAL  KEYWORD






            // instance variable shuru mein agar print kiye toh woh 0 dikhata hai without bina value assign kiye huye
            // agar usko final banate hai toh woh blank rehta hai unless or untill koi value provide nhi kiye jaye






          // final class Dummy{  }
          // iska yeh matlab hai ki jb hm final class banayege toh usko inherit aka extends karege toh woh nhi hoga





//        class Dummy{
//
//           public  void someFunction()
//                   // Agar public final void someFunction() likh de toh usko child class inherit nhi kr payega // override nhi hoga
//            {
//
//            }
//        }
//
//
//        class MoreDummy extends Dummy{
//
//            public void someFunction(){  // Overriding
//
//
//
//
//            }
//
//        }
//
//
//
//        public class Example{
//
//            private final int x; {
//                x=5; // Initiazation block
//
//            }// Instance member variable
//
//           // agar final likhte hai aur initilize krte hai toh
//            // toh woh blank rahega aur agar final istemal nhi krte hai toh usko blank final variable
//            // uska value 0 hoga
//
//
//            //another method to do that is to make
//            // constructor Example() { x=5;}
//
//
//
//            private final  static int y;
//
//                // static member variable
//
//            static{
//                y=10; // Naahi toh direct int y=10; likh skte hain
//            }
//
////            Example(){
////
////                x=10;
////
////            }
//
//
//
//                // final local variable
//
//            public void fun()
//            {
//                // int k;      // local variable by default blank hote hai
//
//                // k+=1; will not work because k ka koi value nhi nahi hai toh
//                // phir plus kaise karega isko use krne se phele intizise krna jaruri hai
//
//
//                final int k; //final local variable or yeh aabhi bhi blank hai or final likh diye  hai toh isko ek hi baar use kr skte hai
//
//
//            }
//
//
//
//            public static void main(String[] args) {
//
//                Example e1= new Example();
//
//            }
//
//         }









                    // THIS KEYWORD





// class Box
// {
//
//     private int l,b,h;
//
//     public void setDimension(int x, int y, int z) // xyz local variable hai  // setDimension box class ka instance member fn  hai
//
//     {
//
//         l=x; b=y; h=z; // xyz ko wahi fn access kr skta hai kiyuki woh local variable hain
//
//
//         // only l likhege toh local ko preference milega aur agar this.l=l; likhege toh instance ko prefer milega
//        // this use hota hai callar object ko refer krne ke liye
//     }
//
//
//
//
//
// }
//
//
//  public class Example{
//
//
//      public static void main(String[] args) {     // static member fn hai
//
//
//
//
//          Box b1 =new Box();
//          b1.setDimension(12,10,5);  //  setdim fn jis object ke liye banaya haib woh callar object khelayega
//
//
//
//
//      }
//  }




// Constructor mein bhi this function hota hai






              // SUPER KEYWORD




//       class A{
//
//           int x;
//
//           public void f2(){
//
//
//           }
//       }
//
//
//       class B extends A
//       {
//
//            int y;
//           public void f1 ()
//           {
//
//               //this
//               // super  ,,,, this or super new B object ko hi refer kr rahe hoge
//
//            // this refers to B (subclass)and super refers to A (superclass)
//
//
//               //f2 kr ke bhi class A ka fn call kr skte hai lekin jb fn ka naam f1 and f1 ho tb super.f1 likhna hoga
//           }
//
//
//           public void f3 ()
//           {
//
//               int z;  // local varaible aur instance vARIABLE KA NAAM SAME HO JAYEGA TOH PREFERENCE LOCAL KO MILEGA
//
//               z=1;
//               y=2;
//
//               x=3;
//           }
//
//
//
//       }
//
//
//
//
//
//
//
//       class Example{
//
//           public static void main(String[] args) {
//               B obj =  new B();
//
//               // A obj =new b() ,,,, yeh bhi kr skte hai
//               obj.f1();
//               obj.f2();  // yeh z ko call karega aur y instance hai or y inherit kr raha hai x ko
//           }
//       }









//class A{
//
//    int z;
//
//    public void f2(){
//
//
//    }
//}
//
//
//class B extends A
//{
//
//    int z;
//    public void f1 ()
//    {
//
//        //this
//        // super  ,,,, this or super new B object ko hi refer kr rahe hoge
//
//        // this refers to B (subclass)and super refers to A (superclass)
//
//
//        //f2 kr ke bhi class A ka fn call kr skte hai lekin jb fn ka naam f1 and f1 ho tb super.f1 likhna hoga
//    }
//
//
//    public void f3 ()
//    {
//
//        int z;  // local varaible aur instance vARIABLE KA NAAM SAME HO JAYEGA TOH PREFERENCE LOCAL KO MILEGA
//
//        z=1;
//        this.z=2; // refer to sub class (B class)
//        super.z=3; // refer ko super class (A class)
//    }
//
//
//
//}
//
//class Example{
//
//    public static void main(String[] args) {
//        B obj =  new B();
//
//        // A obj =new b() ,,,, yeh bhi kr skte hai
//        obj.f1();
//        obj.f2();  // yeh z ko call karega aur y instance hai or y inherit kr raha hai x ko
//    }
//}
















            // STATIC MEMBER IN INHERITANCE

  // PUBLIC VOID NAME(YEH JO PARAMETER HAI USKO SIGNATURE BHI BOLTE HAI )
   // Static member variable do not herit


//           class Parent
//           {
//           public static void fl ()
//               {
//              System.out.println("hello");
//                }
//           }
//
//             class Child extends Parent
//             {   // Agar same naam ka function nhi bana hai child class mein,,,,, parent class ka function print hoga
//                 // toh hmlog bolege yeh inherit ho raha hai
//                 // parent class ka function inherit hoga issse koi matlab nhi h ki woh satic ho ya na ho
//
//
//                 // Aur yeh Overriding nhi hai kiyuki waha satic nhi hota hai
//
//                 // agar parent class mein static hota hai toh usko bolege fn hiding aur alag nhi hota hai toh usko bolege fn overriding
//                 // lekin aisa nhi ho skta ki child class non static ho
//                 public static void fl ()
//                 {
//                     System.out.println("Buddy");  // agar isko run karege toh Buddy print hoga hai parent
//                     // class ka f1 hide ho jayega
//                 }
//
//
//
//             }
//    public class Example {
//        public static void main(String[] args) {
//            Child.fl();  // call karene ke liye class ka naam aur uska fn ka naam likhna hota hai static ke liye
//        }
//    }




// Static member variable do not inherit
//class Parent{
//        static int y=4;}
//class Child extends Parent{
//
//    // Agar yaha static int y=....; likhte toh yeh parent wale  ko hide kr deta
//
//    static
//    { y=5;} // constructor
//
//}
//
//public class Example {
//    public static void main(String[] args) {
//
//        System.out.println("y="+Child.y); // y=4 yeh parent block ko use karega ,,,,, compile ke time yeh child class ko parent class mein badal dega
//    }
//       }











       // CONSTRUCTOR IN INHERITANCE





//class A{
//
//            int a;
//            public A(){
//                  System.out.println("A");
//
//
//
//                  // lekin  public A(int x){
//                            // a=x;
//                  //                  System.out.println("A");
//            }
//      }
//
//
//      class B extends A
//      {
//
//            int b;
//            public B()
//            {       // Toh yaha Super(yaha argument dekar);
//                  System.out.println("B");
//
//                  // Yaha hmlog ne class B ka object banaya toh class b ka constructor call hoga
//                  // lekin hmlogo ne b ko extend kiya hai usse phele class A ka constructor call karege
//                  // toh doono print hoga
//                  // lekin aagar B class ka constructor ke phele hi super(); likh de toh Class A ka constructor ko call karega
//                  // aur yeh clas A ke deafult constructor ko call karega jisme koi parameter ya signature nhi hai
//            }
//      }
//
//
//
//      public class Example{
//
//            public static void main(String[] args) {
//                  B obj = new B();
//
//            }
//      }








              // CONSTRUCTOR IN CHAINING







//          class A{
//
//                public A(){
//                      System.out.println("A 1");
//                }
//          }
//
//
//
//          class B extends A
//          {
//
//                public B ()
//                {
//
//                      this(4); // This likhne ke baad super wala exist nhi karega
//                      System.out.println("B 1");
//
//                }
//
//                public B(int k)
//                {     // yaha pr supper deafault likha hua hain
//                      System.out.println("B 2");
//                }
//          }
//
//
//
//
//          public class Example{
//                public static void main(String[] args) {
//
//                      B o1= new B();
//
//                }
//          }








               // ABSTRACT CLASS IN JAVA



// class ka method abstract hai toh uske class ke aage abstract likhna jaruri hai



/*      abstract class  Myclass
       {
              abstract void calculate(double x);
       }



       class sub1 extends Myclass
       {

              void calculate(double x){  // Agar yaha super class aka Myclass ke method ko override nhi karege toh
                                         // sub1 class jo extend kiya hai my class uska method bhi call ho jayega ,,,,, aur woh method bhi abstract hai toh
                                         // toh sub1 class ko bhi abstract banana hoga toh phir uska object nhi ban payega isliye super claas ka method define krna jaruri hai
                                       //
                     System.out.println("Square="+(x*x));
              }
        }


class sub2 extends Myclass
{

       void calculate(double x){
              System.out.println("Square root ="+(Math.sqrt(x)));
       }
}




class sub3 extends Myclass
{

       void calculate(double x){
              System.out.println("Cube="+(x*x*x));
       }
}




              class Diffrent{
                     public static void main(String[] args) {
                            sub1 Tanjiro = new sub1();
                            sub2 Kanao = new sub2();
                            sub3 Inosuke  = new sub3();

                            Tanjiro.calculate(3);
                            Kanao.calculate(4);
                            Inosuke.calculate( 5);




                            Myclass ref;

                            ref=Tanjiro;
                            ref.calculate(4);

                            ref=Kanao;
                            ref.calculate(5);

                            ref=Inosuke;
                            ref.calculate(5);





                     }
              }



*/








                            // INTERFACE







  // Interface class ke andar saare variable public hai



// Interface mein abstract method ke alawa koi aur method banta hi nhi hai
// Variable public or by default static aur final bhi hai sab h yeh


// Abstract class ke subclass constructor ko call karega lekin Interface ke subclass super class ke constructor ko call
// nhi karega kyuki waha pr phele se static hai













//public class Example {
//
//    public static void main(String[] args) {
//        int n = 6987;
//        int sum = 0;
//
//        while (n > 0) {
//            int digit = n % 10;
//            if (n % 2 == 0) {
//                sum += digit;
//            }
//            n /= 10;
//        }
//
//        System.out.println("The sum of alternate digits of " + n + " is " + sum);
//    }
//}











                             /// DEFAULT THROW OUR CATCH

//
//             class Example{
//
//                 public static void main(String[] args) {
//
//
//                     try {                                                               // try ka pura block hm bahot baar bana skte hai
//
//                         System.out.println(3 / 0);  // Iss jagha java ne arithematic class ka object bnanaya or throw kiya  jisko catch block catch karega
//                         System.out.println("In Try");
//                     }
//
//                     catch(ArithmeticException e) { // Catch ek aur usse jada bhi bana skte hai
//                         System.out.println("Exception: " + e.getMessage());
//                     }
//
//                     System.out.println("Hello");
//
//
//                        // Agar Finally banayege toh chalna hi hai
//
//
//                    }
//
//
//                 }








                     // OUR throw default catch




//class Example{
//    public static void main(String[] args) {
//
//        int balance=5000;
//        int withdrawlAmount=6000;
//
//
//
//
//            if (balance < withdrawlAmount)
//                throw new ArithmeticException("Insufficient balance");
//            balance -= withdrawlAmount;
//            System.out.println("Transaction Succcesfully Completed");
//        System.out.println("Program Continue....");
//
//
//        }
//
//
//    }




















                 // OUR THROW OUR CATCH



//class Example{
//    public static void main(String[] args) {
//
//        int balance=5000;
//        int withdrawlAmount=6000;
//
//try {
//
//
//    if (balance < withdrawlAmount)
//        throw new ArithmeticException("Insufficient balance");
//    balance -= withdrawlAmount;
//    System.out.println("Transaction Succcesfully Completed");
//
//
//}
//         catch(ArithmeticException e){
//
//             System.out.println("Exception: "+ e.getMessage());
//         }
//        System.out.println("Program Continue....");
//
//
//    }
//
//    }





//import java.util.*;
//class MarksOutOfBoundException extends Exception {
//    MarksOutOfBoundException(String m) {
//
//
//        super(m);
//    }
//}
//class Example{
//
//
//        public static void main(String[] args) {
//            Scanner obj = new Scanner(System.in);
//            System.out.println("Enter the name of the Student :");
//            String name = obj.nextLine();
//            System.out.print("Enter marks ");
//            try {
//                double mark = obj.nextInt();
//                if (mark > 100)
//                    throw new MarksOutOfBoundException("Mark can't be greater than lee");
//                System.out.println(name + " has got " + mark);
//            }
//catch(MarksOutOfBoundException e){
//                    System.out.println(e);
//
//                }
//
//            }
//        }


//import java.util.Scanner;
//
//public class Example{
//
//                     public static void main(String[] args) {
//
//                         Scanner sc = new Scanner(System.in);
//                         System.out.println("Enter Your weight");
//                         double w= sc.nextDouble();
//                         System.out.println("Enter Height");
//                         double h = sc.nextDouble();
//
//                         double bmi= w/(Math.pow(h,2));
//
//                         String a=" ";
//
//                         if (bmi<18.5)
//                             a="Underweight";
//                         else if (bmi<24.5)
//                             a="Normal";
//                         else if (bmi<29.5)
//                             a="Overweight";
//                         System.out.println(a);









//          class Example{
//
//              static int x=-55;
//
//              public static void main(String[] args) {
//                  Example obj1 =new Example();
//                  obj1.x=obj1.x*2-66;
//                  System.out.println(obj1.x);
//                  Example obj2 = new Example();
//                  obj2.x=obj2.x+66;
//                  System.out.println(obj1.x +" "+ obj2.x);
//
//
//              }
//static{
//    System.out.println(x);
//}
//
//
//
//                     }






//    abstract class shape{
//        abstract double getArea();
//    }
//
//
//    class square extends shape{
//        double side;
//
//        square(double s){
//
//            side=s;
//        }
//
//        double getArea(){
//
//            return side*side;
//        }
//    }
//
//
//    class triangle extends shape{
//        double base,height;
//        triangle(double h, double b){
//            base=b;
//            height=h;
//        }
//
//        double getArea(){
//            return 0.5 * base* height;
//        }
//    }
//
//
//    class circle extends shape{
//
//        double radius;
//        circle(double r){
//            radius=r;
//        }
//
//        double getArea(){
//            return Math.PI * radius* radius;
//        }
//    }
//
//
//
//      public class Example {
//          public static void main(String[] args) {
//
//
//              shape shape1= new square(5);
//              shape shape2= new triangle(10,70);
//              shape shape3= new circle(5);
//
//              System.out.println("Area of Square " + shape1.getArea());
//              System.out.println("Area of Triangle "+ shape2.getArea());
//              System.out.println("Area of Circle "+ shape3.getArea() );
//
//
//
//          }
//
//      }





//  abstract class shape{
//      abstract double getArea();
//
//  } 
//
//
//  class square extends shape{
//
//      double side;
//      square(double s){
//          side=s;
//      }
//
//      double getArea(){
//          return side*side;
//      }
//  }
//
//
//   class triangle extends  shape{
//      double height;
//      double base;
//      triangle(double h , double b){
//          height=h;
//          base=b;
//      }
//
//      double getArea(){
//          return 0.5 * base * height;
//      }
//   }
//
//   class circle extends shape{
//      double radius;
//
//      circle (double r){
//          radius =r;
//
//      }
//
//      double getArea(){
//          return Math.PI * radius * radius;
//      }
//
//   }
//
//
//
//        public class Example {
//            public static void main(String[] args) {
//
//
//                shape shape1= new square(5);
//                shape shape2 = new triangle(30,40);
//                shape shape3 = new circle (20);
//
//                System.out.println(shape1.getArea());
//                System.out.println(shape2.getArea());
//                System.out.println(shape3.getArea());
//
//
//
//
//            }
//
//        }











//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    public LinkedList() {
//        this.head = null;
//    }
//
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//    }
//
//    public void reverse() {
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        head = prev;
//    }
//
//    public void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}
//
//public class Example {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//
//        System.out.println("Original List:");
//        list.display();
//
//        System.out.println("Reversed List:");
//        list.reverse();
//        list.display();
//    }
//}






                // Generic class


//      public class Example{
//
//          public void printArray( String []s){
//
//              for(int i=0; i<s.length; i++)
//                  System.out.println(s[i]);
//          }
//
//
//          public void printArray( int []n){
//
//              for(int i=0; i<n.length; i++)
//                  System.out.println(n[i]);
//          }
//
//          public static void main(String[] args) {
//
//              Example e1=new Example();
//              String countries[]= {
//                      "India" , "Nepal"
//              };
//
//              int numbers []={ 12,13,14,15
//
//              };
//
//              e1.printArray(countries);
//              e1.printArray(numbers);
//
//          }
//      }







                          //GENERIC  METHOD <E>  



//    public class Example {
//        public <E> void printArray(E [] s) {
////            for (int i = 0; i < s.length; i++) {
////                System.out.println(s[i]);
////            }
//
//             for( E  x:s)
//                System.out.println(x);
//        }
//
//
//
//
//
//        public static void main(String[] args) {
//
//            Example e1= new Example();
//
//            String countries[]={ "India ", "Sri lanka ", "Nepal"};
//            Integer numbers[]={ 11,11,23,35};
//
//           e1.printArray(countries);
//           e1.printArray(numbers);
//
//                //Type parameters can represent only
//            //reference types, not primitive types (like
//            //double and char)
//            //1
//
//
//        }

//
//    }

 