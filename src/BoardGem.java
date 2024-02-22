import gem.*;

public class BoardGem {
    public static RedGem redGem;
    public static GreenGem greenGem;
    public static BlackGem blackGem;
    public static BlueGem blueGem;
    public static WhiteGem whiteGem;

    public BoardGem(){
        redGem = new RedGem();
        greenGem = new GreenGem();
        blackGem = new BlackGem();
        blueGem = new BlueGem();
        whiteGem = new WhiteGem();
        redGem.setQuantity(7);
        greenGem.setQuantity(7);
        blackGem.setQuantity(7);
        blueGem.setQuantity(7);
        whiteGem.setQuantity(7);
    }


}
