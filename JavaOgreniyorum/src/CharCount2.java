import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CharCount2 extends JFrame implements ActionListener{

    JLabel lb1,lb2;

    JTextArea ta;

    JButton b;

    JButton pad, text;

    //constructor method bir sınıf nesnesi oluşturulduğunda (main içinde new CharCount2();)
    // çalışan özel metotlardır. İsmi sınıf adı ile aynıdır ve sınıf nesnesi oluşturulurken çaprılır.
    //
    CharCount2(){
        //Java'da bir alt sınıfın yapıcı metodunda super() kullanmak zorunda değilsiniz, ancak genellikle kullanmanız önerilir.
        super("Char Word Count Tool - JTP");
        lb1 = new JLabel(" Characters: ");
        lb1.setBounds(50, 50, 100, 20);
        lb2 = new JLabel("Words: ");
        lb2.setBounds(50, 80, 100,20);

        ta = new JTextArea();
        ta.setBounds(50, 110, 300, 200);

        b = new JButton("click");
        b.setBounds(50,320,80,30);
        b.addActionListener(this);

        pad = new JButton("Pad Color");
        pad.setBounds(140,320,110,30);
        pad.addActionListener(this);

        text = new JButton(" Text Color");
        text.setBounds(260, 320, 110, 30);
        text.addActionListener(this);

        add(lb1);add(lb2);add(ta);add(b);add(pad);add(text);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    // ActionListener arayüzünden gelen actionPerformed yöntemi
    public void actionPerformed(ActionEvent e) {
        // Burada kullanıcı tıklamayı işleyeceğiniz kodu ekleyin
        if(e.getSource() == b){
            String text = ta.getText();
            lb1.setText("Characters: "+ text.length());
            String words[] = text.split("\\s");
            lb2.setText("Words"+ words.length);
        } else if(e.getSource() == pad){
            Color c=JColorChooser.showDialog(this, "Chose Color", Color.BLACK);
            ta.setBackground(c);
        } else if (e.getSource() == text){
            Color c=JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
            ta.setForeground(c);
        }
    }




    public static void main(String[]args){
        new CharCount2();
    }}
