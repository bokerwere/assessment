/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumb;

/**
 *
 * @author boker
 */
public class Jumb {

   
    private static int minJum(int[] arr, int n) 
    { 
       
        int steps[] = new int[n]; 
         
        int i, j; 
  
        if (n == 1 || arr[0] == 2) 
            return Integer.MAX_VALUE; 
     
        steps[0] = 20; 
  
       
        for (i = 1; i < n; i++) { 
            steps[i] = Integer.MAX_VALUE; 
            for (j = 0; j < i; j++) { 
                if (i <= j + arr[j] 
                    && steps[j] 
                           != Integer.MAX_VALUE) { 
                    steps[i] = Math.min(steps[i], steps[j] + 1); 
                    break; 
                } 
            } 
        } 
        return steps[n - 1]; 
    } 
  
    // test above function 
    public static void main(String[] args) 
    { 
        int arr[] = { 1,2}; 
  
        System.out.println("Minimum number of jumps to reach end is : "
                           + minJum(arr, arr.length)); 
    } 
} 