import java.util.Scanner;
public class ARRAY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        int table[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        System.out.println(table.length);
//        for(int i = 0; i<=table.length-1; i++)
//        {
//            System.out.print(table[i]+" ");
//        }
//        System.out.println();
//        for(int j = table.length-1; j>=0; j--)
//        {
//            System.out.print(table[j]+" ");
//        }
//        System.out.println();







//        System.out.println("Enter length of Array.");
//        int n = sc.nextInt();
//        double sum = 0.0;
//        int marks [] = new int[n];
//        for(int i = 0; i<=n-1; i++)
//        {
//            marks[i] = (int)(1+Math.random()*100);
//            sum = sum+marks[i];
//        }
//        for(int j = 0; j<=n-1; j++)
//        {
//            System.out.print(marks[j]+" ");
//        }
//        System.out.println();
//        System.out.println("Sum = "+sum);
//        double average = sum/n;
//        System.out.println("Average = "+average);







//        int age[] = {1,2,3,4,5,6,7,7,88,};
//        int max = age[0];
//        for(int i = 0; i<=age.length-1; i++)
//        {
//            if(age[i]> max)
//            {
//                max = age[i];
//            }
//            else
//                max = age[0];
//        }
//        System.out.println(max);







//        System.out.println("Enter length of array");
//        int n = sc.nextInt();
//        int age [] = new int [n];
//        int max = age[0];
//        for(int i = 0; i<=n-1; i++)
//        {
//            age[i] = (int)(1+Math.random()*50);
//            System.out.print(age[i]+" ");
//            if(age[0] < age[i])
//            {
//                max = age[i];
//            }
//            else
//            {
//                max = age[0];
//            }
//        }
//        System.out.println();
//        System.out.println("Maximum age = "+max);




//
//        System.out.println("Enter length of array");
//        int n = sc.nextInt();
//        double sum = 0;
//        double avg;
//        int salary[] = new int[n];
//        for(int i = 0; i<=n-1; i++)
//        {
//            salary[i] = (int)(1+Math.random()*n);
//            sum = sum+salary[i];
//        }
//        for(int j = 0; j<=n-1; j++)
//        {
//            System.out.print(salary[j]+" ");
//        }
//        System.out.println();
//
//        System.out.println("Sum = "+sum);
//        avg = sum/n;
//        System.out.println("Average = "+avg);




        System.out.println("Enter array length.");
        int n = sc.nextInt();
        int value [] = new int[n];
        System.out.println("Enter inputs: ");
        for(int i = 0; i<n; i++)
        {
            value[i] = sc.nextInt();
        };

        for(int j = 0; j<=n-1; j++)
        {
            System.out.print(value[j]+" ");
        }
        System.out.println();





//        System.out.println("Enter length of Array:");
//        int n = sc.nextInt();
//        int date [] = new int[n];
//        int max = date[0];
//        for(int i = 0; i<n; i++)
//        {
//            date[i] = (int)(1+Math.random()*30);
//            System.out.print(date[i]+" ");
//        }
//        System.out.println();
//        for(int j = 0; j<n; j++)
//        {
//            if(date[j] > max)
//            {
//                max = date[j];
//            }
//            else
//                max = max;
//        }
//        System.out.println("Max value = "+max);



//        int date[] = {21, 22, 23, 24, 9, 5, 20};
//        int max = date[0];
//        for(int i = 0; i<date.length; i++)
//        {
//            if(date[i]>max)
//                max = date[i];
//            else
//                max = max;
//        }
//        System.out.println("Max value = "+max);



//        int age [] = {23,24,28,25,21,20};
//        int max = age[0];
//        int max2 = Integer.MIN_VALUE;
//        for(int i = 0; i<age.length; i++)
//        {
//            if(age[i]>max)
//                max = age[i];
//            else
//                max = max;
//        }
//        System.out.println("Max = "+max);

//        for(int j = 0; j<age.length; j++)
//        {
//            if(age[j] != max)
//            {
//                if(age[j]>max2)
//                    max2 = age[j];
//                else
//                    max2 = max2;
//            }
//        }
//        System.out.println("2nd max = "+max2);




//        int age[] = {12,15,40,58,93,44,74,97,9};
//        int max = age[0];
//        int max2 = Integer.MIN_VALUE;
//        for(int i = 0; i<age.length; i++)
//        {
//            if(age[i]>max)
//            {
//                max2 = max;
//                max = age[i];
//            }
//            else if(age[i]< max && age[i]>max2)
//            {
//                max2 = age[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(max2);



//        int age[] = {12,15,40,58,93,44,74,97,9};
//        int max = age[0];
//        int max2 = Integer.MAX_VALUE;
//        for(int i = 0; i<age.length; i++)
//        {
//            if(age[i]<max)
//            {
//                max2 = max;
//                max = age[i];
//            }
//            else if(age[i]> max && age[i]<max2)
//            {
//                max2 = age[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(max2);












    }

}

