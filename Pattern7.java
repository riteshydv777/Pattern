//
//  * * *   * * *   st = n /2 + 1
//  * *       * *   sp = 1 ;
//  *           *
//  * *       * *
//  * * *   * * *


import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();

        int st = n/2 + 1 ;
        int sp = 1 ;
        for(int i = 1 ; i <= n ; i++){
            // for star
            for(int j = 1 ; j <= st ; j++){
                System.out.print("*\t");
            }
            // for space
            for(int j = 1 ; j <= sp ; j++){
                System.out.print("\t");
            }
            //for star
            for(int j = 1 ; j <= st ; j++){
                System.out.print("*\t");
            }
            
            if(i <= n/2){
                st-- ; 
                sp+=2 ;
            }else{
                st++ ;
                sp-=2 ;
            }
            System.out.println();
        }
    }
}