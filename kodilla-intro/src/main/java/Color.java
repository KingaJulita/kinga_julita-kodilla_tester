public class Color {
    public static void main(String[] args) {
        String userColor = UserDialogs.getUserColor();


        switch (userColor) {
            case "B" -> System.out.println("Burgunt");
            case "C" -> System.out.println("Czarny");
            case "H" -> System.out.println("Hebanowy");
            case "P" -> System.out.println("Popielaty");
            default -> System.out.println("Nieprawidłowy kolor");
        }
    }
}