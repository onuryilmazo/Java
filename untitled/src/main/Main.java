package main;

import javax.swing.Timer;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Main extends JFrame implements KeyListener, ActionListener {

    Snake snake;
    public Main() {
        // we will create the snake here
        this.snake = new Snake(this);
        //timer for redrawing the screen
        Timer timer = new Timer(150,this);
        timer.start();
        //timer for drawing apples on the screen
        java.util.Timer drawApples = new java.util.Timer();
        Apple st = new Apple(this.snake);
        drawApples.schedule(st,0,3000);

        //window creation & drawing
        add(this.snake);
        setTitle("Snake Game");
        setSize(525,525);
        addKeyListener(this);
        setLocationRelativeTo(null); //uygulama ekranın ortasında açılsın diye
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public  void keyTyped(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {

        int c = e.getKeyCode();
        if (c == 39 && !this.snake.getDirection().equals("left")) {
            this.snake.setDirection("right"); // right arrow pressed
        }

        else if (c == 37 && !this.snake.getDirection().equals("right")) {
            this.snake.setDirection("left"); // left arrow pressed
        }

        else if (c == 40 && !this.snake.getDirection().equals("down")) {
            this.snake.setDirection("up"); // up arrow pressed
        }

        else if (c == 38 && !this.snake.getDirection().equals("up")) {
            this.snake.setDirection("down"); // down arrow pressed
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //redraw the screen
        repaint();
    }



    public static void main(String[] args) {
        EventQueue.invokeLater(Main::new);
        //new Main(); bu da çalışıyor ama
        //Özetle, EventQueue.invokeLater(Main::new) kullanmak, Swing uygulamalarında daha güvenli ve yaygın bir yaklaşımdır,
        // çünkü Swing bileşenlerinin ve olaylarının ana iş parçacığında düzgün bir şekilde işlenmesini sağlar.
        // new Main() kullanmak, daha basit uygulamalarda veya Swing ile ilgili karmaşıklıkların olmadığı durumlarda tercih edilebilir.
    }
}