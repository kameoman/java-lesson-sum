class Mypoint{
  int x;
  int y;

  void setX(int px){
    x = px;
  }
  void setY(int py){
    y = py;
  }

  int getX(){
    return x;
  }
  int getY(){
    return y;
  }
}
public class Lesson8 {
  public static void main(String[] args) {
    Mypoint p1;
    p1 = new Mypoint();
    p1.setX(10);
    p1.setY(5);
    
    int px = p1.getX();
    int py = p1.getY();
    System.out.println("X座標は"+px+",Y座標は"+py+"でした。");
  }
}
