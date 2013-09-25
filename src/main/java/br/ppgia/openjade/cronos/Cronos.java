package br.ppgia.openjade.cronos;

import br.ppgia.openjade.cronos.ui.FrameCronos;

public class Cronos {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameCronos().setVisible(true);
            }
        });
    }
}
