
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
         /*
         int group1 = (int) (255/5);
         int group2 = (int) ((2*255)/5);
         int group3 = (int) ((3*255)/5);
         int group4 = (int) ((4*255)/5);
         for (Pixel pixel: vPixels){
             int gray = pixel.getRed();
             Color newColor;
             if (gray<group1){
                red = 20;
                green = 20;
                blue = 139;
                }
             else if(gray<group2){
                red = 180;
                green = 0;
                blue = 0;
                }
             else if(gray<group3){
                red = 173;
                green = 216;
                blue = 230;                
                }
             else if (gray<group4){
                red = 255;
                green = 223;
                blue = 178;
                }
             else{
                 red = 255;
                 green = 182;
                 blue = 193;
                }
             newColor = new Color(red, green, blue);
             pixel.setColor(newColor);
            }
            volleyball.explore();
            volleyball.write("images/sf1.jpg");
         /*
         int range = max - min;
         int group1 = (int) (range/4);
         int group2 = (int) ((2*range)/4);
         int group3 = (int) ((3*range)/4);
         for (Pixel pixel: vPixels){
            int gray = pixel.getRed();
             Color newColor;
             if (gray<group1){
                red = 20;
                green = 20;
                blue = 139;
                }
             else if(gray<group2){
                red = 255;
                green = 0;
                blue = 0;
                }
             else if(gray<group3){
                red = 173;
                green = 216;
                blue = 230;                
                }
             else{
                red = 255;
                green = 253;
                blue = 208;
                }
             newColor = new Color(red, green, blue);
             pixel.setColor(newColor);
            }
            volleyball.explore();
            volleyball.write("images/sf2.jpg");
          /**/
         int group1 = (int) (255/5);
         int group2 = (int) ((2*255)/5);
         int group3 = (int) ((3*255)/5);
         int group4 = (int) ((4*255)/5);
         for (Pixel pixel: vPixels){
             int gray = pixel.getRed();
             Color newColor;
             if (gray<group1){
                // 143, 45, 86
                // 0, 78, 100
                newColor = new Color(143, 45, 86);
                }
             else if(gray<group2){
                 // 216, 17, 89
                 //0, 165, 207
                newColor = new Color( 216, 17, 89);
                }
             else if(gray<group3){
                 // 255, 188, 66
                 // 159, 255, 203
                newColor = new Color(255, 188, 66);             
                }
             else if (gray<group4){
                 // 33, 131, 128
                 // 37, 161, 142
                newColor = new Color(33, 131, 128);
                }
             else{
                 // 115, 210, 222
                 // 122, 229, 130
                 newColor = new Color(115, 210, 222);
                }
             pixel.setColor(newColor);
            }
            volleyball.explore();
            //volleyball.write("images/sf4.jpg");

         
    }//main       
}//class
