
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double massOfFood;
    private double toilet;
    private double getFat;
    private static int count;


    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        massOfFood = weight / 10;
        toilet = weight / 17;
        count = count + 1;

    }
    public static int getCount()
    {
        return count;
    }

    public Double getFat()
    {
        getFat = massOfFood - toilet;
        return getFat;
    }

    public Double getToilet()
    {
        weight = weight - toilet;
        return toilet;
    }

    public Double massOfFood()
    {
        weight = weight + massOfFood;
        return massOfFood;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
      if (weight <= maxWeight) {
        weight = weight + amount;
        if (weight > maxWeight) {
          count = count - 1;

        }
      }
    }

    public void drink(Double amount)
    {
      System.out.println(weight = weight + amount);
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}