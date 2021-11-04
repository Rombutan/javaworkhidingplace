import java.util.Scanner;
public class test{
    public static void main(String[] args){
        int temp;
	Scanner scan = new Scanner(System.in);  //Instantiate Scanner

        Account joeyacct = new Account(10000, "Joey");
        Account gregacct = new Account(1000, "Greg");  //Give arbritraray cash to random ppl

        System.out.println("How much money to steal from Joey?");  //Ask user how much to steal back
        temp = Integer.parseInt(scan.nextLine());  //parse that ammount
        joeyacct.removeBalance(temp);  //Steal that amount

        System.out.println("How much money to give to Greg?");  //Ask user how much to charitable donate
        temp = Integer.parseInt(scan.nextLine());  //parse that ammount
        gregacct.addBalance(temp); //give that ammount

        System.out.println(joeyacct.getName() + "<- firstacct    secondacct ->" + gregacct.getName()); //print names of our poor slaves

        joeyacct.addBalance(400);

        System.out.println(joeyacct.getName() + "<- firstacct    secondacct ->" + gregacct.getName()); //print names of our poor slaves
    }
}
