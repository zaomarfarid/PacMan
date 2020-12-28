package game;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {
    
    
    public Pacman() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(366, 450);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Pacman ex = new Pacman();
            ex.setVisible(true);
        });
    }
}
