public class MultidimensionArray28 {

    public static void main(String[] args) {

        int [] marks;
        int [][]flats;

        flats=new int [2][3]; // [2] shows the number of rows and [3] shows number of columm
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        System.out.println("printing a 2d array using loop");
        for(int i=0; i<flats.length; i++) {
            for(int j=0; j<flats[i].length; j++) { // phele inner loop chalega and element print hoga

                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");
        }






    }
}
