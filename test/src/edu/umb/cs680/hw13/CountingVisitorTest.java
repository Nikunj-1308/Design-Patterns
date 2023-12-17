package edu.umb.cs680.hw13;

import java.util.List;
import java.time.LocalDateTime;
import edu.umb.cs680.hw13.fs.*;
import edu.umb.cs680.hw13.fs.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

class CountingVisitorTest
{
    private static CountingVisitor countingVisitor;
    static LocalDateTime time = LocalDateTime.now();
    static Directory repo;

    static Directory src;
    static File a;
    static File b;

    static Directory test;
    static Directory srcTest;
    static File aTest;
    static File bTest;

    static File readme;

    static Link linkToReadMe;

    @BeforeAll
    static void setUpFileSystemStructureBeforeTest() {
        repo = new Directory(null, "repo", 0, time);

        src = new Directory(repo, "src", 0, time);
        a = new File(src, "A.java", 1, time);
        b = new File(src, "B.java", 1, time);

        test = new Directory(repo, "test", 0, time);
        srcTest = new Directory(test, "src", 0, time);
        aTest = new File(srcTest, "ATest.java", 1, time);
        bTest = new File(srcTest, "BTest.java", 1, time);

        readme = new File(repo, "readme.md", 1, time);
        linkToReadMe = new Link(srcTest, "rm.md", 1, time, readme);

        countingVisitor = new CountingVisitor();
        repo.accept(countingVisitor);
    }

    @Test
    public void verifyCountOfFiles() {
        int expected = 5;
        Assertions.assertEquals(expected, countingVisitor.getFileNum());
    }

    @Test
    public void verifyCountOfLinks() {
        int expected = 1;
        Assertions.assertEquals(expected, countingVisitor.getLinkNum());
    }

    @Test
    public void verifyCountOfDirectories() {
        int expected = 4;
        Assertions.assertEquals(expected, countingVisitor.getDirNum());
    }
}