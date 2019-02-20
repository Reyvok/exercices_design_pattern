package decoratorPattern;

public class EnteteEmail extends EmailDecorator{

    private String entete;

    public EnteteEmail(Email email, String entete){
        super(email);
        this.entete = entete;
    }

    @Override
    public void envoyer(){
        System.out.println(entete);
        super.envoyer();
    }

}
