package Human;

public class Human {
  private String name;

  public Human(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printHuman(String name){
    System.out.println("Человек по имени " + name);
  }

  public void greetings(){
    System.out.println("Я родился!");
  }

}
