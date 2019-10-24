package works.hw3;

import java.util.Scanner;
import  java.lang.String;
public class HomeWork3 {
   public static boolean WeekD(String ss) {
      boolean cmpr =false;
      if(ss.equalsIgnoreCase("monday")
              ||ss.equalsIgnoreCase("tuesday")
              || ss.equalsIgnoreCase("wednesday")
              || ss.equalsIgnoreCase("thursday")
              || ss.equalsIgnoreCase("friday")
              || ss.equalsIgnoreCase("saturday")
              ||ss.equalsIgnoreCase("sunday")) return cmpr=true;

              else return cmpr;
       }
       public static void main (String[]args){
           Scanner sc = new Scanner(System.in);
           String scedule[][] = {
                   {"Monday", " go to university ; read a book"},
                   {"Tuesday", " do your homework"},
                   {"Wednesday", " go sport"},
                   {"Thursday", " clean a room"},
                   {"Friday", " meeting with friend"},
                   {"Saturday", " have a rest"},
                   {"Sunday", " prepare to new week"}
           };
           System.out.println("Please, input the day of the week:");
           String ustr = sc.nextLine();
           String ustrr = ustr.toLowerCase();


           for (; ; ) {
               if (WeekD(ustrr)) {
                   switch (ustrr) {

                       case "monday":
                           System.out.println("Your task for " + scedule[0][0] + ":" + scedule[0][1]);
                           break;
                       case "tuesday":
                           System.out.println("Your task for " + scedule[1][0] + ":" + scedule[1][1]);
                           break;
                       case "wednesday":
                           System.out.println("Your task for " + scedule[2][0] + ":" + scedule[2][1]);
                           break;
                       case "thursday":
                           System.out.println("Your task for " + scedule[3][0] + ":" + scedule[3][1]);
                           break;
                       case "friday":
                           System.out.println("Your task for " + scedule[4][0] + ":" + scedule[4][1]);
                           break;
                       case "saturday":
                           System.out.println("Your task for " + scedule[5][0] + ":" + scedule[5][1]);
                           break;
                       case "sunday":
                           System.out.println("Your task for " + scedule[6][0] + ":" + scedule[6][1]);
                           break;
                       case "exit":
                           break;
                   }
                   break;}
         else{
                       System.out.println("Sorry, I don't understand you, please try again.");
                       ustr = sc.nextLine();
                       ustrr = ustr.toLowerCase();
                   }

               
           }
       }
   }


    

