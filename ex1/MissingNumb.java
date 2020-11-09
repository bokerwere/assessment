/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumb;

/**
 *
 * @author boker
 */
public class MissingNumb {

    
    static int Missing(int a[], int n) 
    { 
        int i; 
         int sum; 
        sum = (n + 1) * (n + 2) / 2; 
        for (i = 0; i < n; i++) 
            sum-= a[i]; 
        return sum; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int a[] = { 3, 5, 4, 1 }; 
        int k = Missing(a, 4); 
        System.out.println(k); 
        
    }
    
}
