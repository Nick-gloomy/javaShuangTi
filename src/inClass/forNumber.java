package inClass;

//用三种循环计算1-100偶数的和
public class forNumber {

    public static void main(String[] args){

        int addNum1=0;
        int addNum2=0;
        int addNum3=0;
        int a=0;
        int b=0;

        for (int i=0;i<=100;i++){
            if (i%2==0){
                addNum1 += i;
            }

        }

        do {
            if (a%2==0){
                addNum2 += a;
            }
            a++;
        }while (a<=100);

        while (b <= 100){
            if (b%2==0){
                addNum3 += b;
            }
            b++;
        }

        System.out.println(addNum1);
        System.out.println(addNum2);
        System.out.println(addNum3);

    }
}
