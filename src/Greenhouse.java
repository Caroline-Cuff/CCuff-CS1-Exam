public class Greenhouse {
    public String name;
    public Boolean sprinklersOn;
    public int numberOfFlowers;

    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
    }

    public Greenhouse() {
        System.out.println("Hello World! Good luck on your exams!");
        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering " +
                "plants right now. We have " + numberOfFlowers + " flowers!");
        numberOfFlowers = 45;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering " +
                "plants right now. We have " + numberOfFlowers + " flowers!");
        System.out.println(); // sout to add line break
        randomReplant();
        veggieOfTheDay("carrots");
        countFlowers();
        changeTemperature();
        plant kimPlant = new plant(3, "orange", true);
        kimPlant.printInfo();
        plant myPlant = new plant(10,"neon green", false);
        myPlant.printInfo();
        starTriangle(9);
    }

    //method: randomReplant
    public void randomReplant() {
        int randomInt = (int) (Math.random() * 16); // *16 to go up to but not include 16
        System.out.println("We are replanting " + randomInt + " vegetables today!");
        System.out.println();

    }

    //method : veggieOfTheDay
    public void veggieOfTheDay(String veggie) {
        System.out.println("Today's chosen veggie is " + veggie);
        System.out.println();
    }

    //method: countFlowers
    public void countFlowers() {
        for (int x = 2; x <= 6; x = x + 1) {
            System.out.println(x);

        }
        System.out.println();
        for (int y = 20; y <= 110; y = y + 30) {
            System.out.println(y);
        }
        System.out.println();
        for (int z = 8; z >= 0; z = z - 1) {
            System.out.print(z + ",");
        }
        System.out.println();


    }

    public void changeTemperature() {
        double randomNum;
        randomNum = Math.random() * 1;
        if (randomNum < 0.25) {
            System.out.println("The temperature has decreased by 2 degrees. ");
        } else if (randomNum <= 0.5 && randomNum > 0.25) {
            System.out.println("The temperature has decreased by 1 degree.");
        } else if (randomNum <= 0.75 && randomNum > 0.5) {
            System.out.println("The temperature has increased by 1 degree.");
        } else {
            System.out.println("The temperature has increased by 2 degrees.");
        }
        System.out.println();
    }

    public void starTriangle(int size) {
              size = size - 1;
        int x = 1;
        System.out.println("*");
        while (x <= size) {
            for (int y = 0; y <= x; y = y + 1) {
                System.out.print("*");
            }
            x = x + 1;
            System.out.println();
        }


        if (size > 3){
            size = size - 1;
            System.out.println("-");
            System.out.println("--");
           x = 0;
          size = size -3;
          while ( x <= size) {
              System.out.print("-");
                for (int y = 0; y <= x; y = y + 1) {
                    System.out.print("*");
                }
                x = x + 1;
                System.out.print("-");
              System.out.println();}

          size = size + 4;

          while ( size > 0){
                  System.out.print("-");
                  size = size-1;
              }
        }
        else {
            int z = 1;
        size = size -1;
            System.out.println("-");
        while (z <= size) {
            for (int a = 0; a <= z; a = a + 1) {
                System.out.print("-");
            }
            z = z + 1;
            System.out.println();
            }


        }



        }
    }


