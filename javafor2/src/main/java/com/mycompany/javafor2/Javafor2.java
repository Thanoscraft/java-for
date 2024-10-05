/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javafor2;

import java.util.Scanner;


/**
 *
 * @author enzoa
 */
public class Javafor2 {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n;
        System.out.println("digite um número de um a 10");
        n = input.nextInt();
        for(int i = 1;i <11;i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
      
    }
}
