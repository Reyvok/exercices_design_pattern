package iteratorPattern;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class ArbreBinaireIterator implements Iterator<ArbreBinaire> {

    private ArbreBinaire arbreBinaire;
    private Stack<ArbreBinaire> lifo = new Stack<>();

    public ArbreBinaireIterator(ArbreBinaire arbreBinaire){
        this.arbreBinaire = arbreBinaire;
    }


    @Override
    public boolean hasNext() {
        if(arbreBinaire.getFilsGauche() != null && !arbreBinaire.getFilsGauche().isVisited()) return true;
        if(arbreBinaire.getFilsDroit() != null && !arbreBinaire.getFilsDroit().isVisited()) return true;

        Stack<ArbreBinaire> tempLifo = lifo;
        ArbreBinaire tempArbre = tempLifo.pop();
        while(tempArbre!=null){
            if(tempArbre.getFilsDroit() != null && !tempArbre.getFilsDroit().isVisited()) return true;
            tempArbre = tempLifo.pop();
        }
        return false;
    }

    @Override
    public ArbreBinaire next() {
        if(arbreBinaire.getFilsGauche() != null && !arbreBinaire.getFilsGauche().isVisited()){
            arbreBinaire.setVisited(true);
            lifo.push(arbreBinaire);
            arbreBinaire = arbreBinaire.getFilsGauche();
            return arbreBinaire;
        }
        if(arbreBinaire.getFilsDroit() != null && !arbreBinaire.getFilsDroit().isVisited()){
            arbreBinaire.setVisited(true);
            lifo.push(arbreBinaire);
            arbreBinaire = arbreBinaire.getFilsDroit();
            return arbreBinaire;
        }

        while(!lifo.empty()) {
            arbreBinaire = lifo.pop();
            if(arbreBinaire.getFilsDroit() != null && !arbreBinaire.getFilsDroit().isVisited()){
                lifo.push(arbreBinaire);
                arbreBinaire = arbreBinaire.getFilsDroit();
                return arbreBinaire;
            }
        }
        throw new NoSuchElementException();
    }
}
