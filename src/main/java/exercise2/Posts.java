package exercise2;

public class Posts {

  private String title;
  private String text;

  public Posts(String title, String text) {
	this.title = title;
	this.text = text;
  }

  public String getTitle() {
	return title;
  }

  public void setTitle(String title) {
	this.title = title;
  }

  public String getText() {
	return text;
  }

  public void setText(String text) {
	this.text = text;
  }

  @Override public String toString() {
	return "Posts{" + "title='" + title + '\'' + ", text='" + text + '\'' + '}' + "\n";
  }
}
