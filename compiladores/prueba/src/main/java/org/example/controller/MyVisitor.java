package org.example.controller;


import org.example.antlr4.gBaseVisitor;
import org.example.app;


public class MyVisitor extends gBaseVisitor<Void> {
    private ControllerIDE controller;

    private app frame;
    public MyVisitor(ControllerIDE controller) {
        this.controller = controller;

    }



}
