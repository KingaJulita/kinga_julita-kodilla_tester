public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1200,2018);
        System.out.println("notebook.weight: " + notebook.weight + "notebook.price:" + notebook.price + "notebook.year:" + notebook.year );
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000,5000, 2023);
        System.out.println( "heavyNotebook.weight:" + heavyNotebook.weight  + "heavyNotebook.price:" + heavyNotebook.price  + "heavyNotebook.year:" + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1200,500, 2003);
        System.out.println("oldNotebook.weight:" +oldNotebook.weight +  "oldNotebook.price:" + oldNotebook.price  + "oldNotebook.year:" + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
    }
}