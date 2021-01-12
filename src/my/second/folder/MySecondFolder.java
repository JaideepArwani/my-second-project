/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.second.folder;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MySecondFolder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // TODO code application logic here
        takinguserinput();
    }
    
    
    static void takinguserinput(){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter your intgez value : ");     

//nextint() is a pre-defined function
Integer myvalue = scan.nextInt();

System.out.println("user Entered value is : "+myvalue);
}
    
}