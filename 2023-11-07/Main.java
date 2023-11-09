import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ciao da Main");

        List<Vendita> vendite = new ArrayList<Vendita>();

        Scanner sc = new Scanner(System.in);
        Giocattolo g1 = new Giocattolo("Cane", 10.0, 2);
        Giocattolo g2 = new Giocattolo("Cavallo", 15.0, 4);
        Giocattolo g3 = new Giocattolo("Gatto", 5.0, 3);

        List<Giocattolo> giocattoli = new ArrayList<Giocattolo>();
        giocattoli.add(g1);
        giocattoli.add(g2);
        giocattoli.add(g3);

        System.out.print("Inserisci il nome: ");
        String nome = sc.nextLine();
        System.out.print("Inserisci l'email: ");
        String email = sc.nextLine();
        System.out.print("Inserisci il conto: ");
        double conto = sc.nextDouble();

        Cliente c1 = new Cliente(nome, email, conto);

        if (c1.checkAdmin()) {
            System.out.println(
                    "1. Visualizza giocattoli\n2.Acquista giocattolo\n3. Aggiungi giocattolo\n4. Rimuovi giocattolo\n5. Aggiorna saldo\n6. Esci");
            System.out.print("--> ");
            int scelta = sc.nextInt();

            while (scelta != 6) {
                switch (scelta) {
                    case 1:
                        for (Giocattolo i : giocattoli) {
                            System.out.println(i);
                        }
                        break;
                    case 2:
                        System.out.print("Seleziona il giocattolo: ");
                        String nomeG = sc.nextLine();
                        for (Giocattolo i : giocattoli) {
                            if (i.getNome().equals(nomeG)) {
                                vendite = RegistroVendite.vendi(c1, i, vendite);
                                System.out.println("Acquisto effettuato");
                                break;
                            }
                        }
                        System.out.println("Gioco non esistente");
                        break;
                    case 3:
                        System.out.print("Inserisci il nome: ");
                        String nomeGio = sc.nextLine();
                        System.out.print("Inserisci il prezzo: ");
                        double prezzo = sc.nextDouble();
                        System.out.print("Inserisci l'eta consigliata: ");
                        int eta = sc.nextInt();
                        giocattoli.add(new Giocattolo(nomeGio, prezzo, eta));
                        break;
                    case 4:
                        System.out.print("Seleziona il giocattolo da rimuovere: ");
                        String nomeGioR = sc.nextLine();
                        for (Giocattolo i : giocattoli) {
                            if (i.getNome().equals(nomeGioR)) {
                                giocattoli.remove(i);
                                break;
                            }
                        }
                        System.out.println("Giocattolo non esistente");
                        break;
                    case 5:
                        System.out.print("Inserisci il nuovo conto: ");
                        conto = sc.nextDouble();
                        c1.aggiornaConto(conto);
                        break;
                    case 6:
                        sc.close();
                        return;
                    default:
                        System.out.println("Scelta non valida");
                }
                System.out.println("Vuoi continuare? Si / No");
                System.out.print("--> ");
                char continua = sc.next().charAt(0);
                if (continua == 'n') {
                    sc.close();
                    return;
                }
                System.out.println(
                        "1. Visualizza giocattoli\n2.Acquista giocattolo\n3. Aggiungi giocattolo\n4. Rimuovi giocattolo\n5. Aggiorna saldo\n6. Esci");
                System.out.print("--> ");
                scelta = sc.nextInt();
            }
        } else {
            System.out.println("1. Visualizza giocattoli\n2.Acquista giocattolo\n3. Aggiorna saldo\n4. Esci");
            System.out.print("--> ");
            int scelta = sc.nextInt();

            while (scelta != 4) {
                switch (scelta) {
                    case 1:
                        for (Giocattolo i : giocattoli) {
                            System.out.println(i);
                        }
                        break;
                    case 2:
                        System.out.print("Seleziona il giocattolo: ");
                        String nomeG = sc.nextLine();
                        for (Giocattolo i : giocattoli) {
                            if (i.getNome().equals(nomeG)) {
                                vendite = RegistroVendite.vendi(c1, i, vendite);
                                System.out.println("Acquisto effettuato");
                                break;
                            }
                        }
                        System.out.println("Gioco non esistente");
                        break;
                    case 3:
                        System.out.print("Inserisci il nuovo conto: ");
                        conto = sc.nextDouble();
                        c1.aggiornaConto(conto);
                        break;
                    case 4:
                        sc.close();
                        return;
                    default:
                        System.out.println("Scelta non valida");
                }
                System.out.println("Vuoi continuare? Si / No");
                System.out.print("--> ");
                char continua = sc.next().charAt(0);
                if (continua == 'n') {
                    sc.close();
                    return;
                }
                System.out.println("1. Visualizza giocattoli\n2.Acquista giocattolo\n3. Aggiorna saldo\n4. Esci");
                System.out.print("--> ");
                scelta = sc.nextInt();
            }
        }

        sc.close();
    }
}