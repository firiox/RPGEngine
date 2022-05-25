import java.io.*;
public class Terrain_test extends Terrain{
 private short id;
 File ruta;
 public Terrain_test(){
  id = 0;
  ruta = new File("Assets/pasto_1.pgn");
  System.out.println("Terrain_test creado");
 }
}