public class Epreuve {
    private String denomination;
    private int nbmax;
    private int nbef=0;
    private boolean etat;
    private Candidat[] tab;
    public Epreuve(String denomination, int nbmax ){
        this.denomination = denomination;
        this.nbmax = nbmax;
        this.tab = new Candidat[nbmax];
    }
    @Override
    public String toString() {
        return "denomination='" + denomination + '\'' +
                " etat=" + etat ;
    }
    public void ajoutCandidat(Candidat c){
        if (nbef<nbmax){
            this.tab[nbef]=c;
            nbef++;
        }
    }
    public void terminer(){
        this.etat=true;
    }
    public boolean estTerminee(){
        return this.etat;
    }
    public Resultat getRecord(){
        Resultat x=tab[0].getResultat();
        for (int i = 1; i < nbef; i++) {
            if (tab[i].getResultat() instanceof ResultatOral){
                if (((ResultatOral)tab[i].getResultat()).compareTo(x)==1){
                    x=tab[i].getResultat();
                }
            }else if(tab[i].getResultat() instanceof ResultatPoints){
                if (((ResultatPoints)tab[i].getResultat()).compareTo(x)==1){
                    x=tab[i].getResultat();
                }
            }
        }
        return x;
    }
    public Candidat getVinqueur(){
        if(estTerminee()){
            for (int i = 0; i <nbef ; i++) {
                if(tab[i].getResultat().compareTo(getRecord())==0){
                    return tab[i];
                }
            }
        }
        return null;
    }
    public void fixResultat(int id ,Resultat r) throws IllegalUpdateException{
        int i;
        for ( i = 0; i < nbef ; i++) {
            if(tab[i].getId()==id){
                tab[i].setResultat(r);
                break;
            }
        }if (i==nbef){
            throw new IllegalUpdateException("IllegalUpdateException");
        }
    }
    public Resultat getResultat(int id){
        for (int i = 0; i <nbef ; i++) {
            if(tab[i].getId()==id){
                return tab[i].getResultat();
            }
        }
        return null;
    }
}
