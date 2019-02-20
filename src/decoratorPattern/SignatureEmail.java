package decoratorPattern;

public class SignatureEmail extends EmailDecorator{

    private String signature;

    public SignatureEmail(Email email, String signature){
        super(email);
        this.signature = signature;
    }

    @Override
    public void envoyer(){
        super.envoyer();
        System.out.println(signature);
    }

}
