public class ResultatPoints implements Resultat{
    private int points;

    public ResultatPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "ResultatPoints{" +
                "points=" + points +
                '}';
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Resultat r) {
        ResultatPoints rp = (ResultatPoints)r;
        if (this.points==rp.getPoints()) {
            return 0;}
        else if (this.points>rp.getPoints()){
            return 1;}
        else{
            return -1;}
    }
}
