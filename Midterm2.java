/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm2;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class Midterm2 {
    public static void main(String[] args) {
        int n;
        int f=1;
        int m =1;
        int proceed = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        n = input.nextInt();
        while (proceed!=0)
        {
            f = f*m;
            if (m==n)
            {
                proceed = 0;
            }
            else
            {
                m++;
            }
        }
        System.out.println(f);
    }
}
