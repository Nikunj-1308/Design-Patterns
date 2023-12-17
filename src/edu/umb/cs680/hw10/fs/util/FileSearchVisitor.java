package edu.umb.cs680.hw10.fs.util;

import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.FSVisitor;
import edu.umb.cs680.hw10.fs.File;
import edu.umb.cs680.hw10.fs.Link;
import edu.umb.cs680.hw10.fs.util.FileSearchVisitor;

import java.util.LinkedList;

public class FileSearchVisitor implements FSVisitor {

    public String fileName; // Name of the file
    public LinkedList<File> foundFileList = new LinkedList<File>(); // List of files found

    public FileSearchVisitor(String fileName) { // Parameterized Constructor
        this.fileName = fileName;
    }

    public void visit(Link link) {
        return;
    }

    public void visit(Directory dir) {
        return;
    }

    public void visit(File file) {
        if (file.getName().equals(fileName)) {
            foundFileList.add(file); // Add file if visited and file found
        }
    }

    // Getter
    public LinkedList<File> getFoundFiles() {
        return foundFileList;
    }
}