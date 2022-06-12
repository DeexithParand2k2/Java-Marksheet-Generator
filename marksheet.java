import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.util.Scanner;
import java.awt.*;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.text.*; 
import java.awt.font.TextLayout; 
import java.awt.font.*;
import java.util.Map;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class marksheet extends JFrame{
   public static void main(String args[]) throws IOException{

      //initialization
      String semno,courseCode,courseTitle,credits,letterGrade,result;

      //inputs
      Scanner myObj = new Scanner(System.in);

      //values
      semno = "1";
      courseCode = "191CSC404T";
      courseTitle = "Physics";
      credits = "3";
      letterGrade = "A";
      result = "PASS";

      //frame creation
      marksheet frame = new marksheet();
      frame.setTitle("ANNA UNIVERSITY DEGREE SHEET");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //TITLE Table 1
      JLabel l = new JLabel("ANNA UNIVERSITY DEGREE EXAMINATIONS GRADE SHEET",SwingConstants.CENTER);
      l.setPreferredSize(new Dimension(400,200));
      l.setFont(new Font("Serif", Font.PLAIN, 12));
      Font font = l.getFont();
      Map attributes = font.getAttributes();
      attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
      l.setFont(font.deriveFont(attributes));

      //Table 3 creation
      DefaultTableModel tableModel = new DefaultTableModel();
      JTable table = new JTable(tableModel);

      tableModel.addColumn("Sem No.");
      tableModel.addColumn("Course Code");
      tableModel.addColumn("Course Title");
      tableModel.addColumn("Credits");
      tableModel.addColumn("Grade");
      tableModel.addColumn("Result");
      tableModel.addRow(new Object[] { "01", "191CSC404T", "PROG IN JAVA", "3", "A", "PASS"});
      tableModel.addRow(new Object[] { "01", "191CSC404T", "PROG IN JAVA", "3", "A", "PASS"});
      tableModel.addRow(new Object[] { "01", "191CSC404T", "PROG IN JAVA", "3", "A", "PASS"});
      tableModel.addRow(new Object[] { "01", "191CSC404T", "PROG IN JAVA", "3", "A", "PASS"});
      tableModel.addRow(new Object[] { "01", "191CSC404T", "PROG IN JAVA", "3", "A", "PASS"});
      tableModel.addRow(new Object[] { "", "", "***End of Statement***", "", "", ""});

      //row height customization
      table.setRowHeight(table.getRowHeight() + 20);
      table.getColumnModel().getColumn(2).setPreferredWidth(400);
      table.getColumnModel().getColumn(1).setPreferredWidth(250);

      //alignment in table cells
      DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
      centerRenderer.setHorizontalAlignment(JLabel.CENTER);
      table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
      table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
      table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
      table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
      table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);

      //text field
      JLabel lDob = new JLabel("DOB | ");
      //lDob.setPreferredSize(new Dimension(150,200));
      JTextArea dobArea = new JTextArea("14-11-2002");    
      dobArea.setEditable(false);

      JLabel lName = new JLabel("CANDIDATE NAME | ");
      //lDob.setPreferredSize(new Dimension(150,200));
      JTextArea nameArea = new JTextArea("DEEXITH PARANDAMAN");    
      nameArea.setEditable(false);

      JLabel lGender = new JLabel("GENDER | ");
      //lGender.setPreferredSize(new Dimension(150,200));
      JTextArea genArea = new JTextArea("MALE");    
      genArea.setEditable(false);

      JLabel lRegno = new JLabel("REGNO | ");
      //lRegno.setPreferredSize(new Dimension(150,200));
      JTextArea regNoArea = new JTextArea("310620104035");    
      regNoArea.setEditable(false);

      JLabel lDate = new JLabel("MON-YR | ");
      //lDate.setPreferredSize(new Dimension(150,200));
      JTextArea dateArea = new JTextArea("NOV-2022");    
      dateArea.setEditable(false);

      JLabel lColName = new JLabel("COLLEGE | ");
      JTextArea colArea = new JTextArea("EASWARI ENGINEERING COLLEGE");    
      colArea.setEditable(false);

      JLabel regulationName = new JLabel("REGULATION | ");
      JTextArea regulationArea = new JTextArea("2019");    
      regulationArea.setEditable(false);

      nameArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      colArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      regulationArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      dobArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      genArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      regNoArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      dateArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));

      //icon
      Image icon = Toolkit.getDefaultToolkit().getImage("Anna_University_Logo.svg.png");


      //image left
      BufferedImage img = ImageIO.read(new File("Easwari_Engineering_College_logo.png"));

      Image dimg = img.getScaledInstance(50, 50, Image.SCALE_DEFAULT); 

      ImageIcon imageIcon = new ImageIcon(dimg);
      JLabel picLabel = new JLabel(imageIcon);

      //image Right
      BufferedImage imgRight = ImageIO.read(new File("graduate.jpg"));

      Image dimgRight = imgRight.getScaledInstance(50, 50, Image.SCALE_DEFAULT); 

      ImageIcon imageIconRight = new ImageIcon(dimgRight);
      JLabel picLabelRight = new JLabel(imageIconRight);  


      //final part (Signature, Stamp, Date of issue) ((width,height))
      BufferedImage sign = ImageIO.read(new File("sign.png"));
      Image dimgSign = sign.getScaledInstance(100, 50, Image.SCALE_DEFAULT); 
      ImageIcon imageIconSign = new ImageIcon(dimgSign);
      JLabel picLabelSign = new JLabel(imageIconSign); 
      picLabelSign.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

      JLabel signText = new JLabel(" CONTROLLER OF EXAMINATIONS ");
      signText.setForeground(Color.gray);
      signText.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

      BufferedImage stamp = ImageIO.read(new File("stamp.png"));
      Image dimgStamp = stamp.getScaledInstance(100, 50, Image.SCALE_DEFAULT); 
      ImageIcon imageIconStamp = new ImageIcon(dimgStamp);
      JLabel picLabelStamp = new JLabel(imageIconStamp); 
      picLabelStamp.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

      JLabel lIssueDate = new JLabel("DATE OF ISSUE | 14/11/2002");
      lIssueDate.setForeground(Color.gray);

      //panel where all components are going to be added
      JPanel p = new JPanel();

      JPanel top = new JPanel();
      JPanel mid1 = new JPanel();
      JPanel mid2 = new JPanel();
      JPanel mid3 = new JPanel();
      JPanel bottom = new JPanel();
      JPanel signPanel = new JPanel();

      //adding all components in the panel
      signPanel.add(signText);

      bottom.add(picLabelStamp);
      bottom.add(lIssueDate);
      bottom.add(picLabelSign);

      top.add(picLabel);
      top.add(l);
      top.add(picLabelRight);

      mid1.add(lName);
      mid1.add(nameArea);

      mid2.add(lDob);
      mid2.add(dobArea);

      mid1.add(lRegno);
      mid1.add(regNoArea);

      mid2.add(lGender);
      mid2.add(genArea);

      mid2.add(lDate);
      mid2.add(dateArea);

      mid3.add(lColName);
      mid3.add(colArea);

      mid3.add(regulationName);
      mid3.add(regulationArea);

      //subpanels
      p.add(top);
      p.add(mid1);
      p.add(mid2);
      p.add(mid3);

      //this table is directly added wihtout inserting in a subpanel
      p.add(new JScrollPane(table));
      p.add(bottom);
      p.add(signPanel);

      //added panel to frame
      frame.add(p);

      //frame visibility
      frame.setIconImage(icon); 
      frame.setSize(600,1000);
      frame.setVisible(true);
   }
}