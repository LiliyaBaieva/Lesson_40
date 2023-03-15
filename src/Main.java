import Human.Human;
import Human.Man;
import Human.Woman;

public class Main {
  public static void main(String[] args) {
// Создайте класс "Человек", конструктор которого принимает имя.

// При попытке вывести объект этого класса на экран должна выводиться строка "Человек по имени ...".
// Добавьте в класс "Человек" метод "приветствие", который будет выводить строку: "Я родился!"

// Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".

// Попытка вывести их на экран должна приводить к выводу строки
// "Мужчина по имени ..." или "Женщина по имени ..."
// Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"
    Human human = new Human("Барабашка");
    Man man = new Man("Василий");
    Woman woman = new Woman("Маруся");

    human.printHuman(human.getName());
    human.greetings();
    System.out.println();

    man.printHuman(man.getName());
    man.greetings();
    System.out.println();

    woman.printHuman(woman.getName());
    woman.greetings();
    System.out.println();

  }
}