package TTDcolourTest.Ass03;

public class Colour {
    private int RGB;
    private final float Red;
    private final float Green;
    private final float Blue;

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
        this.Red =  (float)((RGB >> 16) & 255)/255;
        this.Green = (float)((RGB >> 8) & 255)/255;
        this.Blue =  (float)(RGB & 255)/255;
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
    @Override
    public boolean equals(Object Colour2){
        if (Colour2 == this) {
            return true;
        }

        if (!(Colour2 instanceof Colour RGB)) {
            return false;
        }

        return (this.getRed() == RGB.getRed()) && (this.getGreen() == RGB.getGreen()) && (this.getBlue() == RGB.getBlue()) ;
    }
}
