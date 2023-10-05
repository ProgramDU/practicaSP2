
package practica2sp;
import java.util.Scanner;
public class Practica2SP {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tam;
        int mayor = 0;
        int par=0, impar=0;
        
        System.out.println("Introducir el tamaño del arreglo");
        tam = sc.nextInt();
        int[] enteros = new int[tam];
        
        
        for (int i=0; i<enteros.length; i++){
            System.out.println("Introduce el valor de la posición " + i);
            enteros[i] = sc.nextInt();
        }
        int menor = enteros[0];
        for (int i=0; i<enteros.length; i++){
            if(enteros[i]> mayor){
                mayor = enteros[i];
                
            }
            
        }
        System.out.println("El mayor de el arreglo es" + mayor);
        
        for (int i=0; i < enteros.length; i++){
            if(enteros[i]< menor){
                menor= enteros[i];
            }
        }
        System.out.println("El menor de el arreglon es" + menor);
        
        for(int i=0;  i < enteros.length; i++){
            if((enteros[i]%2)==0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("El total de impares"+ impar);
        System.out.println("El total de pares" + par);
    }
    
    
}
