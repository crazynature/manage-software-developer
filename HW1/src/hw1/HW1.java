/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author cjrjh
 */
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0;
        int num2 = 10;
        printBet(num1,num2);
    }
    
    
    //Given: two number
    //Return: none
    //Interpretation: print the number between two given number.
    public static void printBet(int num1, int num2){
        int first;
        int second;
        if(num1 > num2){
            first = num2+1;
            second =num1;
        }
        else{
            first = num1+1;
            second = num2;
        }
        for(int i = first; i<second; i++){
            if(i%2==0)
            System.out.println(i);
        }
    }
    
}
