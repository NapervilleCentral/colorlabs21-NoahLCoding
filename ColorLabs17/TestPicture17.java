
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      Picture moto = new Picture("images/redMotorcycle.jpg");
      Picture moto2 = new Picture("images/redMotorcycle.jpg");
      Picture moto3 = new Picture("images/redMotorcycle.jpg");
      Picture moto4 = new Picture("images/redMotorcycle.jpg");
      Picture moto5 = new Picture("images/redMotorcycle.jpg");
      Picture mark6 = new Picture("images/blue-mark.jpg");
      int red, green, blue, grayScale;
      Color newColor;
      Pixel[] mPixels;
      mPixels = moto.getPixels();
      moto.explore();
    for (Pixel spot: mPixels){
        //System.out.println(spot1);
        red = spot.getRed();
        red = (int) (red * .25);
        spot.setRed(red);
    }
    moto.explore();
      mPixels = moto2.getPixels();
      for (Pixel spot: mPixels){
          red = spot.getRed();  
          green = spot.getGreen();
          blue = spot.getBlue();
          newColor = new Color(255-red, 255-green, 255-blue);
          spot.setColor(newColor);
      }
      moto2.explore();
      mPixels = moto3.getPixels();
      for (Pixel spot: mPixels){
          red = spot.getRed();  
          green = spot.getGreen();
          blue = spot.getBlue();
          grayScale = (int) (red+blue+green)/3;
          newColor = new Color(grayScale, grayScale, grayScale);
          spot.setColor(newColor);
        }
      moto3.explore();
      mPixels = moto4.getPixels();
      for (Pixel spot: mPixels){
          red = (int) (spot.getRed()+100);  
          green = (int) (spot.getGreen()+100);
          blue = (int) (spot.getBlue()+100);
          if (red>255)
              red = 255;
          else if (green>225)
              green = 255;
          else if (blue>225)
              blue = 255;
          spot.setRed(red);
          spot.setGreen(green);
          spot.setBlue(blue);
        }
      moto4.explore();
      mPixels = moto5.getPixels();
      for (Pixel spot: mPixels){
          red = (int) (spot.getRed()+60);  
          green = (int) (spot.getGreen()+10);
          blue = (int) (spot.getBlue()+30);
          if (red>255)
              red = 255;
          else if (green>225)
              green = 255;
          else if (blue>225)
              blue = 255;
          spot.setRed(red);
          spot.setGreen(green);
          spot.setBlue(blue);
        }
      moto5.explore();
      mPixels = mark6.getPixels();
      mark6.explore();
      for (Pixel spot: mPixels){
          red = spot.getRed();  
          green = spot.getGreen();
          blue = spot.getBlue();
          if (red>10 && red<25 &&blue <255 && blue>10 && green>20 && green <50){
              spot.setGreen(255);
              spot.setBlue(0);
              spot.setRed(0);
            }
        }
      mark6.explore();
      //Notes
      //opens picture using a dialog box
      /*
     //String fileName = FileChooser.pickAFile();
     //Picture pictObj = new Picture(fileName);
     //pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //know it, Love it, Live it
     //relative path
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture moto = new Picture("images/redMotorcycle.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");

     apic.explore();
     // displays the picture
     //ferris1.explore();
     moto.explore();
     
     
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();
     
     Pixel[] Mpixels;
     Mpixels = moto.getPixels();
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );


    /*
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    Pixel spot2 = ferris1.getPixel(433, 283);
    Pixel ferris17 = pixels[17];

    
    ferris17.setRed(240);
    ferris17.setGreen(160);
    ferris17.setBlue(200);
    
    Color newColor = new Color(255,99,71);
    spot2.setColor(Color.blue);
    
    spot.setColor(newColor);
    
    
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    
    
    for (int i = 0; i<1000000; i++){
        Pixel yuck = ferris1.getPixel((int) (Math.random()*1000), (int) (Math.random()*668));
        yuck.setColor(Color.green);
    }
    ferris1.explore();
    int red;
    int blue;
    int green;
    for (Pixel spot1: Mpixels){
        //System.out.println(spot1);
        red = spot1.getRed();
        red = (int) (red * .25);
        spot1.setRed(red);
    }
    moto.explore();
    for (Pixel spot1: Mpixels){
        blue = spot1.getBlue();
        blue = (int) (blue * Math.random());
        spot1.setBlue(blue);
    
    
    }
    moto.explore();
    for (Pixel spot1: Mpixels){
        green = spot1.getGreen();
        green = (int) (green * Math.random());
        spot1.setGreen(green);
    }
    moto.explore();
    /*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
    /*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
     /**/

     /**
      * Method to clear red from picture
      * @param none
      * @return none
      */
     /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
    /**/
     /**
      * Method to reduce red from picture by a factor of n
      * @param none
      * @return none
      */

    /*
    int value;
    final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
