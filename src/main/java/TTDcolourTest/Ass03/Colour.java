package TTDcolourTest.Ass03;

public class Colour {
    private int RGB;
    private float Red;
    private float Green;
    private float Blue;

    public Colour(float Red, float Green, float Blue) {
        this.Red = Red;
        this.Green = Green;
        this.Blue = Blue;
        if (Red < 0.0 || Red > 1.0){
            throw new IllegalArgumentException();
        }
        if (Green < 0.0|| Green > 1.0 ){
            throw new IllegalArgumentException();
        }
        if (Blue < 0.0 || Blue > 1.0){
            throw new IllegalArgumentException();
        }
    }
    public Colour(int RGB) {
        this.RGB = RGB;
        if (RGB < 0 || RGB > 16777215) {
            throw new IllegalArgumentException();
        }
    }
    public float getRed() {
        return Red;
    }

    public float getGreen() {
        return Green;
    }

    public float getBlue() {
        return Blue;
    }

    public int getRGB() {
        return RGB;
    }
}
