package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlogControllerTest {

  @Test public void createNewEntry() {
	BlogController blog = BlogController.getInstance();
	String title = "Title example";
	String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit...";
	blog.createNewEntry(title, text);
	Posts temp = blog.getPosts().get(blog.getPosts().size() - 1);
	blog.showAllEntries();
	blog.showRecentsEntries();
	assertTrue(blog.getPosts().contains(temp));
  }

  @Test public void deleteAnExistingEntry() {
	BlogController blog = BlogController.getInstance();
	String title;
	String text;
	for (int c = 0; c < 5; c++) {
	  title = "Title " + c;
	  text = "Text " + c;
	  blog.createNewEntry(title, text);
	}
	blog.showAllEntries();
	Posts backup = blog.getPosts().get(2);
	System.out.println();
	blog.deleteEntry(2);
	blog.showAllEntries();
	assertFalse(blog.getPosts().contains(backup));
  }

  @Test public void showMostTenRecentEntries() {
	BlogController blog = BlogController.getInstance();
	int c = 0;
	String title = "Title " + c;
	String text = "Text " + c;
	blog.createNewEntry(title, text);
	Posts backup = blog.getRecents().get(blog.getRecents().size() - 1); //save the first added element for check later
	for (c = 1; c < 11; c++) {
	  title = "Title " + c;
	  text = "Text " + c;
	  blog.createNewEntry(title, text);
	}
	blog.showRecentsEntries();
	blog.showAllEntries();
	assertFalse(blog.getRecents().contains(backup));
  }
}