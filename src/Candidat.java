public class Candidat {
    private int id ;
    private String nom ;
    private Resultat resultat ;
    public Candidat(int id, String nom ) throws IllegalArgumentException{
        this.id=id ;
        this.nom = nom ;
        resultat=null ;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Resultat getResultat() {
        return resultat;
    }
    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", resultat=" + resultat +
                '}';
    }
}
