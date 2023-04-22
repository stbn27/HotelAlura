/*
 * Fecha de creacion: 15/04/2023 23:34:54
 * Version: v.0.1
 * Detalles: 
 */

package com.alura.controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import com.alura.vistas.Piso1;

/**
 * @author Willy Stbn
 */

public class Piso1Controller implements MouseListener{
    
    private Piso1 piso1;
    

    public Piso1Controller(Piso1 piso1 ) {
        this.piso1 = piso1;
        
        //this.piso1.Habitacion101.addMouseListener(this);
        this.piso1.labe_101.addMouseListener(this);
        this.piso1.label_102.addMouseListener(this);
        this.piso1.label_103.addMouseListener(this);
        this.piso1.label_104.addMouseListener(this);
        this.piso1.label_105.addMouseListener(this);
        this.piso1.label_106.addMouseListener(this);
        this.piso1.label_107.addMouseListener(this);
        this.piso1.label_108.addMouseListener(this);
        this.piso1.label_109.addMouseListener(this);
        
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
 
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Color verdeOscuro = new Color(0,153,0);
        Color rojoOscuro = new Color(102,51,0);
        Color azulOscuro = new Color(0,102,102);
        
        Color verdeClaro = new Color(0,200,0);
        Color rojoClaro = new Color(200,0,0);
        Color azulClaro = new Color(0,0,200);
        
        if(e.getSource() == piso1.labe_101){
            Color actual = piso1.Habitacion101.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion101.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion101.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion101.setBackground(azulClaro);
            }
        }if(e.getSource() == piso1.label_102){
            Color actual = piso1.Habitacion102.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion102.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion102.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion102.setBackground(azulClaro);
            }
        } if(e.getSource() == piso1.label_103){
            Color actual = piso1.Habitacion103.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion103.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion103.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion103.setBackground(azulClaro);
            }
        } if(e.getSource() == piso1.label_104){
            Color actual = piso1.Habitacion104.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion104.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion104.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion104.setBackground(azulClaro);
            }
        } if(e.getSource() == piso1.label_105){
            Color actual = piso1.Habitacion105.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion105.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion105.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion105.setBackground(azulClaro);
            }
        } if(e.getSource() == piso1.label_106){
            Color actual = piso1.Habitacion106.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion106.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion106.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion106.setBackground(azulClaro);
            }
        } if(e.getSource() == piso1.label_107){
            Color actual = piso1.Habitacion107.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion107.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion107.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion107.setBackground(azulClaro);
            }
        } if(e.getSource() == piso1.label_108){
            Color actual = piso1.Habitacion108.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion108.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion108.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion108.setBackground(azulClaro);
            }
        } if(e.getSource() == piso1.label_109){
            Color actual = piso1.Habitacion109.getBackground();
            
            if(actual.equals(verdeOscuro)){
                piso1.Habitacion109.setBackground(verdeClaro);
            } else if(actual.equals(rojoOscuro)){
                piso1.Habitacion109.setBackground(rojoClaro);
            } else if(actual.equals(azulOscuro)){
                piso1.Habitacion109.setBackground(azulClaro);
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Color verdeOscuro = new Color(0,153,0);
        Color rojoOscuro = new Color(102,51,0);
        Color azulOscuro = new Color(0,102,102);
        
        Color verdeClaro = new Color(0,200,0);
        Color rojoClaro = new Color(200,0,0);
        Color azulClaro = new Color(0,0,200);
        
        if(e.getSource() == piso1.labe_101){
            Color actual = piso1.Habitacion101.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion101.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion101.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion101.setBackground(azulOscuro);
            }
        }if(e.getSource() == piso1.label_102){
            Color actual = piso1.Habitacion102.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion102.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion102.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion102.setBackground(azulOscuro);
            }
        } if(e.getSource() == piso1.label_103){
            Color actual = piso1.Habitacion103.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion103.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion103.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion103.setBackground(azulOscuro);
            }
        } if(e.getSource() == piso1.label_104){
            Color actual = piso1.Habitacion104.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion104.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion104.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion104.setBackground(azulOscuro);
            }
        } if(e.getSource() == piso1.label_105){
            Color actual = piso1.Habitacion105.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion105.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion105.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion105.setBackground(azulOscuro);
            }
        } if(e.getSource() == piso1.label_106){
            Color actual = piso1.Habitacion106.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion106.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion106.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion106.setBackground(azulOscuro);
            }
        } if(e.getSource() == piso1.label_107){
            Color actual = piso1.Habitacion107.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion107.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion107.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion107.setBackground(azulOscuro);
            }
        } if(e.getSource() == piso1.label_108){
            Color actual = piso1.Habitacion108.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion108.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion108.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion108.setBackground(azulOscuro);
            }
        } if(e.getSource() == piso1.label_109){
            Color actual = piso1.Habitacion109.getBackground();
            
            if(actual.equals(verdeClaro)){
                piso1.Habitacion109.setBackground(verdeOscuro);
            } else if(actual.equals(rojoClaro)){
                piso1.Habitacion109.setBackground(rojoOscuro);
            } else if(actual.equals(azulClaro)){
                piso1.Habitacion109.setBackground(azulOscuro);
            }
        }
    }

    
}
