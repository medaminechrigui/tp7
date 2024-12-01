public class ResultatOral implements Resultat{
    private String appreciation;
    public ResultatOral(String appreciation) {
        this.appreciation = appreciation;
    }
    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    @Override
    public String toString() {
        return "ResultatOral{" +
                "appreciation='" + appreciation + '\'' +
                '}';
    }

    @Override
    public int compareTo(Resultat r) {
        ResultatOral rp=(ResultatOral) r;
        if (this.appreciation.equals(rp.getAppreciation())){
            return 0;}
        else if (((this.appreciation.equals("A") && (rp.getAppreciation().equals("B") || rp.getAppreciation().equals("C"))) ||(this.appreciation.equals("B") && rp.getAppreciation().equals("C")))) {
            return 1;
        }
        else {
            return -1;
    }}
}
