/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import dedio.czwarty.Wersor;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Indzia
 */
public class Widok extends JFrame  
{
    JTextArea Total     = new JTextArea(30, 60);
    JScrollPane jScrollPane1 =  new JScrollPane();
    JButton    Wersory = new JButton("Wypisz WERSORY");
    JButton    WyM    = new JButton("wyswietl MACIERZE");
    JButton    OpW = new JButton("Wykonaj operacje na WEKTORACH");
    JButton    OpM = new JButton("Wykonaj operacje na MACIERZACH");
    JButton    Losowe = new JButton("Losuj");
    JButton    Test = new JButton("Testuj ITERATOR");
    JButton    Reset    = new JButton("res");
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
   
    private final Wersor wersor;
    
    public Widok(Wersor wersor) 
    {
       
        this.wersor = wersor;
       
        
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        

        OpW.setText("Operacje na WEKTORACH");

        WyM.setText("Wyswietl MACIERZE");

        OpM.setText("Operacje na MACIERZACH");

        Losowe.setText("LOSOWANIE");

        Test.setText("Test ITERATORA");

        Reset.setText("Wyczysc");

        
        jScrollPane1.setViewportView(Total);

        jLabel1.setText("Jaka operacje chceszwykonac?");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText(" Dzien dobry oto moj projket z JAVY");
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OpM)
                                    .addComponent(OpW)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Wersory, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Losowe, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(WyM, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Test, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Wersory)
                        .addGap(18, 18, 18)
                        .addComponent(OpW)
                        .addGap(18, 18, 18)
                        .addComponent(WyM)
                        .addGap(20, 20, 20)
                        .addComponent(OpM)
                        .addGap(18, 18, 18)
                        .addComponent(Losowe)
                        .addGap(18, 18, 18)
                        .addComponent(Test)
                        .addGap(18, 18, 18)
                        .addComponent(Reset))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        
        this.setTitle("Implementacja wzorca MVC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    
    public void showError(String errMessage) 
    {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
    public void addMultiplyListener(ActionListener mal) 
    {
        Wersory.addActionListener(mal);
        OpW.addActionListener(mal);
        WyM.addActionListener(mal);
        OpM.addActionListener(mal);
        Losowe.addActionListener(mal);
        Test.addActionListener(mal);
    }
    public void setTotal(String newTotal) 
    {
        Total.setText(newTotal);
    }
    public void append(String newTotal) 
    {
        Total.append(newTotal);
    }
    public void reset() 
    {
        Total.setText(" ");
    }

    public void addClearListener(ActionListener cal) 
    {
        Reset.addActionListener(cal);
    }


}
