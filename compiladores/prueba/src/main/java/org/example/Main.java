package org.example;

import org.example.controller.ControllerIDE;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                app vistaIDE = new app();
                ControllerIDE controllerIDE = new ControllerIDE(vistaIDE);
                vistaIDE.setVisible(true);


            }
        });
    }
}
