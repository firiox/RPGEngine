import javax.swing.JFrame;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.awt.Graphics;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Demo7 extends JFrame implements ActionListener{
//Constructor
 File onWorld,onBattle;
 File monster;
 Image onWorldImage,onBattleImage;
 Image monsterImage;
 public Demo7(){
  setBounds(0,0,600,400);
  setLocationRelativeTo(null);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
 
  onWorld = new File("Assets/world2.png");
  
  try{
   onWorldImage = ImageIO.read(onWorld);
   getGraphics().drawImage(onWorldImage,0,0,null);
  }
  catch(IOException e){
   System.out.println("Error al cargar la imagen");
  }
  
  monster = new File("Assets/monster1.png");
  try{
   monsterImage = ImageIO.read(monster);
   getGraphics().drawImage(monsterImage,150,150,null);
  }
  catch(IOException e){
   System.out.println("Error al cargar la imagen");
  }
 }
 public void actionPerformed(ActionEvent e){
 }
//Main
 public static void main(String args[]){
  //System.out.println("Compila");
  Demo7 d = new Demo7();
  //Poner una imagen
  //Al hacer click en la imagen poner otra imagen
 }
}