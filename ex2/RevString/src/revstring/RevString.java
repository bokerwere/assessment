/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revstring;

import java.util.Scanner;

/**
 *
 * @author boker
 */
public class RevString {

   
    public static String rev(String s ){
       
 //changestring into a char array
char ch[]=s.toCharArray();
String reverse="";
//For loop to reverse a string
for(int i=ch.length-1;i>=0;i--){
reverse+=ch[i];
}
return reverse;
}
        
        
         
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
         System.out.println("Enter string:");
        
        
        String s=input.nextLine();
         String temp=rev(s);
        System.out.println(temp);
        
    }
    
}
