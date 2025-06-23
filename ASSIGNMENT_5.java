
import java.util.Scanner;

public class ASSIGNMENT_5 {

    public static void main(String[] args) {


                 // Ques 2 Twisted Prime
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int n=sc.nextInt();
//
//        int num=n;
//        int rev=0;
//
//        while(n!=0){
//            int digit= n%10;
//            rev=rev*10+digit;
//            n=n/10;
//        }
//         if(num%2==0 || rev%2==0)
//             System.out.print(num + " is not a twisted prime ");
//         else
//             System.out.print(num +" is a twisted prime ");
//



       //Ques.8    1+ (1+2)+(1+2+3)+ ...(1+2+3+4+n)


        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter Your Number: ");
        int n=sc.nextInt();

        int i,j=0,k=0;
        for( i=1; i<=n; i++){
            j=j+i;
            k=k+j;
        }
        System.out.println(" sum of series " + k);




          //Ques9   1/1^2 +1/2^2 + .... 1/n^2


//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int n=sc.nextInt();
//         double a=0;
//         for( int i=1; i<=n; i++){
//
//             double b=1/(Math.pow(i,2));
//                     a=a+b;
//         }
//        System.out.print(a);
//


        // Ques


//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Your No :");
//        int n=sc.nextInt();
//        double sqrt = Math.pow(n,1.0/2);
//        System.out.println(sqrt);
//


        // Ques 10
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter Your Number: ");
//        int n= sc.nextInt();
//
//        int a=0, b=1,c=1;
//
//        System.out.print(a+" " + b + " " + c);
//
//        for(int i=1; i<=n; i++){
//
//            int d=a+b+c;
//            System.out.print(d + " ");
//            a=b;
//            b=c;
//            c=d;
//        }
//




                //QUES 4
//
//        Scanner sc= new Scanner (System.in);
//        System.out.print(" Enter Your First Number: ");
//        int a=sc.nextInt();
//        System.out.print(" Enter Your Second  Number: ");
//        int b=sc.nextInt();
//
//
//
//        for(int i=a; i<=b; i++){
//
//            int fact=1;
//            for(int j=1; j<=i; j++){
//
//                fact=fact*j;
//
//            }
//
//            System.out.println(" factorial of " +i+ "is:"+ fact);
//        }












































            //HOME ASSIGNEMT


        //QUES 3

//        Scanner sc = new Scanner (System.in);
//        System.out.println(" enter value of n :");
//        double n=sc.nextDouble();
//
//        double a=n,b=0;
//
//        int i=1;
//
//        do{
//            b=b+a;
//            i=i+2;
//            a=-a*n*n/(i*(i-1));
//
//         }
//
//        while ( Math.abs(a)>0.00001);
//        {
//            System.out.print(b);
//        }




            //Home Ques 4

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" enter a number :");
//        double n=sc.nextDouble();
//        double a=1; double b=0;
//        int i=0;
//
//        do{
//            b=b+a;
//            i=i+2;
//            a=-a*n*n/(i*(i-1));
//
//        }
//
//        while( Math.abs(a)>0.00001);
//
//        System.out.print(b);


                                               // Home Assignment5

             // Fibonacci sequence



//                Scanner sc = new Scanner(System.in);
//                System.out.print("Enter the number of terms: ");
//                int n = sc.nextInt();
//                int firstTerm = 0, secondTerm = 1;
//
//              System.out.print("Fibonacci Series up to " + n + " terms: ");
//
//
//
//              for (int i = 1; i <= n; i++) {
//                    System.out.print(firstTerm + " ");
//
//                    int nextTerm = firstTerm + secondTerm;
//                    firstTerm = secondTerm;
//                    secondTerm = nextTerm;
//
//                }



















    }
}
