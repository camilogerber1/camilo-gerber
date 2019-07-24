package exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecentFileListTest {

  @Test public void whenTheProgramRunsForTheFirsTimeTheListIsEmpty() {
	RecentFileList list = RecentFileList.getInstance();
	assertTrue(list.getFiles().isEmpty());
  }

  @Test public void whenAFileIsOpenedItIsAddedToRecentFileList() {
	RecentFileList list = RecentFileList.getInstance();
	list.openFile(2);
	list.checkListContent();
	assertTrue(list.getFiles().contains(list.getFileMap().get(2)));
  }

  @Test public void ifAnOpenedFileAlreadyExistIsBumpedToTheTop() {
	RecentFileList list = RecentFileList.getInstance();
	list.openFile(2);
	list.openFile(3);
	list.openFile(4);
	list.openFile(5);
	System.out.println();
	list.checkListContent();
	System.out.println();
	list.showLastOpenedFile();
	System.out.println();
	list.openFile(2);
	System.out.println();
	list.checkListContent();
	System.out.println();
	list.showLastOpenedFile();
	assertTrue(list.getFiles().get(list.getFiles().size() - 1) == list.getFileMap().get(2));
  }

  @Test public void whenTheListIsFullThenRemoveOldestItem() {
	RecentFileList list = RecentFileList.getInstance();
	for (int c = 0; c < 15; c++) {
	  list.openFile(c);
	}
	File oldest = list.getFiles().get(0);
	System.out.println();
	list.checkListContent();
	System.out.println();
	list.openFile(17);
	System.out.println();
	list.checkListContent();
	assertFalse(list.getFiles().get(0) == oldest);
  }
}