package iteratorPattern;

public class Main {
    public static void main(String[] args) {
        ArbreBinaire arbre = new ArbreBinaire("1",
                new ArbreBinaire("2",
                        new ArbreBinaire("4",
                                new ArbreBinaire("7")),
                        new ArbreBinaire("5")),
                new ArbreBinaire("3",
                        new ArbreBinaire("6")));

        for(ArbreBinaire a : arbre){
            System.out.println(a.getEtiquette());
        }
    }
}
