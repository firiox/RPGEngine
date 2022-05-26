import javax.swing.JFrame;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.awt.Graphics;
public class Demo2 extends JFrame{
 public Demo2(){
  setBounds(0,0,600,400);
  setLocationRelativeTo(null);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  File f = new File("Assets/prototipo 1.png");
  Image i;
  try{ 
   i = ImageIO.read(f); 
   getGraphics().drawImage(i,0,0,null);
  }
  catch(IOException e){
   System.out.println("Error al cargar la imagen");
  }  
  
 }
}