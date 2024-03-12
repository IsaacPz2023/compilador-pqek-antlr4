package org.example.controller;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.antlr4.gLexer;
import org.example.antlr4.gParser;
import org.example.app;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

public class ControllerIDE implements ActionListener, MouseListener {

    private final app vista;
    public ControllerIDE(app vista){
        this.vista = vista;

        PrintStream printStream = new PrintStream(new CustomOutputStream(this.vista.txt_consolas));
        System.setOut(printStream);

        this.vista.btn_run.addActionListener(this);
        this.vista.btn_new_file.addActionListener(this);
        this.vista.btn_add_folder.addActionListener(this);
        this.vista.btn_open_folder.addActionListener(this);
        this.vista.panel_proyecto.addMouseListener(this);
        this.vista.tree_fichero.addMouseListener(this);
        this.vista.btn_add_folder.addMouseListener(this);
        this.vista.btn_run.addMouseListener(this);
        this.vista.btn_open_folder.addMouseListener(this);
        this.vista.btn_new_file.addMouseListener(this);

    }

    public static String leerInput() {
        String input = JOptionPane.showInputDialog(null, "Ingrese su valor:");
        return input;
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
        if (this.vista.panel_proyecto == e.getSource() || this.vista.tree_fichero == e.getSource() || this.vista.btn_new_file == e.getSource() || this.vista.btn_open_folder == e.getSource() || this.vista.btn_add_folder == e.getSource() || this.vista.btn_run == e.getSource()) {
            visibleBoton();
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
            inVisibleBoton();
    }

    public void visibleBoton(){
        this.vista.btn_new_file.setVisible(true);
        this.vista.btn_run.setVisible(true);
        this.vista.btn_open_folder.setVisible(true);
        this.vista.btn_add_folder.setVisible(true);
    }

    public void inVisibleBoton(){
        this.vista.btn_new_file.setVisible(false);
        this.vista.btn_run.setVisible(false);
        this.vista.btn_open_folder.setVisible(false);
        this.vista.btn_add_folder.setVisible(false);
    }

    private class CustomOutputStream extends OutputStream {
        private JTextArea textArea;

        public CustomOutputStream(JTextArea textArea) {
            this.textArea = textArea;
        }

        @Override
        public void write(int b) {
            // Redirige la salida al JTextArea
            textArea.append(String.valueOf((char) b));

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vista.btn_run == e.getSource()){
            this.vista.txt_consolas.setText("");
            compiler();
        }
        if(this.vista.btn_new_file == e.getSource()){
            guardarContenido();
        }
        if(this.vista.btn_add_folder == e.getSource()){
            abrirArchivo();
        }
        if(this.vista.btn_open_folder == e.getSource()){
            abrirCarpeta();
        }
    }

    private void abrirCarpeta() {
        // Utilizar un JFileChooser para que el usuario seleccione una carpeta
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtener la carpeta seleccionada
            File selectedFolder = fileChooser.getSelectedFile();

            // Limpiar el modelo de árbol existente
            DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(selectedFolder.getName());
            this.vista.treeModel.setRoot(rootNode);

            // Llenar el modelo con la estructura de la carpeta
            llenarModelo(selectedFolder, rootNode);

            // Actualizar la interfaz gráfica
            this.vista.treeModel.reload();
        }
    }

    private void llenarModelo(File folder, DefaultMutableTreeNode parentNode) {
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(file.getName());

                if (file.isDirectory()) {
                    // Si es una carpeta, llamar recursivamente para llenar la estructura
                    llenarModelo(file, node);
                }

                parentNode.add(node);
            }
        }
    }

    private  void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Abrir Archivo");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".pqek") || f.isDirectory();
            }

            public String getDescription() {
                return "Archivos .pqek";
            }
        });

        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();

            try {
                // Leer el contenido del archivo y establecerlo en el txtEditor
                BufferedReader reader = new BufferedReader(new FileReader(fileToOpen));
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                reader.close();

                this.vista.setTxt_editor(content.toString());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo.");
            }
        }
    }

    private void guardarContenido() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Archivo");

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            // El archivo tenga la extensión .pqek
            if (!fileToSave.getName().endsWith(".pqek")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".pqek");
            }

            try {
                // Obtener el contenido del txtEditor
                Document doc = this.vista.getTxtEditor().getDocument();
                String content = doc.getText(0, doc.getLength());

                // Guardar el contenido en el archivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave));
                writer.write(content);
                writer.close();

                JOptionPane.showMessageDialog(null, "Archivo guardado exitosamente.");
            } catch (BadLocationException | IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo.");
            }
        }
    }

    public void compiler() {
        String input = "";
        input = this.vista.getTxtEditor().getText();
        System.out.println("Compilando...");

        gLexer lexer = new gLexer(CharStreams.fromString(input));
        CustomErrorListener errorListener = new CustomErrorListener(this.vista.txt_consolas);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);


        gParser parser = new gParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        gParser.ProgramaContext tree = parser.programa();
//        System.out.println(tree.toStringTree(parser));


        MyVisitor visitor = new MyVisitor(this);
        visitor.visit(tree);


        System.out.println("Proceso finalizado");

    }

}
