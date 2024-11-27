package week_2;
//I nuber of cookies the user want to make
//P 1.5 cups of sugar / 1cup butter / 2.75 flower == 48 cookies
//O amount of suger , butter , and  flower they will need

import java.util.Scanner;

public class cookie_cal {
        public static void main(String[] args){
        int num_cookies ;
        double num_sugar;
        double num_butter;
        double num_flour;
            System.out.println("welcome to the cookies cal");
            System.out.println("how many cookies do you want to bake ?");
            Scanner cookies_requested   = new Scanner(System.in);
            num_cookies = cookies_requested.nextInt();
            System.out.println("you want to bake " + num_cookies +" cookie(s) ");
            num_sugar = (1.5/48)*num_cookies;
            num_butter = (1.0/48)*num_cookies;
            num_flour = (2.78/48)*num_cookies;
            System.out.println("---------");
            System.out.println("you will need this "+num_sugar+" many cups of sugar");
            System.out.println("you will need this "+num_butter+" many cups of butter");
            System.out.println("you will need this "+num_flour+" many cups of flour");


        }
    }

