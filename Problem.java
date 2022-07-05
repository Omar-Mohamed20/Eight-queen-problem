/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8queen.problem;

import java.util.Scanner;
public class Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     Problem s1=new Problem();
     s1.intialize();
        
    }

    private void intialize() {
     int [][] arr={
         {0,0,0,0},
          {0,0,0,0},
           {0,0,0,0},
            {0,0,0,0}
     };
        
     if(findsol(arr,0)==false) System.out.println(" no sol exist");{
        printbox(arr);
         
     }
     }
     
     
     
     
     

    private boolean findsol(int[][] arr , int col) {
       if(col>=4){
           return true;
    }
       for(int i=0;i<4;i++){
           if(placequeen(arr,i,col)==true){
               arr[i][col]=1;
               if(findsol(arr,col+1)==true)return true;
                arr[i][col]=0;
           }
       }
       return false;
    }

    private boolean placequeen(int[][] arr, int row, int col) {
        
         for(int i=0;i<col;i++)
        if(arr[row][col]==1) return false;
        
        for(int i=row,j=col;i>=0&&j>=0;i--,j--)
        if(arr[row][i]==1) return false;
        
         for(int i=row,j=col;j>0&&i<4;i--,j--)
        if(arr[i][j]==1) return false;
        
        return true;
        
    }

    private void printbox(int[][] arr) {
      for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
              if(arr[i][j]==0){
                  System.out.println(" []");
              }
              else{
                  System.out.println(" Q");
              }
         
          }
      }
        
    } 
       
        
    
}
    
    
    
    
    
    
    
    
  
    

    


