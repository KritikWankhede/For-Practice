import java.io.File;
import java.io.IOException;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;

public class ImageConverter {
    public static void main(String[] args) {
        try {
            // Load the colour image
            BufferedImage colorImage = ImageIO.read(new File("C:\\Users\\kriti\\OneDrive\\Pictures\\Camera MI\\Rangoli.jpg"));
            
            // Create a grayscale image of the same dimensions
            BufferedImage grayscaleImage = new BufferedImage(colorImage.getWidth(), colorImage.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
            
            // Convert colour image to grayscale
            Graphics2D graphics = grayscaleImage.createGraphics();
            graphics.drawImage(colorImage, 0, 0, null);
            graphics.dispose();
            
            // Save the grayscale image
            ImageIO.write(grayscaleImage, "jpg", new File("C:\\Users\\kriti\\OneDrive\\Pictures\\TestBW\\RangoliOutput.jpg"));
            
            System.out.println("The Conversion to grayscale complete.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
