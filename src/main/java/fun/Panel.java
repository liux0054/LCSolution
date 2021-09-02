package fun;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class Panel {
    public static void main(String args[]) throws BadLocationException {
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        JTextPane textPane = new JTextPane();
        textPane.setBackground(Color.blue);
        textPane.setBackground(Color.green);
        textPane.setOpaque(false);
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        textPane.setCharacterAttributes(attributeSet, true);
        textPane.setText("World Cup Cricket begins from ");
        Font font = new Font("Serif", Font.ITALIC, 18);
        textPane.setFont(font);
        StyledDocument doc = textPane.getStyledDocument();
        Style style = textPane.addStyle("", null);
        StyleConstants.setForeground(style, Color.red);
        StyleConstants.setBackground(style, Color.white);
        doc.insertString(doc.getLength(), "30th May ", style);
        StyleConstants.setForeground(style, Color.yellow);
        StyleConstants.setBackground(style, Color.gray);
        doc.insertString(doc.getLength(), "2019", style);
        JScrollPane scrollPane = new JScrollPane(textPane);
        container.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(550, 300);
        frame.setVisible(true);
    }
}
