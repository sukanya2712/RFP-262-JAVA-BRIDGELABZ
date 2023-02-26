package IfElse_Statement_Programs;

import java.util.Scanner;

public class DisplayDigitsPlaceValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no : ");
        int number=sc.nextInt();

        int digitcount=0;
        while(number>0){
            number=number/10;
            digitcount++;
        }

        if(digitcount ==1){
            System.out.println("The Number is Unit");
        }else if(digitcount==2){
            System.out.println("The Number is Ten");
        }else if(digitcount==3){
            System.out.println("The Number is Hundred");
        }else if(digitcount==4){
            System.out.println("The Number is Thousand");
        }else if(digitcount==5){
            System.out.println("The Number is Tens of Thousand");
        }else if(digitcount==6){
            System.out.println("The Number is Hundreds of Thousand");
        }else if(digitcount==7){
            System.out.println("The Number is One Million");
        }else if(digitcount==8){
            System.out.println("The Number is Tens of Millions.");
        }else if(digitcount==9){
            System.out.println("The Number is Hundreds of Millions");
        }else if(digitcount==10){
            System.out.println("The Number is Billions");
        }
    }
}
