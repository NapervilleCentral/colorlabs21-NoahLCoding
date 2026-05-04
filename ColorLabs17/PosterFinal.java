
/**
 * Write a description of class PosterFinal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PosterFinal{
    public static void main(String[] args){
        Picture apic = new Picture("images/download.jpg");
        Picture acanvas = new Picture("images\\Canvas4.jpg");
        apic.explore();
        mirrorVertical(apic);
        apic.explore();
        copytoCanvas(apic, acanvas);
        apic.explore();
    }
    
    /**
    * Method to mirror an a vertical line in the middle of the picture based on the width
    */
    public static void mirrorVertical(Picture source){
        int width = source.getWidth();
        int mirrorPoint = width/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        
        //loop thru all the rows
        for (int y=0; y <source.getHeight(); y++){
            // loop from 0 to the middle(mirror Point)
            for (int x=0; x<mirrorPoint;x++){
                leftPixel = source.getPixel(x,y);
                rightPixel = source.getPixel(width-1-x, y);
                rightPixel.setColor(leftPixel.getColor());
                
            }
        }
    }
    /**
     * copy one pic to another pic
     * add two ints to params to place you want pic on the target
     */
    public static void copytoCanvas(Picture source, Picture target){
        Pixel sourcePix = null;
        Pixel targetPix = null;
        
        //loop thru the columns (targetX is starting point on Canvas)
        for (int sourceX=0, targetX=0; sourceX<source.getWidth(); sourceX++,targetX++){
            for (int sourceY=0, targetY=0; sourceX<source.getHeight(); sourceY++,targetY++){
                sourcePix = source.getPixel(sourceX, sourceY);
                targetPix = target.getPixel(targetX, targetY);
                targetPix.setColor(sourcePix.getColor());
            }
        }
    }
}
