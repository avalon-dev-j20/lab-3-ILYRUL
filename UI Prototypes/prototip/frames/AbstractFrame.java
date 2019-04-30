/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototip.frames;

/**
 *
 * @author Svtlana
 */
 


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

//Предварительная подготовка класса для того чтобы
//основные конфигурационные действия для окна выполнялись
//после открытия.

public class AbstractFrame extends JFrame {

    private class EventListener extends WindowAdapter {

        @Override
        public void windowOpened(WindowEvent we) {
            onCreate();
        }
       
    }

    public AbstractFrame(){
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        
        WindowAdapter listener = new EventListener();
        addWindowListener(listener);
    }
    
    protected void onCreate(){}
}