package Human;

public class Woman extends Human{
  public Woman(String name){
    super(name);
  }
  @Override
  public void printHuman(String name){
    super.printHuman("Женщина по имени " + name);
  }

  @Override
  public void greetings(){
    System.out.println("Я родилась!");
  }
}
