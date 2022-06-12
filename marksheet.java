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
      frame.setTitle("Hello AnnaUniversity Degree Sheet");
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

      tableModel.addColumn("Language/ Technology");
      tableModel.addColumn("Text Tutorial");
      tableModel.addColumn("Course Title");
      tableModel.addColumn("Views");
      tableModel.addRow(new Object[] { "NodeJS", "No", "Yes", "2350"});
      tableModel.addRow(new Object[] { "MVC", "Yes", "No", "1500"});
      tableModel.addRow(new Object[] { "ASP.NET", "Yes", "Yes", "3400"});
      tableModel.addRow(new Object[] { "F#", "Yes", "No", "7890"});
      tableModel.addRow(new Object[] { "", "", "***End of Statement***", ""});

      //row height customization
      table.setRowHeight(table.getRowHeight() + 20);
      table.getColumnModel().getColumn(2).setPreferredWidth(400);

      //alignment in table cells
      DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
      centerRenderer.setHorizontalAlignment(JLabel.CENTER);
      table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
      table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
      table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

      //text field
      JLabel lDob = new JLabel("DOB | ");
      //lDob.setPreferredSize(new Dimension(150,200));
      JTextArea dobArea = new JTextArea("14-11-2002");    
      dobArea.setEditable(false);

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

      colArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      regulationArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      dobArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      genArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      regNoArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      dateArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));

      //icon
      Image icon = Toolkit.getDefaultToolkit().getImage("Easwari_Engineering_College_logo.png");


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

      //panel where all components are going to be added
      JPanel p = new JPanel();

      //adding all components in the panel
      p.add(picLabel);
      p.add(l);
      p.add(picLabelRight);

      p.add(lDob);
      p.add(dobArea);

      p.add(lGender);
      p.add(genArea);

      p.add(lRegno);
      p.add(regNoArea);

      p.add(lDate);
      p.add(dateArea);

      p.add(lColName);
      p.add(colArea);

      p.add(regulationName);
      p.add(regulationArea);

      p.add(new JScrollPane(table));

      //added panel to frame
      frame.add(p);

      //frame visibility
      frame.setIconImage(icon); 
      //550-570
      frame.setSize(550,1000);
      frame.setVisible(true);
   }
}