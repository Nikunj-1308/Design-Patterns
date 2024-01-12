package edu.umb.cs680.FileDirSys.fs.util;

import edu.umb.cs680.FileDirSys.fs.FSCommand;
import edu.umb.cs680.FileDirSys.fs.FSElement;

public class FileSearch implements FSCommand {
    private final FileSearchVisitor visitor;
    private final FSElement rootDir;

    public FileSearch(FileSearchVisitor visitor, FSElement rootDir) {
        this.visitor = visitor;
        this.rootDir = rootDir;
    }

    @Override
    public void execute() {
        rootDir.accept(visitor);
    }

    public FileSearchVisitor getVisitor() {
        return visitor;
    }
}