
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
                    String a = "";
                    System.out.println("Ingrese el nombre del bot:");
                    String b = lea.next();
                    Bots bot = new Bots(b, 0, a);
                    listabots.add(b);
                    System.out.println("Bot ingresado correctamente.");
                }
                break;
                
                case 3:{
                    
                    int pos;
                    ArrayList Item = new ArrayList();
                    Item cola = new Item("Cola", 60);
                    Item.add(cola);
                    Item acelerador = new Item("Acelerador", 30);
                    Item.add(acelerador);
                    Item mina = new Item("Mina", 45);
                    Item.add(mina);
                    Item iluminador = new Item("Iluminador", 45);
                    Item.add(iluminador);
                    Item detector = new Item("Detector", 30);
                    Item.add(detector);
                    
                    System.out.println("Los ítems disponibles son:\n"
                            + "0• Cola: 60\n"
                            + "1• Acelerador: 30\n"
                            + "2• Mina: 45\n"
                            + "3• Iluminador: 45\n"
                            + "4• Detector: 30");
                    String salida1 = "";
                    for (Object j : listajug) {
                        salida1+= listajug.indexOf(j)+ "- " +j+"\n";
                         System.out.println(salida1);
                    }
                    
                    System.out.println("Ingrese la posicion del jugador para agregar un item:");
                    pos = lea.nextInt();
                    if (listajug.get(pos)instanceof Players) {
                        System.out.println("Ingrese el item que desea comprar:");
                        int i = lea.nextInt();
                        int cant = ((Players)listajug.get(pos)).getMonedas();
                        int precio = ((Item)Item.get(pos)).getPrecio();
                        if (cant > precio) {
                            ((Players)listajug.get(pos)).getItems().add(((Item)Item.get(pos)).getNombre());
                        }else{
                            System.out.println("Cantidad de monedas insuficiente");
                        }
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
