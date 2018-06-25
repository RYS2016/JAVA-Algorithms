/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

/**
 *
 * @author Yaroslav R
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int[][] table = new int[9][9];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++)
                table[i][j] = (i + 1) * (j + 1);
        }
        System.out.println("   1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < table.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] < 10) System.out.print(" ");
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
