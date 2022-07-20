
package clase5umca;

import java.util.Scanner;
public class Clase5umca {

    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
     int i,vector1mayor,vector1menor,sumavector;
     int [] dato=new int[15];
     String respuesta="S";
     while (respuesta.equals("S") || respuesta.equals("s")) {
             vector1mayor=0;
             vector1menor=51;
             sumavector=0;
        System.out.println("Empieza el vector 1");
        for (i=0;i<15;i++) {
            dato[i]=(int)Math.floor(Math.random()*50);
            
            if(dato[i]>vector1mayor){
               vector1mayor= dato[i];
            }
            if (dato[i]<vector1menor){
              vector1menor=  dato[i];
            }
            System.out.println(i+1+") Los datos son :"+dato[i]); 
            
        }
         System.out.println("Digite un dato que dese cambiar");
         i=entrada.nextInt();
          System.out.println(i+") El vector a cambiar : "+dato[i-1]);
         dato[i-1]=entrada.nextInt();
         for ( i = 0; i < 15; i++) { 
             sumavector+=dato[i];
             
             
        System.out.println(i+1+") Los dato del vector : "+dato[i]);
         }
        System.out.println("El vector mayor es :"+vector1mayor);
        System.out.println("El vector vector menor es :"+vector1menor);
        System.out.println("La suma del vector es :"+sumavector);
       
        System.out.println("Desea continuar s/n");
            respuesta=entrada.next();
        } 
    }
    
}
