package inClass;

import java.math.BigInteger;

public class multiplication {

     public static void main(String[] args){


         BigInteger result= new BigInteger("1");
         BigInteger b= new BigInteger("0");
         BigInteger add = new BigInteger("1");
//         double result= 1;

         for ( int a=1; a<=100;a++){
              b =  b.add(add);
             result = result.multiply(b) ;
//             result *= a ;
             if (a!=100){
             System.out.print(a+"*");}
             else {
                 System.out.println(a);

             }

         }
         System.out.print("="+result);
      }

}
