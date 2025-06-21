import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        int response;

        do{
            System.out.println("Menu");
            System.out.println("1. Dodaj Kontakt");
            System.out.println("2. Pokaż wszystkie Kontakty");
            System.out.println("3. Wyszukaj Kontakt");
            System.out.println("4. Usuń Kontakt");
            System.out.println("5. Wyjdź");
            response = scanner.nextInt();
            scanner.nextLine();

        }while(response>5 || response<1);
        switch (response){
            case 1 -> addKontakt(scanner);
            case 2 -> showKontakty();
            case 3 -> searchKontakty(scanner);
            case 4 -> deleteKontakt(scanner);
            case 5 -> exit();
        }
        scanner.close();
    }
    public static void addKontakt(Scanner scanner){
        System.out.println("Podaj Imie: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj Nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj Numer: ");
        String numer = scanner.nextLine();

        Kontakt kontaktAdd= new Kontakt(imie,nazwisko,numer);
        GlobalData.kontakty.add(kontaktAdd);

        menu();
    }
    public static void showKontakty(){
        for(Kontakt k : GlobalData.kontakty){
            System.out.println(k);
        }
        menu();
    }
    public static void searchKontakty(Scanner scanner) {
        System.out.println("Po czym wyszukać: ");
        System.out.println("1. Imię");
        System.out.println("2. Nazwisko");
        System.out.println("3. Numer");

        int input = scanner.nextInt();
        scanner.nextLine(); // czyści \n

        boolean found = false;

        switch (input) {
            case 1 -> {
                System.out.print("Podaj imię: ");
                String inputImie = scanner.nextLine();
                for (Kontakt k : GlobalData.kontakty) {
                    if (k.getImie().equalsIgnoreCase(inputImie)) {
                        System.out.println(k);
                        found = true;
                    }
                }
            }
            case 2 -> {
                System.out.print("Podaj nazwisko: ");
                String inputNazwisko = scanner.nextLine();
                for (Kontakt k : GlobalData.kontakty) {
                    if (k.getNazwisko().equalsIgnoreCase(inputNazwisko)) {
                        System.out.println(k);
                        found = true;
                    }
                }
            }
            case 3 -> {
                System.out.print("Podaj numer: ");
                String inputNumer = scanner.nextLine();
                for (Kontakt k : GlobalData.kontakty) {
                    if (k.getNumerTelefonu().equals(inputNumer)) {
                        System.out.println(k);
                        found = true;
                    }
                }
            }
            default -> {
                System.out.println("Nieprawidłowa opcja.");
            }
        }

        if (!found) {
            System.out.println("Nie znaleziono kontaktu.");
        }

        menu();
    }
    public static void deleteKontakt(Scanner scanner){
        System.out.println("Podaj Imie: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj Nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj Numer: ");
        String numer = scanner.nextLine();

        boolean found = false;
        for(int i = 0; i<GlobalData.kontakty.size();i++){
            Kontakt k = GlobalData.kontakty.get(i);
            if (k.toString().equals(imie+" "+nazwisko+" "+numer)){
                GlobalData.kontakty.remove(i);
                System.out.println("Kontakt usunięty");
                found=true;
                break;
            }
        }
        if(!found) { System.out.println("Nie znaleziono");}
        menu();
    }
    public static void exit(){
    }
}
