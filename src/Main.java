import java.util.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println("-------------------------- ES1 -----------------------------");
//
//        Set<String> addStrings = new HashSet<>();
//        List<String> duplicateString = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Benvenuto utente, indica il numero di parole che vuoi aggiungere");
//        System.out.println("Attenzione , se inserisci parole duplicate verranno inserite in un' altra lista");
//        int number = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < number; i++) {
//            System.out.println("parola da aggiungere");
//            String word = scanner.nextLine();
//
//            if (addStrings.add(word)) {
//                addStrings.add(word);
//
//            } else {
//                duplicateString.add(word);
//            }
//
//
//        }
//        System.out.println(" questa è la lista della parole che hai aggiunto");
//        System.out.println(addStrings);
//
//        if (duplicateString.isEmpty()) {
//            System.out.println("non ci sono parole duplicate");
//        } else {
//            System.out.println("queste sono le parole duplicate");
//            System.out.println(duplicateString);
//
//        }
//
//
//        System.out.println("queste sono il numero di parole aggiunte");
//        System.out.println(addStrings.size());
//
//        System.out.println("questo è l'elenco delle parole distinte");
//        for (String word : addStrings) {
//            System.out.println(word);
//        }
//
//        scanner.close();

        System.out.println("-------------------------- ES2 -----------------------------");

        System.out.println("-------------------------- PARTE 1 -----------------------------");

        List<Integer> firstList = new ArrayList<>();

        int number2 = 5;

        for (int i = 0; i < number2; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(0, 100);
            firstList.add(randomNumber);
            Collections.sort(firstList);

        }

        System.out.println("lista in ordine crescente");
        System.out.println(firstList);

        System.out.println("-------------------------- PARTE 2 -----------------------------");

        Main.secondFunction(firstList);

        System.out.println("-------------------------- PARTE 3 -----------------------------");
        
        Main.thirdFunction(firstList, false);


    }

    public static void secondFunction(List<Integer> lista) {
        List<Integer> secondList = new ArrayList<>();
        secondList.addAll(lista);
        secondList.addAll(lista.reversed());

        System.out.println("unione delle due liste speculari");
        System.out.println(secondList);

    }

    public static void thirdFunction(List<Integer> lista, boolean trueOrFalse) {
        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (trueOrFalse && num % 2 == 1) {
                iterator.remove();


            } else if (!trueOrFalse && num % 2 == 0) {
                iterator.remove();


            }
        }
        System.out.println("cambiando il booleano abbiamo un risultato differente");
        System.out.println(lista);

    }


}


