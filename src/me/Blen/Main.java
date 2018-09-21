package me.Blen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, please enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int result=0;
        do {
            if(number%2 ==0){
                result = number / 2;
                System.out.print(" " + result);
                number = result;
            }else{
                result = number * 3;
                result = result + 1;
                System.out.print(" " + result);
                number = result;

            }
        }while(result!=1);

  }
}
