import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageDisplay extends JFrame {
    
    private buttonPanel buttonPanel;
    private MouseControl mousePanel;
    
    public ImageDisplay() {
        setTitle("temp title");
        setSize(1200, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        mousePanel = new MouseControl();
        add(mousePanel, BorderLayout.CENTER);

        buttonPanel = new buttonPanel(mousePanel);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}