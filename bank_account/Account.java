public class Account{
    private int balance = 0;
    private String name = "Jane Doe";
    public Account(int newbalance, String newname){
        if (newbalance < 0){return;}
        balance = newbalance;
        name = newname;
    }

    public void removeBalance(int delta){
        if (delta < 0 || balance-delta < 0){return;}
        balance = balance - delta;
    }
    public void addBalance(int delta){
        if(delta < 0){return;}
        balance = balance+delta;
    }

    public void setName(String newname){
        name = newname;
    }
    public int getBalance(){
        return(balance);

    }
    public String getName(){
        return(name);
    }
}
