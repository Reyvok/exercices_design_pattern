package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Email email = new SimpleEmail("Simple email");
        email.envoyer();

        email = new SignatureEmail(new SimpleEmail("Mail avec signature"), "Timothé");
        email.envoyer();

        email = new EnteteEmail(email, "Ajout de l'entete");
        email.envoyer();
    }
}
