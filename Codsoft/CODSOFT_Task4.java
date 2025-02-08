import java.util.*;
public class CODSOFT_Task4 {
    BankAcn acn = new BankAcn();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CODSOFT_Task4 atm = new CODSOFT_Task4();
        System.out.println("-------------------------WELCOME-------------------------");
        char i = 'y';
        while(i != 'n'){
            System.out.println("1. WITHDRAW\n2. DEPOSIT\n3. CHECK ACCOUNT BALANCE\n4. EXIT");
            System.out.print("PRESS THE NUMBER TO AVAIL THE DESIRED FACILITY: ");
            int op = in.nextInt();
            double amount;
            switch (op){
                case 1:{
                    System.out.print("Enter the amount you need to withdraw:");
                    amount = in.nextDouble();
                    atm.withdraw(amount);
                    break;
                }
                case 2:{
                    System.out.print("Enter the amount you need to deposit:");
                    amount = in.nextDouble();
                    atm.deposit(amount);
                    break;
                }
                case 3:{
                    atm.checkbalance();
                    break;
                }
                case 4:
                    return;
                default:
                    System.out.println("INVALID OPTION...!!\nEnter a correct option");
            }
            System.out.print("Do you want to repeat any facility (y/n): ");
            i = in.next().charAt(0);
        }
    }

    private void withdraw(double amount) {
        double tot = acn.getUserbalance();
        double bal;
        if(tot == 0)
            System.out.println("ZERO BALANCE...!!\nWITHDRAWAL DECLINED..!!");
        else if(tot > 0){
            bal = tot - amount;
            if(bal == 0){
                acn.setUserbalance(bal);
                System.out.println("SUCCESSFULL WITHDRAWAL OF Rs. " + amount);
                System.out.println("MINIMUM LIMIT REACHED...!!");
            }
            else if(bal < 0)
                System.out.println("INSUFFICIENT BALANCE..!!\nWITHDRAWAL DECLINED..!!");
            else{
                acn.setUserbalance(bal);
                System.out.println("SUCCESSFULL WITHDRAWAL OF Rs. " + amount);
            }
        }
    }

    private void deposit(double amount) {
        double amnt = acn.getUserbalance();
        acn.setUserbalance(amount+amnt);
        System.out.println("SUCCESSFULL DEPOSIT OF Rs. " + amount);
    }

    private void checkbalance() {
        double amount = acn.getUserbalance();
        if(amount == 0){
            System.out.println("YOUR CURRENT BANK BALANCE IS Rs. " + amount);
            System.out.println("RECHARGE IT..!!");
        }
        else
            System.out.println("YOUR CURRENT BANK BALANCE IS Rs. " + amount);
    }
}



class BankAcn {
    public double getUserbalance() {
        return userbalance;
    }

    public void setUserbalance(double userbalance) {
        this.userbalance = userbalance;
    }
    
    private double userbalance = 0;
}


