package Human;

public class Man extends Human {
  public Man(String name){
    super(name);
  }
  @Override
  public void printHuman(String name){
    super.printHuman("Мужчина по имени " + name);
  }
}
