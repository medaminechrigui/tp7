public class Main {
    public static void main(String[] args) {
        Candidat c1=new Candidat(1,"mohamed");
        Candidat c2=new Candidat(2,"adem");
        Candidat c3=new Candidat(3,"salma");
        Epreuve ep=new Epreuve("oral",4);
        Resultat r=new ResultatPoints(10);
        Resultat r1=new ResultatPoints(16);
        Resultat r2=new ResultatPoints(9);
        ep.ajoutCandidat(c1);
        ep.ajoutCandidat(c2);
        ep.ajoutCandidat(c3);
        ep.terminer();
        try{
            ep.fixResultat(3,r);
        } catch (IllegalUpdateException e) {
            System.out.println(e.getMsg());
        }
        try{
            ep.fixResultat(2,r2);
        } catch (IllegalUpdateException e) {
            System.out.println(e.getMsg());
        }
        try{
            ep.fixResultat(1,r1);
        } catch (IllegalUpdateException e) {
            System.out.println(e.getMsg());
        }
        System.out.println(ep.getRecord());
        System.out.println(ep.getVinqueur());
        System.out.println(ep.getResultat(3));
    }
}