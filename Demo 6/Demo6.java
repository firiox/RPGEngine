/**
* La primera ejecucion no muestra la linea
* recien la segunda 
*/
//import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyListener;
public class Demo6{
 public static void main(String args[]){
  Ventana v = new Ventana();
  Mounstro m = new Mounstro();
  Canva c = new Canva();
  c.setMounstro(m);//No funciona
  v.setContentPane(c);
  
 }
}