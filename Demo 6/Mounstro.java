public class Mounstro{
 Short posicion[];
 public Mounstro(){
  posicion = new Short[2];
  setPosicion();
 }
 private void setPosicion(){
  posicion[0] = 50;
  posicion[1] = 100;
 }
 public Short[] getPosicion(){
  return posicion;
 }
}