public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook (int weight,int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600){
            System.out.println("This notebook is cheap.");
        } else if (this.price > 600 && this.price < 1500) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 700){
            System.out.println("It is light.");
        } else if (this.weight > 700 && this.weight < 1300) {
            System.out.println("It's not too heavy.");
        } else {
            System.out.println("It is very heavy.");
        }
    }
    public void checkYear() {
        if (this.year < 2012) {
            System.out.println("This laptop is so old.");
        } else if (this.price > 1000 && this.year < 2020) {
            System.out.println("This is a good opportunity.");
        } else {
            System.out.println("It must be a gaming laptop.");
        }
    }
}