import java.util.Scanner;

public class Vdinamicos{
  public static void main(String args[]){


  int longitud = 0;
  Scanner entrada = new Scanner(System.in);
  
  System.out.print("¿cuantos números desea ingresar? :");
longitud = entrada.nextInt();

int numero[] = new int[longitud];

for(int i = 0; i < numero.length; i++){
 System.out.println("dame un valor numero #: " + (i + 1));
 numero[i] = entrada.nextInt();

 }
for(int i = 0; i < numero.length; i++){
   System.out.print("[" + numero[i] +"]");


}


}


}
