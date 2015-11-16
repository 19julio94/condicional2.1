package exemplocondicional2;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Compara {
 
     
    public static int pedirNumeroEnteiro(){
        int num;
        String res =JOptionPane.showInputDialog("Dame o numero");
        num=Integer.parseInt(res);
        return num;
        //tamen se pode retunr(Integer.parseInt(JOptionPane.showInputDialog("Dame o numero")));
        }
     public static void comparar(int num1,int num2){
        
         if(num1> num2)
         System.out.println("o maior e"+num1);
         else if(num2> num1)
             System.out.println("o maior e"+num2);
         
         else
             System.out.println("son iguais");
        }
    
}
