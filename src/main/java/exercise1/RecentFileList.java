package exercise1;

import java.util.*;

public class RecentFileList {
  private Map<Integer, File> fileMap;
  private ArrayList<File> files;

  //CONSTRUCTOR
  private RecentFileList() {
	this.files = new ArrayList<File>();
	this.fileMap = new HashMap<Integer, File>(); //A map to store the files
	//For loop generates 15 random files
	for (int c = 0; c < 20; c++) {
	  fileMap.put(c, new File("file number " + c));
	}
  }

  private static class RecentFilesGenerator { //Lazy singleton pattern to avoid more than one instance of the Recent File List
	static final RecentFileList recent = new RecentFileList();
  }

  public static RecentFileList getInstance() {
	return RecentFilesGenerator.recent;
  }

  public Map<Integer, File> getFileMap() {
	return fileMap;
  }

  public ArrayList<File> getFiles() {
	return files;
  }

  public void checkListContent() {
	ListIterator<File> iter = files.listIterator(files.size());
	System.out.println("Items in the list: ");
	while (iter.hasPrevious()) {
	  System.out.println(iter.previous().getTitle());
	}
  }

  public void showLastOpenedFile() {
	System.out.println("Last opened file: " + files.get(files.size() - 1).getTitle());
  }

  public void openFile(int a) {
	if (fileMap.containsKey(a)) { //Check if the file exist
	  System.out.println("The <<" + fileMap.get(a).getTitle() + ">> is opened.");
	  if (files.contains(fileMap.get(a))) { //If the element exist on the list then is bumped to the top
		int index = files.indexOf(fileMap.get(a)); //store the index of the element in the list
		files.remove(index); //remove the element to its position using index
		files.add(fileMap.get(a)); //add the element to the top
	  } else if (files.size() < 15) { //else just add a new element to the list
		files.add(fileMap.get(a));
	  } else {
		files.remove(0); //remove the oldest file
		files.add(fileMap.get(a));
	  }
	} else {
	  System.out.println("The file doesn't exist.");
	}
  }
}
