public class Cocktail {

    private String name;
    private String mainIngredient;
    private int volumeInMl;
    private boolean isAlcoholic;
    private double price;

    public Cocktail(String name, String mainIngredient, int volumeInMl, boolean isAlcoholic, double price) {
        this.name = name;
        this.mainIngredient = mainIngredient;
        this.volumeInMl = volumeInMl;
        this.isAlcoholic = isAlcoholic;
        this.price = price;
    }

    public static void displayInfo(Cocktail cocktail) {
        System.out.println(cocktail.getName());
        System.out.println(cocktail.getMainIngredient() + " " + cocktail.getVolumeInMl() + "ml");
        if (!cocktail.isAlcoholic()) {
            System.out.println("Non alchoholic");
        }
        System.out.println(cocktail.getPrice() + "kr");
    }

    public void customizeCocktail(int volumeChange) {
        this.setVolumeInMl(volumeChange);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public void setVolumeInMl(int volumeInMl) {
        this.volumeInMl = volumeInMl;
    }

    public void setAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public int getVolumeInMl() {
        return volumeInMl;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Cocktail whiskySour = new Cocktail("Whisky Sour", "Whisky", 50, true, 100000);

        displayInfo(whiskySour);
    }
}
