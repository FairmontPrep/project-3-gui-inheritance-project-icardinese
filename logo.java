import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class logo extends buttons {
    private BufferedImage logo;
    private BufferedImage altlogo;
    private boolean useAltLogo = false;
    private String message = "colorless logo";

    public logo() {
        if (Math.random() > 0.5) {
            useAltLogo = false;
        }
        else {
            useAltLogo = true;
        }
        try {
            logo = ImageIO.read(getClass().getResource("logo.png"));
            altlogo = ImageIO.read(getClass().getResource("altLogo.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getLogoImage() {
        if (useAltLogo) {
            return altlogo;
        }
        else {
            return logo;
        }
    }

    public BufferedImage swapLogo() {
        if (useAltLogo) {
            useAltLogo = !useAltLogo;
            messageUpdate();
            return altlogo;
        }
        else {
            useAltLogo = !useAltLogo;
            messageUpdate();
            return logo;
        }
    }

    private void messageUpdate() {
        if (useAltLogo) {
            message = "blue logo";
        }
        else {
            message = "colorless logo";
        }
    }

    public String getLogoMessage() {
        return super.getButtonsMessage() + message + " ";  
    }
}