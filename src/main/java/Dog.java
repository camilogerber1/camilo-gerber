public class Dog {

  private String name;
  private String breed;
  private int age;
  private int happiness;


  public Dog(String name, String breed, int age, int happiness) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.happiness = happiness;
  }

  public void grow(){

    this.age++;
  }

  public void eatingIncreasesHappiness(){
    this.happiness += 20;
  }

  public int getHappiness() {
    return happiness;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Dog{" +
            "name='" + name + '\'' +
            ", breed='" + breed + '\'' +
            ", age=" + age +
            '}';
  }


}
