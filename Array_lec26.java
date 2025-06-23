public class Array_lec26 {
    public static void main(String[] args) {

//
//      int marks[]=new int [5];
//         marks[2]=100;
//         marks[2]=164;
//        System.out.println(marks[2]);
//
//
//             int [] marks={20,134,5,3};
//
//        System.out.println(marks[1]);


        // code with harry code


        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
//        int [] marks = {98, 45, 79, 99, 80};
//
//        // marks[5] = 96; - throws an error
//        System.out.println(marks[1]);
//



           // lecture number 27;


        //int [] marks = {98, 45, 79, 99, 80};


//        float marks[]={72.3f,34.5f,3.4f,3.7f,1.5f};
//        String [] students={"harry brooks", "aryan", "aman"};
//        System.out.println(students.length);
//        System.out.println(students[2]);


//                                                                  int [] marks = {98, 45, 79, 99, 80};


        // System.out.println(marks.length);

        // Displaying the Array (Naive way)

        /*System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);*/


        // Displaying the Array (for loop)
//
//        for(int i=0; i<marks.length; i++){
//
//            System.out.println(marks[i]);
//
//        }
//
//
//        System.out.println("in reverse order ");
//
//        for(int i=marks.length-1; i>=0; i--){
//
//            System.out.println(marks[i]);
//
//        }


        //Quick Quiz: Displaying the Array (for-eachloop )

//        System.out.println("printing using for each looo");
//        for(int element:marks){
//            System.out.println(element);
//        }



          // lecture number - 28



        int array[] ={ 45,63,53,83,23,53,22,};

        for(int i=1; i<array.length; i++){
             int current=array[i];
             int j=i-1;
             while( j>=0 && current<array[j]){
                 array[j+i]=array[j];
                 j--;

             }
                     array[j+1]=current;

        }

        System.out.println(array);















    }

}
