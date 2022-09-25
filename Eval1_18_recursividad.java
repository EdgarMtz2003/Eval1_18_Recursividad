/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_18_recursividad {
    public static void main(String[]args){
        falsoForDes(5);
        falsoForAse(5,1);
    }
    //falso for
    //imprimir una lista de numeros de mayor a menor (de manera recursiva)
    //recibir un valor falsoForDes(5) --> "5-4-3-2-1
    public static void falsoForDes(int valor){
        //que vaoy a hacer "imprimir valor"
        //llamada recursiva "falsoForDes(valor-1)
        //detener la llamada recursiva "cuando valor = 1"
        /*si es 1 me detengo, si no, llamada recursiva*/
        
        /*
        if(valor>0){
            System.out.print(valor+" - ");
            valor--;
            falsoForDes(valor);
        }
        */
        
        if(valor==1){
            System.out.print(valor+" - ");
        }else{
            System.out.print(valor+" - ");
                    falsoForDes(valor-1);
        }
        System.out.println("");
        }
    
    //falsoForAse(5) --> 1-2-3-4-5
    public static void falsoForAse(int valor, int ini){

        if(ini<=valor){
            System.out.print(ini+" - ");
            falsoForAse(valor, ini +1);
        }else{
            
        }
    }
    }

