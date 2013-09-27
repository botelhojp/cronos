package br.ppgia.openjade.cronos;

import br.ppgia.openjade.cronos.dao.AcaoDAO;
import br.ppgia.openjade.cronos.ui.FrameCronos;
import br.ppgia.openjade.cronos.ui.SplashScreen;
import org.apache.log4j.Logger;

public class Cronos {
    
    private static Logger log = Logger.getLogger(Cronos.class);

    public static void main(String args[]) {
        SplashScreen spaScreen = new SplashScreen();
        try {
            spaScreen.showScreen();
            spaScreen.setProgress("interface", 0);

            AcaoDAO dao = AcaoDAO.getInstance();
            dao.list();

            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new FrameCronos().setVisible(true);
                }
            });
        } catch (Exception ex) {
        	ex.printStackTrace();
            log.error("Erro ao inicar o cronos. \nCausa:", ex);
        } finally {
            spaScreen.close();
        }
    }
}
