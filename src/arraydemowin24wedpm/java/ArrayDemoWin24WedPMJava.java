/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemowin24wedpm.java;

import java.util.Scanner;

/**
 *
 * @author karan
 */
public class ArrayDemoWin24WedPMJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        Scanner input = new Scanner(Systen.in);
        
        
        String myWord = input.nextLine();
        char[] myLetters =  new char[myWord.length()];
        for(int i=0; i<myLetters.length;i++){
            myLetters[i]= myWord.charAt(i);
        }
        System.out.println("printing in  reverse");
        for(int i = myLetters.length-1;i>=0 ; i--){
        System.out.println(myLetters[i]);
    }
    
}
