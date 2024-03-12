package org.example;

import org.example.styles.EstilosIDE;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.IconUIResource;
import javax.swing.text.Element;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;


import jiconfont.swing.IconFontSwing;
import jiconfont.icons.font_awesome.FontAwesome;

public class app extends JFrame {
    // Variables declaration
    private JPanel panel1;
    private JButton btn_console_problem;
    private JButton btn_console_output;
    private JButton btn_console;
    public JTextArea txt_consolas;
    public JButton btn_new_file;
    public JButton btn_open_folder;
    public JButton btn_add_folder;
    public JTree tree_fichero;
    public DefaultTreeModel treeModel;
    private JTabbedPane tabbedPane1;
    private JScrollPane scroll_editor;
    private JPanel panel_editor;
    private JPanel panel_control_consola;
    private JPanel panel_contro_sub_consola;
    private JPanel panel_consola;
    private JScrollPane scroll_consola;
    private JPanel panel_control_tree;
    public JPanel panel_proyecto;
    private JScrollPane scroll_tree;
    public JButton btn_run;
    private JSplitPane split;
    private JSplitPane split_2;
    private JTextResaltadoFondo txt_editor = new JTextResaltadoFondo();
    public DecorationLineConsole txt_console = new DecorationLineConsole();
    private JButton btn_exit = new JButton();
    private JButton btn_maximizar = new JButton();
    private JButton btn_minimizar = new JButton();
    // End of variables declaration

    private final EstilosIDE styles = new EstilosIDE();


    public app() {
        initComponents();
        conf();

    }

    private void initComponents() {
        setTitle("Costeñol App");
        setContentPane(panel1);
        split.setBorder(null);
        split_2.setBorder(null);
        setSize(1080, 720);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
    }

    private void conf() {
        // Initialize the FontAwesome library
        IconFontSwing.register(FontAwesome.getIconFont());
        SwingUtilities.invokeLater(() -> {
            // button with a FontAwesome icon
            btn_new_file.setIcon(IconFontSwing.buildIcon(FontAwesome.FILE_CODE_O, 18, styles.getFont_color()));
            btn_open_folder.setIcon(IconFontSwing.buildIcon(FontAwesome.FOLDER_O, 18, styles.getFont_color()));
            btn_add_folder.setIcon(IconFontSwing.buildIcon(FontAwesome.FOLDER_OPEN_O, 18, styles.getFont_color()));
            btn_run.setIcon(IconFontSwing.buildIcon(FontAwesome.PLAY_CIRCLE_O, 20, new Color(62, 196, 101, 221)));
        });
        Icon icon = new IconUIResource(IconFontSwing.buildIcon(FontAwesome.ROCKET, 18, styles.getFont_color()));
        Icon icon_maximizar = new IconUIResource(IconFontSwing.buildIcon(FontAwesome.WINDOW_MAXIMIZE, 12, styles.getFont_color()));
        Icon icon_minimizar = new IconUIResource(IconFontSwing.buildIcon(FontAwesome.WINDOW_MINIMIZE, 12, styles.getFont_color()));
        Icon icon_cerrar = new IconUIResource(IconFontSwing.buildIcon(FontAwesome.WINDOW_CLOSE, 16, styles.getFont_color()));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new BorderLayout());
        menuBar.setBackground(styles.getBackground_base_color());

        JMenuBar panelMenu = new JMenuBar();
        panelMenu.setLayout(new BorderLayout());
        panelMenu.setBorder(null);
        panelMenu.setOpaque(false);

        // Crear a menu
        JMenu menu = new JMenu("File");
        menu.setForeground(Color.WHITE);

        // Crear menu items
        JMenuItem menuItem1 = new JMenuItem("Open");
        JMenuItem menuItem2 = new JMenuItem("Save");
        JMenuItem menuItem3 = new JMenuItem("Exit");

        // Agragar menu items to the menu
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.setBackground(styles.getBackground_base_color());

