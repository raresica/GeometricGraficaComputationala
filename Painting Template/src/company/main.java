package company;
import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers
public class main {


    /** Custom Drawing Code Template */
// A Swing application extends javax.swing.JFrame
    public static class CGTemplate extends JFrame {
        // Define constants
        public static final int CANVAS_WIDTH  = 640;
        public static final int CANVAS_HEIGHT = 480;

        // Declare an instance of the drawing canvas,
        // which is an inner class called DrawCanvas extending javax.swing.JPanel.
        private DrawCanvas canvas;

        // Constructor to set up the GUI components and event handlers
        public CGTemplate() {
            canvas = new DrawCanvas();    // Construct the drawing canvas
            canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

            // Set the Drawing JPanel as the JFrame's content-pane
            Container cp = getContentPane();
            cp.add(canvas);
            // or "setContentPane(canvas);"

            setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
            pack();              // Either pack() the components; or setSize()
            setTitle("First ");  // "super" JFrame sets the title
            setVisible(true);    // "super" JFrame show
        }

        /**
         * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
         */
        private class DrawCanvas extends JPanel {
            // Override paintComponent to perform your own painting
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);     // paint parent's background
                setBackground(Color.white);  // set background color for this JPanel

                // Your custom painting codes. For example,
                // Drawing primitive shapes


                for (int i=0;i<3; i++)
                    for (int j=0;j<3;j++)
                        g.drawRect(200*i+50, 150*j+50, 150, 100);

                g.setColor(Color.black);
                g.drawLine(70, 70, 180, 140);

                g.drawRect(280, 70, 100, 50);

                String str="Hello Mr. Text";
                g.drawString(str, 500, 100);

                g.drawOval(100,225, 50,50);

                g.drawArc(280,225,50,50, 0,90);

                g.drawRoundRect(475,225,80,50,20,20);

                int a[]={70,100,130,150,170};
                int b[]={440,360,420,400,420};
                g.drawPolyline(a,b,5);

                int c[]={280,300,325,350};
                int d[]={440,360,420,400};
                g.drawPolygon(c,d,4);

                g.setColor(Color.blue);
                g.fill3DRect(480,370,50,50,true);
                g.fill3DRect(540,370,50,50,false);


//                g.setColor(Color.YELLOW);    // set the drawing color
//                g.drawLine(30, 40, 100, 200);
//                g.drawOval(150, 180, 10, 10);
//                g.drawRect(200, 210, 20, 30);
//                g.setColor(Color.RED);       // change the drawing color
//                g.fillOval(300, 310, 30, 50);
//                g.fillRect(400, 350, 60, 50);
//                // Printing texts
//                g.setColor(Color.WHITE);
//                g.setFont(new Font("Monospaced", Font.PLAIN, 12));
//                g.drawString("Testing custom drawing ...", 10, 20);
            }
        }

        // The entry main method
        public static void main(String[] args) {
            // Run the GUI codes on the Event-Dispatching thread for thread safety
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new CGTemplate(); // Let the constructor do the job
                }
            });
        }
    }
}
