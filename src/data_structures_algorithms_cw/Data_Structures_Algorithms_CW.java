/* 
 * File         : Data_Structures_Algorithms_CW.java
 * 
 * Date         : Thursday 17/11/2016
 * 
 * Author       : Christopher Irvine, ruw12gbu, 100036248
 * 
 * Description  : Main file for corusework assignment. Tests my ability to 
 *                design, analyse and implement algorithms. There are three 
 *                tasks. 1) Design and Analyse an algorithm to perform a given
 *                task. 2) Design and Implement a Recursive Algorith to perform
 *                a given task. 3) Using Balanced Binary Search Trees (not in 
 *                this program)
 * 
 * History      : 17/11/2016 v1.0
 *
 */

package data_structures_algorithms_cw;

import java.util.Scanner;

/**
 *  
 * 
 */
public class Data_Structures_Algorithms_CW 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int histArray[] = new int[10];
        System.out.println("Enter the size of the array:");        
        int n = scan.nextInt();
        System.out.println("Array size set to: " + n);
        
        int taskArray[] = new int[n];
        
        //Fill the array
        System.out.println("Enter " + n + " digits to fill the Array, press "
                + "enter after each number");
        for (int i = 0; i < taskArray.length; i++) 
        {
            taskArray[i] = scan.nextInt();
        }
        
        for (int i = 0; i < taskArray.length; i++)
        {
            int h = (taskArray[i] - 1) / 10;
            histArray[h]++;
        }
    }
    
}
