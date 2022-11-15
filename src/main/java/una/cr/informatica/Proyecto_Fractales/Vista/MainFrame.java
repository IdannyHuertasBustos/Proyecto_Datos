/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package una.cr.informatica.Proyecto_Fractales.Vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Line2D;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Asus
 */
public class MainFrame extends javax.swing.JFrame {
    private int frameWidth;
    private int frameHeight;
    private int tamMax;
    private int incMax;
    private int angMax;
    private int tamOld;
    static public double deg_2_rad = Math.PI / 180.0;
    private final int WINDOW_WIDTH = 1280;
    private final int WINDOW_HEIGHT = 720;

    public static final Color LIGHT_BROWN = new Color(153, 102, 0);
    public static final Color BROWN = new Color(102, 51, 0);
    public static final Color VERDE_MUSGO = new Color(102, 100, 0);

    public int getTamOld() {
        return tamOld;
    }

    public void setTamOld(int tamOld) {
        this.tamOld = tamOld;
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(int frameWidth) {
        this.frameWidth = frameWidth;
    }

    public int getFrameHeight() {
        return frameHeight;
    }

    public void setFrameHeight(int frameHeight) {
        this.frameHeight = frameHeight;
    }

    public int getTamMax() {
        return tamMax;
    }

    public void setTamMax(int tamMax) {
        this.tamMax = tamMax;
    }

    public int getIncMax() {
        return incMax;
    }

    public void setIncMax(int incMax) {
        this.incMax = incMax;
    }


    public int getAngMax() {
        return angMax;
    }

    public void setAngMax(int angMax) {
        this.angMax = angMax;
    }

    public JSlider getAlturaSlicer() {
        return alturaSlicer;
    }

    public void setAlturaSlicer(JSlider alturaSlicer) {
        this.alturaSlicer = alturaSlicer;
    }

    public JSlider getAperturaAngulosSlicer() {
        return aperturaAngulosSlicer;
    }

    public void setAperturaAngulosSlicer(JSlider aperturaAngulosSlicer) {
        this.aperturaAngulosSlicer = aperturaAngulosSlicer;
    }

    public JSlider getCantidadRamasSlider() {
        return cantidadRamasSlider;
    }

    public void setCantidadRamasSlider(JSlider cantidadRamasSlider) {
        this.cantidadRamasSlider = cantidadRamasSlider;
    }

    public JSlider getInclinacionSlicer() {
        return inclinacionSlicer;
    }

    public void setInclinacionSlicer(JSlider inclinacionSlicer) {
        this.inclinacionSlicer = inclinacionSlicer;
    }

    public MainFrame() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(204, 255, 204));
        frameWidth = 1280;
        frameHeight = 1000;
        this.tamOld = 1;
        this.tamMax = 500;
        this.aperturaAngulosSlicer.setMinimum(-90);
        this.alturaSlicer.setValue(7);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(100, 0, frameWidth, frameHeight);
    }

    public void paint(Graphics g) {
        super.paint(g);

        try {
            //drawFractalTree(g, WINDOW_WIDTH / 2, WINDOW_HEIGHT - 75, -90, 4,25);
            dibujaArbol(g, WINDOW_WIDTH / 2, WINDOW_HEIGHT + 100 , -90, alturaSlicer.getValue(), 25);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void dibujaArbol(Graphics g, int x1, int y1, double angle, int depth, double angle1) {
        try {

            if (depth != 0) {
                switch (depth) {
                    case 1: {
                        g.setColor(Color.RED);
                        break;
                    }
                    case 2: {
                        g.setColor(Color.ORANGE);
                        break;
                    }
                    case 3: {
                        g.setColor(Color.YELLOW);
                        break;
                    }
                    case 4: {
                        g.setColor(Color.GREEN);
                        break;
                    }
                    case 5: {
                        g.setColor(VERDE_MUSGO);
                        break;
                    }
                    case 6: {
                        g.setColor(LIGHT_BROWN);
                        break;
                    }
                    case 7: {
                        g.setColor(BROWN);
                        break;
                    }
                    default:
                        g.setColor(BROWN);
                        break;
                }
                // Thread.sleep(100);//It has a catch exception here;
                int x2 = (int) (x1 + (Math.cos(Math.toRadians(angle)) * depth * 15.0));
                int y2 = (int) (y1 + (Math.sin(Math.toRadians(angle)) * depth * 15.0));
                //
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(5));
                g2d.draw(new Line2D.Float(x1, y1, x2, y2));

                dibujaArbol(g2d, x2, y2, angle - angle1, depth - 1, angle1);
                dibujaArbol(g2d, x2, y2, angle, depth - 1, angle1);
                dibujaArbol(g2d, x2, y2, angle + angle1, depth - 1, angle1);


            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void drawFractalTree(Graphics g, int x1, int y1, double angle, int depth, double angle1) throws InterruptedException {

        if (depth != 0) {
            //Thread.sleep(100);//It has a catch exception here;
            int x2 = (int) (x1 + (Math.cos(Math.toRadians(angle)) * depth * 10.0));
            int y2 = (int) (y1 + (Math.sin(Math.toRadians(angle)) * depth * 10.0));

            Graphics2D g2d = (Graphics2D) g;
            g2d.drawLine(x1, y1, x2, y2);
            repaint();
            drawFractalTree(g, x2, y2, angle + angle1, depth - 1, angle1);
            drawFractalTree(g, x2, y2, angle - angle1, depth - 1, angle1);
        } else
            return;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alturaSlicer = new javax.swing.JSlider();
        inclinacionSlicer = new javax.swing.JSlider();
        aperturaAngulosSlicer = new javax.swing.JSlider();
        cantidadRamasSlider = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fractal");
        setBackground(new java.awt.Color(204, 255, 204));

        alturaSlicer.setMaximum(10);
        alturaSlicer.setMinimum(1);
        alturaSlicer.setOrientation(javax.swing.JSlider.VERTICAL);

        inclinacionSlicer.setMaximum(180);
        inclinacionSlicer.setOrientation(javax.swing.JSlider.VERTICAL);

        aperturaAngulosSlicer.setMaximum(180);
        aperturaAngulosSlicer.setOrientation(javax.swing.JSlider.VERTICAL);

        cantidadRamasSlider.setMaximum(12);
        cantidadRamasSlider.setMinimum(1);
        cantidadRamasSlider.setOrientation(javax.swing.JSlider.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(332, Short.MAX_VALUE)
                                .addComponent(cantidadRamasSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aperturaAngulosSlicer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inclinacionSlicer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alturaSlicer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(aperturaAngulosSlicer, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                        .addComponent(inclinacionSlicer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alturaSlicer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cantidadRamasSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider alturaSlicer;
    private javax.swing.JSlider aperturaAngulosSlicer;
    private javax.swing.JSlider cantidadRamasSlider;
    private javax.swing.JSlider inclinacionSlicer;
    // End of variables declaration//GEN-END:variables

}
