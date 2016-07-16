/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pro11;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Pro11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        String a;
        String b= "";
        String c= "";
        int s=t.length();
        for(int i=0;i<s-1;i++)
        {
            c=c+t.charAt(i);
            if((t.charAt(i) == ' ')|| (i == s-1))
            {
                for(int j=c.length()-1;j>=0;j--)
                {
                    b=b+c.charAt(j);
                    if((j == 0)&&(i !=s-1))
                    
                        b=b+" ";
                }  
                 c= "";
            }
            }
        System.out.println(b);
        }
      
        
    }

