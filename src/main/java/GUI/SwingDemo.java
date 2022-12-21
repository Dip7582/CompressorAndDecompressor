/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author dipaksonawane
 */
public class SwingDemo extends javax.swing.JFrame {
   Image img = Toolkit.getDefaultToolkit().getImage("/Users/dipaksonawane/Downloads/Dip.jpeg");
   public SwingDemo() throws IOException {
      this.setContentPane(new JPanel() {
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      setVisible(true);
   }
}
