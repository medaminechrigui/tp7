public class IllegalUpdateException extends Exception{
    private String msg;
    public IllegalUpdateException(String msg){
        this.msg=msg;
    }
    public String getMsg(){
        return msg;
    }
}
