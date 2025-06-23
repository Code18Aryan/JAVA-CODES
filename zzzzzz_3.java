import java.util.Scanner;
public class zzzzzz_3 {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }


    public static int calculateProduct(int a, int b) {
//        int prod = a*b;
//        return prod;
        return a * b;
    }


    public static int calculateSum(int a, int b) {
//        int sum = a+b;
//        return sum;
        return a + b;
    }


    public static int calculateDifference(int a, int b) {
        if (a >= b)
            return a - b;
        else
            return b - a;
    }


    public static int calculateRemainder(int a, int b) {
        return a % b;
    }


    public static double calculateSqrt(int a) {
        return Math.pow(a, 0.5);
    }


    public static void calculateFactorial(int a) {
        if (a < 0) {
            System.out.println("Invalid number.");
            return;
        }
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }


    public static boolean checkPrime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2)
            return true;

        else
            return false;
    }


    public static boolean reverseNumber(int a)
    {
        int b = a;
        int digit;
        int sum = 0;
        while (a > 0)
        {
            digit = a % 10;
            sum = sum * 10 + digit;
            a = a / 10;
        }
//        System.out.println("Reverse = " + sum);
        return true;
    }




    public static boolean getPalindrome(int a)
    {
        int b = a;
        int digit;
        int sum = 0;
        while (a > 0)
        {
            digit = a % 10;
            sum = sum * 10 + digit;
            a = a / 10;
        }
        if (b == sum) {
//            System.out.println("Palindrome");
            return true;
        } else {
//            System.out.println("Not palindrome");
            return false;
        }
    }


    public static double getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2.0;
    }


    public static int numberOfDays(int a) {
        if (a % 4 == 0 || a % 400 == 0) {
            return 366;
        } else
            return 365;
    }


    public static double areaOfPolygon(int n, double s) {
        return (n * s * s) / 4 * Math.tan(Math.PI / n);
    }


    public static int countChar(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }


    public static int countVowel(String str)
    {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;

            }
        }
        return count;
    }



    public static boolean checkPassword(String str)
    {
        String pass = "aditya3871";
        if(str.equals(pass))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);


//        System.out.println("Enter two numbers: ");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
////        int c = calculateSum(x,y);
////        int d = calculateProduct(x,y);
//        System.out.println("Sum of two numbers = "+calculateSum(x,y));
//        System.out.println("Difference of two numbers = "+calculateDifference(x,y));
//        System.out.println("Product of two numbers = "+calculateProduct(x,y));
//        System.out.println("Remainder of two numbers = "+calculateRemainder(x,y));


//        System.out.println("Enter your name: ");
//        String ad = sc.next();
//        printMyName(ad);


//        System.out.println("Enter a number for factorial: ");
//        int n = sc.nextInt();
//        calculateFactorial(n);


//        System.out.println("Enter a number for checking prime: ");
//        int w = sc.nextInt();
//        checkPrime(w);


//        System.out.println("Enter a number for reverse: ");
//        int q = sc.nextInt();
//        reverseNumber(q);


//        System.out.println("Enter a number for Square root: ");
//        int c = sc.nextInt();
//        System.out.println("Square root of "+c+" = "+calculateSqrt(c));


//        System.out.println("Enter value of n for pentagonal number: ");
//        int v = sc.nextInt();
//        System.out.println("Pentagonal number = "+getPentagonalNumber(v));


//        int sum = 0;
//        for(int i = 1; i<=10; i++)
//        {
//            for(int j = 1; j<=10; j++)
//            {
//                sum++;
//                System.out.print(getPentagonalNumber(sum)+"   ");
//            }
//            System.out.println();
//        }


//        System.out.println("Enter a number: ");
//        int b = sc.nextInt();
//        checkPrime(b);
//        if(checkPrime(b))
//        {
//            reverseNumber(b);
//            if(reverseNumber(b) == checkPrime(b))
//            {
//                System.out.println("Twisted prime");
//            }
//            else
//                System.out.println("Not twisted prime.");
//        }


//        System.out.println("Enter range:");
//        int a = sc.nextInt();
//        for(int i = 1; i<=a; i++)
//        {
//            if(checkPrime(i))
//            {
//                reverseNumber(i);
//                if(reverseNumber(i) == checkPrime(i))
//                {
//                    System.out.print(i+", ");
//                }
//            }
//        }


//        System.out.println("Enter year:");
//        int year = sc.nextInt();
//        System.out.println(numberOfDays(year));


//        System.out.println("Enter number of sides");
//        int num = sc.nextInt();
//        System.out.println("Enter length of sides");
//        double len = sc.nextInt();
//        System.out.println(areaOfPolygon(num,len));


//        System.out.println("Enter a string:");
//        String line = sc.nextLine();
//        System.out.println("Enter a character:");
//        char c = sc.next().charAt(0);
//        System.out.println("Number of " + c + " = " + countChar(line, c));



//        System.out.println("Enter a string: ");
//        String line1 = sc.nextLine();
//        System.out.println("Number of vowels = "+countVowel(line1));



//        System.out.println("Enter your Password:");
//        String line2 = sc.nextLine();
//        System.out.println(checkPassword(line2));



//        System.out.println("Enter range: ");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        for(int i = x; i<=y; i++)
//        {
//            if(checkPrime(i))
//            {
//                if(reverseNumber(i) == checkPrime(i));
//                {
//                    System.out.println(i+" is Twisted Prime.");
//                }
//            }
//        }



















    }

}

