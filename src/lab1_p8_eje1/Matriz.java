/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_p8_eje1;

/**
 *
 * @author Thomas
 */
public class Matriz {
    
    public void armar(){
        int [][] M = {{3,6,9,12}, {15, 18, 21}, {24,27,30, 33, 36}, {39,42}};

        /*int[][] matriz = new int[4][];  
        matriz[0] = new int[4]; 
        matriz[1] = new int[3]; 
        matriz[2] = new int[5]; 
        matriz[3] = new int[2]; */
        for (int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
               if(M[i][j]%2 == 0 ){
                 System.out.print(M[i][j]+ " ");
               }
            }
          System.out.println();
        }
    }
}
