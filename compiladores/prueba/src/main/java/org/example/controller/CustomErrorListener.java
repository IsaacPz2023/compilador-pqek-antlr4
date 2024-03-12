package org.example.controller;

import org.antlr.v4.runtime.*;

import javax.swing.*;

public class CustomErrorListener extends BaseErrorListener {
    private JTextArea console;

    public CustomErrorListener(JTextArea console) {
        this.console = console;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorMessage = "Error en la línea " + line + ", posición " + charPositionInLine + ": " + msg;
        console.append(errorMessage + "\n");

        //System.err.println(errorMessage);
    }
}
