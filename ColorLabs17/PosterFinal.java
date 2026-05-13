import java.awt.Color;

/**
 * Write a description of class PosterFinal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PosterFinal{
    public static void main(String[] args){
        Picture apic = new Picture("images/VolleyballMeme.jpg");
        Picture apic2 = new Picture("images/VolleyballMeme.jpg");
        Picture apic3 = new Picture("images/VolleyballMeme.jpg");
        Picture apic4 = new Picture("images/VolleyballMemeBigger.jpg");
        Picture apic5 = new Picture("images/VolleyballMeme.jpg");
        Picture apic6 = new Picture("images/VolleyballMeme.jpg");
        Picture acanvas = new Picture("images/Canvas.jpg");
        mirrorHorizontal(apic2);
        mirrorVertical(apic2);
        negation(apic3);
        Repeat(apic4);
        grayScale(apic5);
        apic4.explore();
        copytoCanvas(apic, acanvas, 0, 0);
        copytoCanvas(apic2, acanvas, 225, 0);
        copytoCanvas(apic3, acanvas, 450, 0);
        copytoCanvas(apic5, acanvas, 675, 0);
        acanvas.explore();
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
    public static void mirrorHorizontal(Picture source){
        int height = source.getHeight();
        int mirrorPoint = height/2;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        
        for (int x=0; x <source.getWidth(); x++){
            // loop from 0 to the middle(mirror Point)
            for (int y=0; y<mirrorPoint;y++){
                topPixel = source.getPixel(x,y);
                bottomPixel = source.getPixel(x, height-1-y);
                bottomPixel.setColor(topPixel.getColor());
                
            }
        }
    }
    public static void negation(Picture source){
        Pixel pixel = null;
        for(int r = 0; r<source.getWidth(); r++){
            for (int c = 0; c<source.getHeight(); c++){
                pixel = source.getPixel(r,c);
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                pixel.setColor(new Color(255-red, 255-green, 255 - blue));
            }
        }
    }
    public static void grayScale(Picture source){
        Pixel pixel = null;
        for(int r = 0; r<source.getWidth(); r++){
            for (int c = 0; c<source.getHeight(); c++){
                pixel = source.getPixel(r,c);
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                int grayScale = (red+green+blue)/3;
                pixel.setColor(new Color(grayScale, grayScale, grayScale));
            }
        }
    }
    
    public static void Repeat(Picture source){
        int height = source.getHeight();
        int width = source.getWidth();
        if (height<10 || width<10){
            return;
        }
        copytoCanvasRecursion(source , source, 0, 0);
        
    }
    
    public static void copytoCanvasRecursion(Picture source, Picture target, int x, int y){
        int height = source.getHeight();
        int width = source.getWidth();
        if(height<10 || width<10){
            return;
        }
        Pixel sourcePix = null;
        Pixel targetPix = null;
        
        //loop thru the columns (targetX is starting point on Canvas)sourceX+=2 - smaller
        //                                                          sourceX+=.5 - larger, copy every pixel twice
        for (int sourceX=0, targetX=x; sourceX<source.getWidth(); sourceX+=2,targetX++){
                                                                        //SourceY+=2 - smaller
                                                                        //SourceY+=.5 - larger copy every pixel twice
            for (int sourceY=0, targetY=y; sourceY<source.getHeight(); sourceY+=2,targetY++){
                sourcePix = source.getPixel(sourceX, sourceY);
                targetPix = target.getPixel(targetX, targetY);
                targetPix.setColor(sourcePix.getColor());
            }
        }
        
    }
    
    /**
     * copy one pic to another pic
     * add two ints to params to place you want pic on the target
     */
    
    public static void copytoCanvas(Picture source, Picture target, int x, int y){
        Pixel sourcePix = null;
        Pixel targetPix = null;
        
        //loop thru the columns (targetX is starting point on Canvas)sourceX+=2 - smaller
        //                                                          sourceX+=.5 - larger, copy every pixel twice
        for (int sourceX=0, targetX=x; sourceX<source.getWidth(); sourceX++,targetX++){
                                                                        //SourceY+=2 - smaller
                                                                        //SourceY+=.5 - larger copy every pixel twice
            for (int sourceY=0, targetY=y; sourceY<source.getHeight(); sourceY++,targetY++){
                sourcePix = source.getPixel(sourceX, sourceY);
                targetPix = target.getPixel(targetX, targetY);
                targetPix.setColor(sourcePix.getColor());
            }
        }
    }
}
