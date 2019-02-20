package decoratorPattern;

public class SimpleEmail implements Email{

    private String texte;

    public SimpleEmail(String texte){
        this.texte = texte;
    }

    @Override
    public void envoyer() {
        System.out.println(texte);
    }

}
