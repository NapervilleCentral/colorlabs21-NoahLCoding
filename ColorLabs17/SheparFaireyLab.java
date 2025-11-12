
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /*
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         */
         //relative path
         Picture volleyball = new Picture("images/volleyball.jpg");
         Pixel[] vPixels = volleyball.getPixels();
         int red, green, blue;
         int grayScale;
         int max = 0;
         int min = 255;
         for (Pixel pixel: vPixels){
            red = pixel.getRed();
            green = pixel.getGreen();
            blue = pixel.getBlue();
            grayScale = (int) (red+green+blue)/3;
            if (grayScale>max){
                max = grayScale;
            } else if (grayScale<min){
                min = grayScale;
            }
            Color newColor = new Color(grayScale, grayScale, grayScale);
            pixel.setColor(newColor);
            }
         volleyball.explore();
         System.out.println("Min: " + min + " Max: " + max);
         int group1 = (int) (255/4);
         int group2 = (int) ((2*255)/4);
         int group3 = (int) ((3*255)/4);
         for (Pixel pixel: vPixels){
             
            }
         /**
          * method 1 change
          * 
          */
         
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
