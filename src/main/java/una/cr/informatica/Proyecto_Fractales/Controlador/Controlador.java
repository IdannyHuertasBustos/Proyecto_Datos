/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package una.cr.informatica.Proyecto_Fractales.Controlador;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import una.cr.informatica.Proyecto_Fractales.Modelo.Arbol;
import una.cr.informatica.Proyecto_Fractales.Vista.MainFrame;

/**
 *
 * @author Asus
 */
public class Controlador {
    private MainFrame main;

    public Controlador(){
        this.main = new MainFrame();
        Arbol arbolito = new Arbol();
        cargaEventos();
    }
    public void cargaEventos(){
        eventoAlturaSlider();
        eventoAperturaAngulosSlider();
        eventoCantidadRamasSlider();
        eventoInclinacionSlicer();
    }
    public void eventoAlturaSlider(){
        this.main.getAlturaSlicer().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int value = main.getAlturaSlicer().getValue();
                System.out.println(value);
                switch(main.getAlturaSlicer().getValue()){
                    case 1:
                        value = 500;
                    case 2,3,4,5,6,7,8,9,10,11,12:
                        if(main.getAlturaSlicer().getValue() > main.getTamOld()){
                            value = main.getTamMax() - 32;
                            main.setTamOld(main.getTamOld() + 1);
                        }
                        else{
                            value = main.getTamMax() + 32;
                            main.setTamOld(main.getTamOld() - 1);
                        }
                }
                main.setTamMax(value);
                main.repaint();
            }
        });
    }
    public void eventoAperturaAngulosSlider(){
        this.main.getAperturaAngulosSlicer().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int value = main.getAperturaAngulosSlicer().getValue();
                System.out.println(value);
                switch(main.getAperturaAngulosSlicer().getValue()){
                    case 1:
                        value = 500;
                    case 2,3,4,5,6,7,8,9,10,11,12:
                        if(main.getAperturaAngulosSlicer().getValue() > main.getTamOld()){
                            value = main.getTamMax() - 32;
                            main.setTamOld(main.getTamOld() + 1);
                        }
                        else{
                            value = main.getTamMax() + 32;
                            main.setTamOld(main.getTamOld() - 1);
                        }
                }
                main.setTamMax(value);
                main.repaint();
            }
        });
    }
    public void eventoCantidadRamasSlider(){
        this.main.getCantidadRamasSlider().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int value = main.getCantidadRamasSlider().getValue();
                System.out.println(value);
                switch(main.getCantidadRamasSlider().getValue()){
                    case 1:
                        value = 500;
                    case 2,3,4,5,6,7,8,9,10,11,12:
                        if(main.getCantidadRamasSlider().getValue() > main.getTamOld()){
                            value = main.getTamMax() - 32;
                            main.setTamOld(main.getTamOld() + 1);
                        }
                        else{
                            value = main.getTamMax() + 32;
                            main.setTamOld(main.getTamOld() - 1);
                        }
                }
                main.setTamMax(value);
                main.repaint();
            }
        });
    }
    public void eventoInclinacionSlicer(){
        this.main.getInclinacionSlicer().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int value = main.getInclinacionSlicer().getValue();
                System.out.println(value);
                switch(main.getInclinacionSlicer().getValue()){
                    case 1:
                        value = 500;
                    case 2,3,4,5,6,7,8,9,10,11,12:
                        if(main.getInclinacionSlicer().getValue() > main.getTamOld()){
                            value = main.getTamMax() - 32;
                            main.setTamOld(main.getTamOld() + 1);
                        }
                        else{
                            value = main.getTamMax() + 32;
                            main.setTamOld(main.getTamOld() - 1);
                        }
                }
                main.setTamMax(value);
                main.repaint();
            }
        });
    }

    public void startApplication(){
        this.main.setVisible(true);
    }
}
