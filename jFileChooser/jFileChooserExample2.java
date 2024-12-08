package jFileChooser;

// program to demonstrate the JFileChooser(File currentDirectory, FileSystemViewfsv) constructor  
// importing the required packages  
import java.io.*;  
import javax.swing.*;  
import java.awt.event.*;  
import javax.swing.filechooser.*;  
public class jFileChooserExample2  
{  
public static void main(String[] args) {  
        // creating object to the JFileChooser class  
        JFileChooser jf = new JFileChooser("c:", FileSystemView.getFileSystemView()); // parameterised constructor JFileChooser(File currentDirectory, FileSystemViewfsv) is called.  
        jf.showSaveDialog(null); // opening the saved dialogue  
    }  
}  
