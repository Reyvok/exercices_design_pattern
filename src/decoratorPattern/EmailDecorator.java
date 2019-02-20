package decoratorPattern;

public abstract class EmailDecorator implements Email{

    private Email email;

    public EmailDecorator(Email email){
        this.email = email;
    }

    @Override
    public void envoyer(){
        email.envoyer();
    }

}
