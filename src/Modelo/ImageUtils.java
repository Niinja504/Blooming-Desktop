package Modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.imageio.ImageIO;

public class ImageUtils {
    public static BufferedImage resizeImageIfNeeded(BufferedImage image) {
        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();

        if (imageHeight > 1080 || imageWidth > 1080) {
            int scaledHeight;
            int scaledWidth;
            if (imageHeight > imageWidth) {
                scaledHeight = 1080;
                scaledWidth = (int) (imageWidth * (1080.0 / imageHeight));
            } else {
                scaledWidth = 1080;
                scaledHeight = (int) (imageHeight * (1080.0 / imageWidth));
            }
            BufferedImage resizedImage = new BufferedImage(scaledWidth, scaledHeight, image.getType());
            resizedImage.getGraphics().drawImage(image, 0, 0, scaledWidth, scaledHeight, null);
            return resizedImage;
        }
        return image;
    }

    public static File createImageFile() throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        File storageDir = new File(System.getProperty("java.io.tmpdir"));
        return File.createTempFile("JPEG_" + timeStamp + "_", ".jpg", storageDir);
    }

    public static File saveBufferedImageToFile(BufferedImage image, File file) throws IOException {
        ImageIO.write(image, "jpg", file);
        return file;
    }
}
