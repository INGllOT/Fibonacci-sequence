public class Fib {
    int a ,b ,c, d ;


    void setN (int n){

        if(n>0){

            int[] arr = new int[2];

            arr[0]=1;
            for (c = 0; c < n; c++) {

                a = arr[0] + arr[1];
                arr[0] = arr[1];
                arr[1] = a;

                System.out.println("Sequence "+  (d=c+1)  + " = " + a  );

            }




        }else {System.out.println("n is less or equal 0;"); }


    } // end of method






}
