/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panel;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Joseph
 */
public class MainFrameCode extends JFrame
{
    private javax.swing.JButton StartGameButton;
    private javax.swing.JButton InstructionsButton;
    private javax.swing.JButton HighScoresButton;
    private javax.swing.JButton QuitButton;

    private JPanel MainPanel;

    /**
     * Creates new form MainFrame
     */
    public MainFrameCode()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {
        StartGameButton = new JButton();
        InstructionsButton = new JButton();
        HighScoresButton = new JButton();
        QuitButton = new JButton();

        StartGameButton.setText("Start Game");
        StartGameButton.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent evt)
            {
                StartButtonMouseReleased(evt);
            }
        });

        InstructionsButton.setText("Instructions");
        InstructionsButton.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent evt)
            {
                InstructionsMouseReleased(evt);
            }
        });

        HighScoresButton.setText("High Scores");
        HighScoresButton.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent evt)
            {
                HighScoresMouseReleased(evt);
            }
        });

        QuitButton.setText("Quit");
        QuitButton.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent evt)
            {
                QuitMouseReleased(evt);
            }
        });

        this.setTitle("Stratego");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(QuitButton)
                    .addComponent(HighScoresButton)
                    .addComponent(InstructionsButton)
                    .addComponent(StartGameButton))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(StartGameButton)
                .addGap(18, 18, 18)
                .addComponent(InstructionsButton)
                .addGap(18, 18, 18)
                .addComponent(HighScoresButton)
                .addGap(18, 18, 18)
                .addComponent(QuitButton)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>

    private void StartButtonMouseReleased(MouseEvent evt)
    {
        System.out.println("Start Game");
        setSize(new Dimension(900, 700));
        setLocation(200, 25);
        getContentPane().removeAll();
        getContentPane().repaint();
        createPanel();
    }

    private void createPanel()
    {
        MainPanel = new JPanel();
        GroupLayout MainPanelLayout = new GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        System.out.println("Panel Success");
    }

    private void InstructionsMouseReleased(MouseEvent evt)
    {
        System.out.println("Instructions ");
    }

    private void HighScoresMouseReleased(MouseEvent evt)
    {
        System.out.println("High Scores");
    }

    private void QuitMouseReleased(MouseEvent evt)
    {
        System.out.println("Quit");
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameCode().setVisible(true);
            }
        });
    }
}
