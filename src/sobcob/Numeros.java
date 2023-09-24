/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobcob;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Numeros {
    
    public static void menu(){
        ArrayList<Integer> list = new ArrayList();
        SobCOB ope = new SobCOB();

        String s;
        salir:
        do{
            int x = 0;
            JOptionPane.showMessageDialog(null, """
                                                \t\tOperacion Basicas\n
                                                1.Suma\n2.Resta\n3.Division""");
            int i = Integer.parseInt(JOptionPane.showInputDialog("¿Que operacion deseas realizar?"));
            switch(i){
                case 1 -> {
                    do{
                        String aux = JOptionPane.showInputDialog("Dame el numero que quieres sumar \n"+"\"no\" para salir");
                        if (!aux.equalsIgnoreCase("no")){
                            list.add(Integer.parseInt(aux));
                            ope.Operaciones(list.get(x));
                        }else break;
                        x++;
                    }while(true);
                    list.clear();
                    ope.Resultado();
                }
                case 2 -> {
                    do{
                        String aux = JOptionPane.showInputDialog("Dame el numero que quieres restar \n"+"\"no\" para salir");
                        if (!aux.equalsIgnoreCase("no")){
                            list.add(Integer.parseInt(aux));
                            ope.Operaciones(list.get(x),0);
                        }else break;
                        x++;
                    }while(true);
                    list.clear();
                    ope.Resultado();
                }
                case 3 -> {
                    do{
                        String aux = JOptionPane.showInputDialog("Dame el numero que quieres dividir \n"+"\"no\" para salir");
                        if (!aux.equalsIgnoreCase("no")){
                            list.add(Integer.parseInt(aux));
                            ope.Operaciones(list.get(x),0,0);
                        }else break;
                        x++;
                    }while(true);
                    list.clear();
                    ope.Resultado();
                }
            }
        }while(true);
    }
}
