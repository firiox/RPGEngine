import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
public class Canva extends JPanel{
 public Canva(){
  setPreferredSize(new Dimension(400,400));
 }
 //Se llama en la creacion del Canva
 protected void paintComponent(Graphics g){
  ponerMounstro(50,100,g);
 }
 public void setMounstro(Mounstro m){
  Short posicion[] = m.getPosicion(); 
  draw(posicion);
 }
 private void draw(Short[] posicion){
  //g.drawLine(posicion[0],posicion[1],posicion[0]+100,posicion[1]);
 }
 private void ponerMounstro(int x, int y, Graphics g){
  g.drawLine(x,y,x+100,y);
 }
}