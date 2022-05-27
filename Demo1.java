import javax.swing.JFrame;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.Image;
public class Demo1 extends JFrame{
 Image i;
 public Demo1(){
  setBounds(0,0,600,400);
  setLocationRelativeTo(null);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  Terrain_test t = new Terrain_test();//ERROR
    try{
     i = ImageIO.read(t.getFile2());
    }
    catch(IOException e){
     System.out.println("Error al cargar la imagen");
    }
 }
}