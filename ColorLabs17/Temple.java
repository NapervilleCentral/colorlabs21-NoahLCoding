
/**
 * Write a description of class Temple here.
 *
 * @Noah Latakas
 * @version (a version number or a date)
 */
public class Temple
{
    //277,28
    //277,104
    //15, 28
    //15,104
    public static void main(String[] args){
        Picture temple = new Picture("images/temple.jpg");
        Pixel left = null;
        Pixel right = null;
        for (int r = 15; r<278; r++){
            for (int c = 28; c<142; c++){
                left = temple.getPixel(r, c);
                right = temple.getPixel(277+(277-r), 141-(141-c));
                right.setColor(left.getColor());
            }
        }
        
        temple.explore();
    }
}
