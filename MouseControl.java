import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MouseControl extends JPanel {

    private scrollwheel mouse;

    private String message;
    private JLabel loadMessage;  

    public MouseControl() {
        setPreferredSize(new Dimension(600,600));
        mouse = new scrollwheel();
        setLayout(new BorderLayout());
        message = mouse.getMessage();
        loadMessage = new JLabel(message);
    }
    
    public void swapLayer(String layerName) {
        switch (layerName) {
            case "Base":
                mouse.swapBase();
                break;
            case "Scroll Wheel":
                mouse.swapScrollWheel();
                break;
            case "Buttons":
                mouse.swapButtons();
                break;
            case "Logo":    
                mouse.swapLogo();
                break;
            default:
                System.out.println("Invalid layer name");
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        BufferedImage baseImage = mouse.getBaseImage();
        BufferedImage scrollWheelImage = mouse.getScrollWheelImage();
        BufferedImage buttonsImage = mouse.getButtonsImage();
        BufferedImage logoImage = mouse.getLogoImage();
        
        message = mouse.getMessage();

        loadMessage.setText(message);
        add(loadMessage);

        drawLayer(g2d, baseImage);
        drawLayer(g2d, logoImage);
        drawLayer(g2d, buttonsImage);
        drawLayer(g2d, scrollWheelImage);
    }

    private void drawLayer(Graphics2D g2d, BufferedImage image) {
        if (image != null) {
            int x = (getWidth() - image.getWidth()) / 2;
            int y = (getHeight() - image.getHeight()) / 2;
            g2d.drawImage(image, x, y, this);
        }
    }

    public String getMessage() {
        return message;
    }
}
