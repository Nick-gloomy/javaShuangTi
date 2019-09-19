package inClass;

import java.util.Scanner;

public class menu {


    public static void main(String[] args) {

        Scanner sac = new Scanner(System.in);


        boolean a=true;
        boolean b=true;
      do {


          System.out.println("--------------------------");
          System.out.println("|                        |");
          System.out.println("|  1.登录 2.退出 3.注销  |");
          System.out.println("|                        |");
          System.out.println("--------------------------");
          int first = sac.nextInt();
          switch (first) {
              case 1:
                  do {
                      System.out.println("------------------------------------");
                      System.out.println("|                                  |");
                      System.out.println("|  1:取款  2:存款  3:查询  4:注销  |");
                      System.out.println("|                                  |");
                      System.out.println("------------------------------------");
                  int second = sac.nextInt();

                  switch (second) {
                      case 1:
                          System.out.println("-------------");
                          System.out.println("| 取款中。。|");
                          System.out.println("-------------");
                          break;
                      case 2:
                          System.out.println("-------------");
                          System.out.println("|   请放入  |");
                          System.out.println("-------------");
                          break;
                      case 3:
                          System.out.println("------------");
                          System.out.println("|   余额0  |");
                          System.out.println("------------");
                          break;
                      case 4:
                          System.out.println("--------------");
                          System.out.println("|  注销成功  |");
                          System.out.println("--------------");
                              b=false;
                          break;
                          default:
                              b=true;
                  }
                  }while (b);

                     break;
              case 2:
                  System.out.println("--------------");
                  System.out.println("|退出程序成功|");
                  System.out.println("--------------");
                  a = false;
                  break;
              case 3:
                  System.out.println("----------");
                  System.out.println("|  注销  |");
                  System.out.println("----------");
                  break;
          }

      }while (a);


} }
