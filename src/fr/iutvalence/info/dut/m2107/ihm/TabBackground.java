/**
 * Classe pour afficher les images dans les onglets.
 */
package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TabBackground {

	/**
	 * Initialisation d'un fond.
	 */
    private BufferedImage bg;

    /**
     * Mise en place d'un fond.
     */
    public TabBackground() {
        try {
            bg = ImageIO.read(new URL("http://2.bp.blogspot.com/-wWANHD-Dr00/TtSmeY57ZXI/AAAAAAAABB8/t-fpXmQZ0-Y/s1600/Vector_by_Karpiu23.png"));
        } catch (IOException ex) {
            Logger.getLogger(TabBackground.class.getName()).log(Level.SEVERE, null, ex);
        }

        JPanel tabPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 300);
            }
        };
    }

}
