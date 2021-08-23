import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

class Main extends JFrame {

    class App extends JPanel {

        Grid grid;
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
            stage = new Stage();
        }

        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Red vs. Blue");
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
}
 