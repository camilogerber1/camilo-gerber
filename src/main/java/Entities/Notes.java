package Entities;

import org.mongodb.morphia.annotations.Embedded;

@Embedded public class Notes {
  private int par1;
  private int par2;
  private int par3;
  private int finalNote;

  public Notes() {
  }

  public Notes(int par1, int par2, int par3, int finalNote) {
	this.par1 = par1;
	this.par2 = par2;
	this.par3 = par3;
	this.finalNote = finalNote;
  }

  public int getPar1() {
	return par1;
  }

  public void setPar1(int par1) {
	this.par1 = par1;
  }

  public int getPar2() {
	return par2;
  }

  public void setPar2(int par2) {
	this.par2 = par2;
  }

  public int getPar3() {
	return par3;
  }

  public void setPar3(int par3) {
	this.par3 = par3;
  }

  public int getFinalNote() {
	return finalNote;
  }

  public void setFinalNote(int finalNote) {
	this.finalNote = finalNote;
  }
}
