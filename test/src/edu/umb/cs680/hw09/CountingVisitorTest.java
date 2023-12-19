package edu.umb.cs680.hw09;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw09.fs.*;
import edu.umb.cs680.hw09.fs.util.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

class CountingVisitorTest {
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
    }

    private String[] dirToStringArray(Directory d) {
        Optional<Directory> optionalDirectory = Optional.ofNullable(d.getParent());
        String[] dirInfo = { d.getName(), Integer.toString(d.getSize()),
                optionalDirectory.isPresent() ? d.getParent().getName() : null };
        return dirInfo;
    }

    @Test
    public void verifyDirectoryCount4ForRepo() {
        int expected = 4;
        CountingVisitor visitor = new CountingVisitor();
        repo.accept(visitor);
        Assertions.assertEquals(expected, visitor.getDirNum());
    }

    @Test
    public void verifyFileCount5ForRepo() {
        int expected = 5;
        CountingVisitor visitor = new CountingVisitor();
        repo.accept(visitor);
        Assertions.assertEquals(expected, visitor.getFileNum());
    }

    @Test
    public void verifyLinkCount1ForRepo() {
        int expected = 1;
        CountingVisitor visitor = new CountingVisitor();
        repo.accept(visitor);
        Assertions.assertEquals(expected, visitor.getLinkNum());
    }
}