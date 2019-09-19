package inClass;

public class multiplicationTables {
     public static void main(String[] args){

         int result=0;

         for (int a=1;a<=9;a++){

             for (int b=1;b<=9;b++){
                 if (a==b-1){
                     System.out.println();
                 }
                 if (a<b){

                     continue;
                 }else {
                     result = a*b;
                     System.out.print(a+"*"+b+"="+result+" ");
                 }
             }

         }
      }
}
