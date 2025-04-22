import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class scrollwheel extends logo {
    private BufferedImage scrollWheel;
    private BufferedImage altscrollWheel;
    private boolean useAltScrollWheel = false;
    private String message = "white scroll wheel";


    public scrollwheel() {
        if (Math.random() > 0.5) {
            useAltScrollWheel = false;
        }
        else {
            useAltScrollWheel = true;
        }
        try {
            scrollWheel = ImageIO.read(getClass().getResource("scrollWheel.png"));
            altscrollWheel = ImageIO.read(getClass().getResource("altScrollWheel.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getScrollWheelImage() {
        if (useAltScrollWheel) {
            return altscrollWheel;
        }
        else {
            return scrollWheel;
        }
    }

    public BufferedImage swapScrollWheel() {
        if (useAltScrollWheel) {
            useAltScrollWheel = !useAltScrollWheel;
            messageUpdate();
            return altscrollWheel;
        }
        else {
            useAltScrollWheel = !useAltScrollWheel;
            messageUpdate();
            return scrollWheel;
        }
    }

    private void messageUpdate() {
        if (useAltScrollWheel) {
            message = "black scroll wheel";
        }
        else {
            message = "white scroll wheel";
        }
    }

    public String getMessage() {
        return super.getLogoMessage() + message + " ";  
    }
}