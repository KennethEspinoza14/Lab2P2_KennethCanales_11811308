
package lab.pkg2p2_kennethespinoza;

import java.util.ArrayList;


public class Players {
    
    private String Jugador;
    private int monedas = 100;
    private ArrayList <String> items = new ArrayList();
    private int victorias;
    

    public Players(String j) {
        Jugador = j;
    }
    
    public Players(String j, int m, int v) {
        Jugador = j;
        monedas = m;
        victorias = v;
    }

    public String getJugador() {
        return Jugador;
    }

    public void setJugador(String j) {
        Jugador = j;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int m) {
        monedas = m;
    }
    
    
    @Override
    public String toString(){
        
        return "El jugador:"+Jugador + " tiene:" +monedas +" Monedas" + " Items del jugador:"+items;
        
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> i) {
        items = i;
    }
    
    
    
    
}
