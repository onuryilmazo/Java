package main;


import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Main extends JFrame implements KeyListener, ActionListener {

    public Main() {
        // we will create the snake here

        //timer for redrawing the screen

        //timer for drawing apples on the screen

        //window creation & drawing
        setTitle("Snake Game");
        setSize(525,525);
        this.addKeyListener(this);
        setLocationRelativeTo((null));
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}