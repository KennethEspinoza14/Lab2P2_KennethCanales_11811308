
package lab.pkg2p2_kennethespinoza;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
        
public class Lab2P2_KennethEspinoza {
    
  static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
   
    public static void main(String[] args) {
        
        
        ArrayList listajug = new ArrayList();
        ArrayList listabots = new ArrayList();
         
        ArrayList<String> agregarit = new ArrayList();
        agregarit.add("Cola");
        agregarit.add("Acelerador");
        agregarit.add("Mina");
        agregarit.add("Iluminador");
        agregarit.add("Detector");
           
         boolean control = true;
         
         while ( control == true) {            
            
            System.out.println("----------------MENU-----------------");
            System.out.println("|1| =  Agregar Jugador");
            System.out.println("|2| =  Agregar bot");
            System.out.println("|3| =  Agregar Items");
            System.out.println("|4| =  Jugar");
            System.out.println("|5| = Salir del programa ");
            System.out.println("-------------------------------------");
            System.out.println("Ingrese la opcion a la que desea entrar:");
            int opcion = lea.nextInt();
            
            switch (opcion){
                
                case 1:{
                    System.out.println("Ingrese el nombre del jugador:");
                    String j = lea.next();
                    Players jug = new Players(j);
                    listajug.add(jug);
                    System.out.println("Jugador ingresado correctamente.");
                }
                break;
                
                case 2:{
                    System.out.println("Ingrese el nombre del bot:");
                    String b = lea.next();
                    Bots bot = new Bots(b);
                    listabots.add(b);
                    System.out.println("Bot ingresado correctamente.");
                }
                break;
                
                case 3:{
                    
                    int pos;
                    
                    System.out.println("Los ítems disponibles son:\n"
                            + "• Cola: 60\n"
                            + "• Acelerador: 30\n"
                            + "• Mina: 45\n"
                            + "• Iluminador: 45\n"
                            + "• Detector: 30");
                    
                    System.out.println("Ingrese la posicion del jugador para agregar un item");
                    pos = lea.nextInt();
                    if (listajug.get(pos)instanceof Players) {
                        System.out.println("Ingrese el item que desea comprar:");
                        int i = lea.nextInt();
                        ((Players)listajug.get(pos)).getItems().add(agregarit.get(i));
                    }else{
                        System.out.println("En esa posicion no hay ningun jugador");
                    }
                    
                     String salida = "";
                     for (Object j : listajug) {
                        salida+= listajug.indexOf(j)+ "- " +j+"\n";
                         System.out.println(salida);
                    }
                    
                }
                break;
                
                case 4:{
                        
                    String [][] matriz = new String[30][30];
                    tablero(matriz);
                    
                     
                }
                break;
                
                case 5:{
                    control = false;
                }
                break;
                default:
                    System.out.println("Opcion ingresada no valida");
            }

        }// fin while
        
        
    }// fin main
    
    public static void tablero(String m [][]){
        
        String [][] matriz = new String[30][30];
        
        String x = "X";
      
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "[ ]";
            }
        }

        for (int i = 0; i < 300; i++) {
            int f = 1 + r.nextInt(29);
            int c = 1 + r.nextInt(29);
            matriz[f][c] = "[x]";
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
                 
    }// fin tablero
    
}
