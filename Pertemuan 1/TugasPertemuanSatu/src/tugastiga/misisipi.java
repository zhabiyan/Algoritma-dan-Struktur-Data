/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastiga;
import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class misisipi {
     public static void main(String[] args) {
      int panjangkata, jumlahkarakter = 1;
      String kata;
      
       Scanner sc = new Scanner(System.in);
       System.out.println("Ketikkan kalimat : ");
         
       kata = sc.nextLine();
       
        char [] arrHuruf = kata.toCharArray();
        panjangkata = arrHuruf.length;
         
        for(int i = 0; i < panjangkata; i++) {
             
             for(int j=0; j < panjangkata; j++){
             if(arrHuruf[i]!=' '){
                 
              if(i!=j&&(arrHuruf[i]==arrHuruf[j])){
                jumlahkarakter++;
                arrHuruf[j]=' ';
                     }
                  if(j==panjangkata-1){
                    
                    System.out.println("Jumlah huruf  '"+arrHuruf[i]+"' = "+jumlahkarakter);
                    jumlahkarakter=1;                        
                }
            }
          }
        }  
      }
}
