package edu.umb.cs680.hwFileDirSys7.fs.util;

import java.util.LinkedList;
import edu.umb.cs680.FileDirSys.fs.*;
import edu.umb.cs680.FileDirSys.fs.FSVisitor;

public class FileCrawlingVisitor implements FSVisitor {
    private LinkedList<File> fileList = new LinkedList<File>();

    public void visit(Link link) {
        return;
    }

    public void visit(Directory dir) {
        return;
    }

    public void visit(File file) {
        fileList.add(file);
    }

    public LinkedList<File> getFiles() {
        return fileList;
    }
}