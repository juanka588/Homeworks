/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author JuanCamilo
 */
public class GUI extends javax.swing.JFrame {

    private static final double MIN_RATE = 0.01;
    private static final double MAX_RATE = 1.0;
    private static final double ZOOM_POWER = 0.05;
    public static final int ZOOM_IN = KeyEvent.VK_A, ZOOM_OUT = KeyEvent.VK_Z, REFRESH = KeyEvent.VK_F5;
    private Image imagePNG, copy = null;
    private WebDriver driver;
    private String baseUrl;
    private String translation;
    private double reductionRate;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        RSyntaxTextArea textArea = new RSyntaxTextArea(20, 60);
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_SQL);
        textArea.setCodeFoldingEnabled(true);
        this.getRootPane().add(textArea);
        output.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_SQL);
        output.setCodeFoldingEnabled(true);
        setKeyBindings();
        System.setProperty("webdriver.gecko.driver", "/home/alejandro/Documents/Firefox Driver/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:7474";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl + "/browser/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("connect_password")));
        element.clear();
        element.sendKeys("ale123");
        driver.findElement(By.id("connect_button")).click();
        drawComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new RSyntaxTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neo4J Translator");

        input.setText("create (n:Person{name:\"juan\"})");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        jButton1.setLabel("Translate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Translation");

        jButton2.setText("Ver tabla SQL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setColumns(20);
        output.setFont(new java.awt.Font("RomanD", 0, 14)); // NOI18N
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String cypherText = input.getText();
        ANTLRInputStream input = new ANTLRInputStream(cypherText);
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        translation = (String) loader.visit(tree);
        System.out.println("translation " + translation);
        output.setText(translation.replaceAll(";", ";\n").replaceAll(",", ",\n"));
        openBrowser(cypherText);
        drawComponents();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        SQLViewer.cad = "Cypher Translator";
        SQLViewer.query = translation;
        SQLViewer viewer = new SQLViewer();
        viewer.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void zoomIn() {
        if (reductionRate <= MIN_RATE) {
            reductionRate = MIN_RATE;
        } else {
            reductionRate -= ZOOM_POWER;
            drawComponents();
        }
    }

    private void zoomOut() {
        if (reductionRate >= MAX_RATE) {
            reductionRate = MAX_RATE;
        } else {
            reductionRate += ZOOM_POWER;
            drawComponents();
        }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private RSyntaxTextArea output;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
    private RSyntaxTextArea output2;
    private void drawComponents() {
        try {
            String property = System.getProperty("user.home");
            imagePNG = ImageIO.read(new File("/home/alejandro/Downloads/graph.png"));

        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        int h = (int) (imagePNG.getHeight(null) * (1 - reductionRate));
        int w = (int) (imagePNG.getWidth(null) * (1 - reductionRate));
        copy = imagePNG.getScaledInstance(w == 0 ? 1 : w, h == 0 ? 1 : h,
                Image.SCALE_DEFAULT);

        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(copy, 0, 0, null);
            }

            @Override
            public Dimension getPreferredSize() {
                int maxDimX = 0;
                int maxDimY = 0;
                Component[] components = this.getComponents();
                for (int i = 0; i < components.length; i++) {
                    if (components[i].isVisible()) {
                        Rectangle bounds = components[i].getBounds();
                        maxDimX = Math.max(maxDimX, (int) bounds.getMaxX());
                        maxDimY = Math.max(maxDimY, (int) bounds.getMaxY());
                    }
                }
                if (maxDimX == 0 && maxDimY == 0) {
                    maxDimX = w;
                    maxDimY = h;
                }
                return new Dimension(maxDimX, maxDimY);
            }
        };
        panel.setLayout(null);
        panel.setBackground(Color.white);
        scrollPane.setViewportView(panel);
    }

    private void setKeyBindings() {
        ActionMap actionMap = getRootPane().getActionMap();
        int condition = JComponent.WHEN_IN_FOCUSED_WINDOW;
        InputMap inputMap = getRootPane().getInputMap(condition);

        String vkZin = KeyEvent.getKeyText(ZOOM_IN);
        String vkZout = KeyEvent.getKeyText(ZOOM_OUT);
        String vkRefresh = KeyEvent.getKeyText(REFRESH);

        inputMap.put(KeyStroke.getKeyStroke(ZOOM_IN, 0), vkZin);
        inputMap.put(KeyStroke.getKeyStroke(ZOOM_OUT, 0), vkZout);
        inputMap.put(KeyStroke.getKeyStroke(REFRESH, 0), vkRefresh);

        actionMap.put(vkZin, new KeyAction(vkZin));
        actionMap.put(vkZout, new KeyAction(vkZout));
        actionMap.put(vkRefresh, new KeyAction(vkRefresh));
    }

    private void openBrowser(String cypherText) {
        //"div.cm-s-neo > div > textarea" cm-s-neo
        WebElement element = driver.findElement(By.className("view-editor"));
        WebElement custom = element.findElement(By.className("ng-valid"));
        System.out.println(custom.toString());
        WebElement child = custom.findElement(By.className("CodeMirror"));
        System.out.println(child.toString());
        WebElement txArea = child.findElement(By.cssSelector("div > textarea"));
        System.out.println(txArea.toString());
        System.out.println(txArea.getTagName()+" "+txArea.getAttribute("style") + " text: " + txArea.getText());
        txArea.clear();
        txArea.sendKeys(Keys.HOME + cypherText + " return *");
        /*    txArea.sendKeys(Keys.TAB);
         txArea.sendKeys(cypherText);*/

        driver.findElement(By.xpath("//div[@id='stream']/div/div/div/div/div/ul/li[6]/a")).click();
        driver.findElement(By.cssSelector("i.fa.fa-play")).click();
        driver.findElement(By.xpath("//div[@id='stream']/div/div/div/div/div/ul/li[6]/a")).click();
    }

    private class KeyAction extends AbstractAction {

        private static final long serialVersionUID = 1L;

        public KeyAction(String actionCommand) {
            putValue(ACTION_COMMAND_KEY, actionCommand);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvt) {
            switch (actionEvt.getActionCommand()) {
                case "A":
                    zoomOut();
                    break;
                case "Z":
                    zoomIn();
                    break;
                case "F5":
                    drawComponents();
                    break;

                default:
                    break;
            }
        }

    }
}