        // Agregar items a menubar y orientar
        panelMenu.add(menu, BorderLayout.WEST);
        menuBar.add(panelMenu, BorderLayout.CENTER);

        JMenuBar menuLogo = new JMenuBar();
        menuLogo.setBorder(BorderFactory.createEmptyBorder());
        menuLogo.setOpaque(false);

        JMenu logoMenu = new JMenu();
        logoMenu.setIcon(icon);
        logoMenu.setBackground(styles.getBackground_base_color());

        menuLogo.add(logoMenu);
        menuBar.add(menuLogo, BorderLayout.WEST);

        // crear boton
        JPanel panelControl = new JPanel();
        panelControl.setLayout(new FlowLayout());
        panelControl.setOpaque(false);

        btnControlFormt(btn_exit, icon_cerrar);

        btnControlFormt(btn_minimizar, icon_minimizar);

        btnControlFormt(btn_maximizar, icon_maximizar);

        // Agregar boton al menu
        panelControl.add(btn_minimizar);
        panelControl.add(btn_maximizar);
        panelControl.add(btn_exit);

        menuBar.add(panelControl, BorderLayout.EAST);
        // Poner accion al boton
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_minimizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minimizar();
            }
        });
        btn_maximizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (maximizado) {
                    minimizar_extender();
                } else {
                    extender();
                }
            }
        });
        menuBar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(34, 40, 49)));
        this.setJMenuBar(menuBar);

        scroll_editor.setViewportView(txt_editor);
        scroll_editor.setRowHeaderView(new LineNumberedView(txt_editor));
        txt_editor.requestFocus();

        //Estilos
        panel_editor.setBorder(BorderFactory.createEmptyBorder());
        panel_editor.setBackground(styles.getBackground_base_color());

        scroll_editor.setBorder(BorderFactory.createEmptyBorder());

        tabbedPane1.setBackground(styles.getBackground_color());
        tabbedPane1.setFont(styles.getFont_mono());
        tabbedPane1.setBorder(BorderFactory.createEmptyBorder());
        tabbedPane1.setForeground(styles.getFont_color());
        tabbedPane1.setTitleAt(0, "Code.pqek");

        txt_editor.setBackground(styles.getBackground_color());
        txt_editor.setForeground(styles.getFont_color());
        txt_editor.setCaretColor(styles.getCaret_font_color());
        txt_editor.setFont(styles.getFont_arial());
        txt_editor.setSelectionColor(styles.getCaret_font_color());
        txt_editor.setBorder(BorderFactory.createMatteBorder(2, 10, 20, 40, new Color(57, 62, 70)));

        panel_control_consola.setBackground(styles.getBackground_base_color());
        panel_control_consola.setBorder(BorderFactory.createEmptyBorder());
        panel_contro_sub_consola.setBackground(styles.getBackground_base_color());
        panel_contro_sub_consola.setBorder(BorderFactory.createEmptyBorder());

        panel_consola.setBorder(null);
        scroll_consola.setBorder(null);
        btn_console_problem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn_console.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn_console_output.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txt_consolas.setBackground(styles.getBackground_base_color());
        txt_consolas.setEditable(false);
        txt_consolas.setFont(styles.getFont_mono());
        txt_consolas.setForeground(styles.getFont_color());
        txt_consolas.setCaretColor(styles.getCaret_font_color());
        txt_consolas.setBorder(BorderFactory.createMatteBorder(1, 10, 10, 1, new Color(34, 40, 49)));

        txt_console.setBorder(BorderFactory.createEmptyBorder(0, 30, 10, 20)); // Agrega un margen izquierdo
        txt_console.setBackground(styles.getBackground_base_color());
        txt_console.setForeground(styles.getFont_color()); // Establece el color del texto
        txt_console.setSelectionColor(styles.getCaret_font_color());
        txt_console.setFont(styles.getFont_mono()); // Establece la fuente y el tamaño
        txt_console.setCaretColor(styles.getCaret_font_color());
        panel_consola.add(txt_console, BorderLayout.SOUTH);

        panel_control_tree.setBorder(null);
        scroll_tree.setBorder(null);
        // Crear el modelo de árbol
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Directorio Raíz");
        treeModel = new DefaultTreeModel(rootNode);
        tree_fichero.setBorder(null);
        tree_fichero.setCellRenderer(new MyTreeCellRenderer());
        tree_fichero.setModel(treeModel);

    }

    public JTextPane getTxtEditor() {
        return txt_editor;
    }

    public void setTxt_editor(String text) {
        this.txt_editor.setText(text);
    }

    private boolean maximizado = false;

    public void extender() {
        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        maximizado = true;
    }

    public void minimizar_extender() {
        this.setExtendedState(this.NORMAL);
        maximizado = false;
    }

    public void minimizar() {
        this.setState(this.ICONIFIED);
    }
    private void btnControlFormt(JButton btn, Icon icon) {
        btn.setIcon(icon);
        btn.setBackground(styles.getBackground_base_color());
        btn.setBorder(null);
        btn.setFocusPainted(false);
        btn.setHorizontalTextPosition(2);
        btn.setPreferredSize(new Dimension(40, 20));
    }


    //Dibuja y colorea la fila que esta seleccionada en el editor de texto
    class JTextResaltadoFondo extends JTextPane {

        private int lineaActual = 0;

        public JTextResaltadoFondo() {
            addCaretListener(new CaretListener() {
                @Override
                public void caretUpdate(CaretEvent e) {
                    try {
                        int caretPosition = getCaretPosition();
                        Element root = getDocument().getDefaultRootElement();
                        int linea = root.getElementIndex(caretPosition) + 1;
                        //System.out.println("Línea actual: " + linea);
                        if (linea != lineaActual) {
                            lineaActual = linea;
                            repaint();
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(JTextResaltadoFondo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            resaltarFondoLineaActual(g);
        }

        private void resaltarFondoLineaActual(Graphics g) {
            try {
                Rectangle rect = modelToView(getCaretPosition());
                int y = rect.y;
                int height = rect.height;
                g.setColor(new Color(238, 238, 238, 50));
                g.fillRect(0, y, getWidth(), height);

            } catch (Exception e) {
                // Manejo de excepciones
            }
        }
    }

    //Dibuja los numeros en columna de las lineas
    class LineNumberedView extends JComponent {

        private JTextPane textPane;

        public LineNumberedView(JTextPane textPane) {
            this.textPane = textPane;

            txt_editor.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    repaint();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    repaint();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                }
            });

        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            FontMetrics fm = textPane.getFontMetrics(textPane.getFont());
            Insets insets = textPane.getInsets();
            int lineHeight = fm.getHeight();
            int lineCount = textPane.getDocument().getDefaultRootElement().getElementCount();
            int startingLineNumber = 1;
            g.setColor(new Color(34, 40, 49));
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.LIGHT_GRAY);
            for (int i = 0; i < lineCount; i++) {
                int y = (i + 1) * lineHeight - fm.getDescent();
                int x = insets.left;
                g.drawString(Integer.toString(startingLineNumber + i), x, y);
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(40, textPane.getPreferredSize().height);
        }
    }

    //Agregar decoracion del textField de la consola
    public class DecorationLineConsole extends JTextField {

        public DecorationLineConsole() {
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(new Color(220, 220, 220)); // Establece el color del texto
            g.drawString("🌴", 5, 15); // Dibuja el indicador ">_"
        }

        @Override
        public Dimension getPreferredSize() {
            Dimension size = super.getPreferredSize();
            size.height = 30;
            return size;
        }
    }

    //Expande el arbol fichero
    class MyTreeCellRenderer extends DefaultTreeCellRenderer {

        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            // Obtiene el componente del renderizador predeterminado
            Component component = super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

            // Cambia el color de las letras
            ((JLabel) component).setForeground(Color.WHITE);
            ((JLabel) component).setOpaque(true);

            return component;
        }
    }

    public static void main(String args[]) {
        /* Set the look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }


}
