import java.io.File;
public class Demo4{
 File dir;
 public Demo4(){
  dir = new File("Demo4/test.txt");
  dir.mkdirs();
 }
}