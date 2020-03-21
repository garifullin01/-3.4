
public class Loader {
  public static void main(String[] args)

  {
    Cat jora = new Cat();
    System.out.println(Cat.getCount());
    Cat vacya = new Cat();
    vacya.feed(700.);
    System.out.println(vacya.getWeight());
    vacya.feed(900.);
    System.out.println(vacya.getWeight());
    vacya.feed(900.);
    System.out.println(vacya.getWeight());
    vacya.feed(900.);
    System.out.println(vacya.getWeight());
    vacya.feed(900.);
    System.out.println(vacya.getWeight());
    vacya.feed(900.);
    System.out.println(vacya.getWeight());
    vacya.feed(900.);

    System.out.println(vacya.getWeight());
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
    j.feed(2000.);
    System.out.println(Cat.getCount());
    System.out.println(murka.getStatus());
  }

}
