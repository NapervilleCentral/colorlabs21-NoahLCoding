
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
                blue = 159;
                }
             else if(gray<group2){
                red = 215;
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
         int group1 = (int) (255/7);
         int group2 = (int) ((2*255)/7);
         int group3 = (int) ((3*255)/7);
         int group4 = (int) ((4*255)/7);
         int group5 = (int) ((5*255)/7);
         int group6 = (int) ((6*255)/7);
         for (Pixel pixel: vPixels){
             int gray = pixel.getRed();
             Color newColor;
            if (gray < group1) {
                newColor = new Color(198, 13, 41);    // deep red
                }
            else if (gray < group2) {
                newColor = new Color(0, 48, 73);  // beige
            }       
            else if (gray < group3) {
                newColor = new Color(30, 115, 125);      // dark navy
            }
            else if (gray < group4) {
                newColor = new Color(214, 119, 61);   // teal blue
            }
            else if(gray<group5){
                newColor = new Color(239,215,179);
            }
            else if (gray < group6) {
                newColor = new Color(20, 20, 20);     // near black
            }
            else {
                newColor = new Color(255, 245, 230);  // light cream highlight
            }


             pixel.setColor(newColor);
            }
            volleyball.explore();
            volleyball.write("images/sfFinal.jpg");
            /**/
         
    }//main       
}//class
