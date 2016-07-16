/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hunt1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Hunt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        char[] a=t.toCharArray();
        int l=t.length(); 
        char[] a2=new char[l];
        String s1=sc.nextLine();
         char[] c=s1.toCharArray();
         if(t.contains(s1))
         {
           System.out.println(" first string element");
          for(int i=0;i<t.length();i++)
           {
           for(int j=0;j<s1.length();j++)
           {           
             { if(a[i]==c[j])
             {
                a2[j]=a[j];
                 System.out.println(i);
                 break;
                 
             }break;
             }
             }        
           }}
         else
             System.out.println("Strings are not matched");
    }
}
