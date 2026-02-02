public class plant {
    public int numWeeksOld;
    public String color;
    public boolean isEdible;

    public plant( int pWeeks, String pcolor, Boolean pedible){
        numWeeksOld = pWeeks;
        color = pcolor;
        isEdible = pedible;


    }

    public void printInfo(){
        System.out.println("This plant is " + numWeeksOld + " weeks old. It is the color " +
                color + ". It is " + isEdible + " that it is edible.");
    }

}
