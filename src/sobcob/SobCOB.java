/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobcob;
import java.util.ArrayList;
/**
 *
 * @author edgar
 */
public class SobCOB {

    private double resultado = 0;
    
    public void Operaciones(int a){
        resultado += a;
    }
    
    public void Operaciones(int a,int b){
        resultado -= a;
    }
    
    public void Operaciones(int a, int b, int c){
        resultado++;
        resultado /= (double) a;
    }
    
    public void Resultado(){
        System.out.println("El resultado es = '%5.5f'"+resultado);
        resultado = 0;
    }

}
