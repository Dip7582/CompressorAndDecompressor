/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import compressor.Decompressor;
import compressor.compressor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dipaksonawane
 */


public class AppFrame extends javax.swing.JFrame implements ActionListener{
    
    JButton compressButton ;
    JButton decompressButton ;
    Image img = Toolkit.getDefaultToolkit().getImage("/Users/dipaksonawane/Downloads/Dip.jpeg");
    
    AppFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        compressButton = new JButton("Select File to Compress");
        compressButton.addActionListener(this);
        compressButton.setBounds(10,300,200,30);
        
        
        
        decompressButton = new JButton("Select File to Decompress"); 
        decompressButton.addActionListener(this);
        decompressButton.setBounds(100,300,200,40);
        
        this.setContentPane(new JPanel() {
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      setVisible(true);
    
        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(500,200);
        
        this.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compressButton){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    compressor.method(file);
                }
                catch(Exception excp){
                    JOptionPane.showMessageDialog(null,e.toString());
                }
                        
                
            }
            
        }
        if(e.getSource()==decompressButton){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    Decompressor.method(file);
                }
                catch(Exception exc){
                    JOptionPane.showMessageDialog(null,exc.toString());
                }
        
        }
    }
    
    
    }
}
