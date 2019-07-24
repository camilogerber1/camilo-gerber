package exercise2;

import java.util.ArrayList;
import java.util.*;

public class BlogController {
  private ArrayList<Posts> posts;
  private ArrayList<Posts> recents;

  private BlogController() {
	this.posts = new ArrayList<Posts>();
	this.recents = new ArrayList<Posts>();

  }

  private static class BlogControllerGenerator { //Lazy singleton pattern to avoid more than one instance of the Recent File List
	static final BlogController blog = new BlogController();
  }

  public static BlogController getInstance() {
	return BlogControllerGenerator.blog;
  }

  public ArrayList<Posts> getRecents() {
	return recents;
  }

  public ArrayList<Posts> getPosts() {
	return posts;
  }

  public void createNewEntry(String title, String text) {
	posts.add(new Posts(title, text));
	Posts lastAdded = posts.get(posts.size() - 1);
	if (recents.size() < 10) {
	  recents.add(lastAdded);

	} else {
	  recents.remove(0);
	  recents.add(lastAdded);
	}
	System.out.println("Entry created! \nTitle: " + title + "\nContent: " + text + "\n");
  }

  public void deleteEntry(int index) {
	if (posts.contains(posts.get(index))) {
	  Posts backup = posts.get(index);
	  posts.remove(posts.indexOf(backup));
	  if (recents.contains(backup))
		recents.remove(recents.indexOf(backup));
	  System.out.println("The entry " + backup.getTitle() + " has been deleted\n");
	} else {
	  System.out.println("The element doesn't exist");
	}
  }

  public void showRecentsEntries() {
	System.out.println("<--------Recent entries--------->");
	for (Posts recents : recents) {
	  System.out.print(recents.toString());
	}
	System.out.println();
  }

  public void showAllEntries() {
	int c = 0;
	System.out.println("<--------Entries in the post-------->");
	for (Posts post : posts) {
	  System.out.print(c + " " + post.toString());
	  c++;
	}
  }
}


