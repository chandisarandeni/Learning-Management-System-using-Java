package CommonClasses;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * A utility class for resizing images with enhanced smoothness and sharpness.
 *
 * @author chand
 */
public class ImageResizer {
    /**
     * Resizes an image to the specified width and height with smooth scaling.
     *
     * @param imagePath Path of the image to resize.
     * @param width     Desired width of the resized image.
     * @param height    Desired height of the resized image.
     * @return Resized ImageIcon, or null if an error occurs.
     */
    public static ImageIcon resizeImage(String imagePath, int width, int height) {
        try {
            File imageFile = new File(imagePath);
            BufferedImage originalImage = ImageIO.read(imageFile);

            if (originalImage != null) {
                Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                // Create a BufferedImage with improved sharpness
                BufferedImage smoothImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
                smoothImage.getGraphics().drawImage(resizedImage, 0, 0, null);

                return new ImageIcon(smoothImage);
            } else {
                System.err.println("Invalid image or unable to read file: " + imagePath);
                return null;
            }
        } catch (Exception e) {
            System.err.println("Error resizing image: " + e.getMessage());
            return null;
        }
    }
}
