package jFileChooser;

// program to demonstrate the JFileChooser() constructor  
// importing the required packages  
import java.io.*;  
import javax.swing.*;  
import java.awt.event.*;  
import javax.swing.filechooser.*;  
 public class jFileChooserExample  
{  
public static void main(String[] args) {  
        // creating object to the JFileChooser class  
        JFileChooser jf = new JFileChooser(); // default constructor JFileChooser is called.  
        jf.showSaveDialog(null);  
    }  
}  
