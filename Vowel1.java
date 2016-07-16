/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowel;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner (System.in);
         char a=sc.next().charAt(0);
        
        
        // TODO code application logic here
        if(a=='a'||a=='i'||a=='o'||a=='u'||a=='e')
            System.out.println("vowel");
        else
            System.out.println("consonant");
       
    }
    }

