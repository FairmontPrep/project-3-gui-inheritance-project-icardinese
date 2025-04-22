import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class base {
    private BufferedImage base;
    private BufferedImage altbase;
    private boolean useAltBase = false;
    private String message = "white base";

    public base() {
        if (Math.random() > 0.5) {
            useAltBase = false;
        }
        else {
            useAltBase = true;
        }
        try {
            base = ImageIO.read(getClass().getResource("base.png"));
            altbase = ImageIO.read(getClass().getResource("altBase.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getBaseImage() {
        if (useAltBase) {
            return altbase;
        }
        else {
            return base;
        }
    }

    public BufferedImage swapBase() {
        if (useAltBase) {
            useAltBase = !useAltBase;
            messageUpdate();
            return altbase;
        }
        else {
            useAltBase = !useAltBase;
            messageUpdate();
            return base;
        }
    }

    private void messageUpdate() {
        if (useAltBase) {
            message = "black base";
        }
        else {
            message = "white base";
        }
    }

    public String getBaseMessage() {
        return "This mouse has inherited " + message + " ";  
    }
}
