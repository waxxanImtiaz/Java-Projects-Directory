
package rainbow;


public class Rainbow {


    public enum MyColor {
        RED (0xff0000),GREEN(0x007700),BLUE(0x000077);
        private final int rgb;
      
        MyColor(int rgb)
        {
            this.rgb=rgb;
        }
        public int getRGB(){
            return rgb;
        }
    }
   
    public static void main(String[] args) {
       MyColor x = MyColor.GREEN;
        System.out.println(x);
    }
    
}
