package br.ppgia.openjade.cronos;

import br.ppgia.openjade.cronos.ui.FrameCronos;
import br.ppgia.openjade.cronos.ui.SplashScreen;
import javax.swing.ImageIcon;

public class Cronos {
    public static void main(String args[]) {     

        SplashScreen spaScreen = new SplashScreen();
        spaScreen.showScreen();
        spaScreen.setProgress("interface", 0);        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameCronos().setVisible(true);
            }
        });             
        spaScreen.close();        
    }
}
