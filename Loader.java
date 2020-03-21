
public class Loader {
  public static void main(String[] args) {
    {
      Cat cat = new Cat();
      System.out.println(cat.getWeight());
      System.out.println("Масса седенной еды " + cat.massOfFood());
      System.out.println(cat.getWeight());
      System.out.println("Масса 'код коричневый' " + cat.getToilet());
      System.out.println(cat.getWeight());
      System.out.println("Масса на каторую кошка паправилась " + cat.getFat());

      boolean f = false;
      while (cat.getWeight() > 1000) {
        cat.meow();
      }
      System.out.println("cat " + cat.getStatus());
      System.out.println(cat.getWeight());

      Cat vasya = new Cat();

      while (vasya.getWeight() < 9000) {
        vasya.drink(1.0);
      }
      System.out.println("vasya " + vasya.getStatus());


      Cat jora = new Cat();
      System.out.println("jora " + Cat.getCount());
      Cat vacya = new Cat();
      vacya.feed(700.);
      System.out.println("vacya " + vacya.getWeight());
      vacya.feed(900.);
      System.out.println("vacya " + vacya.getWeight());
      vacya.feed(900.);
      System.out.println("vacya " + vacya.getWeight());
      vacya.feed(900.);
      System.out.println("vacya " + vacya.getWeight());
      vacya.feed(900.);
      System.out.println("vacya " + vacya.getWeight());
      vacya.feed(900.);
      System.out.println("vacya " + vacya.getWeight());
      vacya.feed(900.);

      System.out.println("vacya " + vacya.getWeight());
      System.out.println(Cat.getCount());

      Cat murka = new Cat();
      murka.feed(700.);
      System.out.println(Cat.getCount());

      Cat cisa = new Cat();
      cisa.feed(800.);
      System.out.println(Cat.getCount());

      Cat djeci = new Cat();
      djeci.feed(900.);
      System.out.println(Cat.getCount());

      Cat j = new Cat();
      System.out.println(j.getWeight());
      j.feed(2000.);
      System.out.println(j.getWeight());
    }

  }
}