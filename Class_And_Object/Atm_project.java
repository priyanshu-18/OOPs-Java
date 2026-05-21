import java.util.Scanner;

class Atm{
    int PIN =0000;
    int Balance=5000;

    Atm(){
       checkpin(); 
    }

    public void checkpin(){
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if(enterPin==PIN){
            menu();
        }else{
            System.out.println("Invalid Pin ");
            checkpin();
        }
    }

    public void menu(){

        System.out.println(" Enter Your Balance ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            CheckBalance();
        }else if(opt==2){
            WithdrawMoney();
        }else if(opt==3){
            DepositMoney();
        }else if(opt==4){
            Exit();
        }else{
            System.out.println("Enter a valid choice");
        }

    }

    public void CheckBalance(){
        System.out.println("Your Account Balance is "+Balance);
        menu();
    }
    public void WithdrawMoney(){
        Scanner sc = new Scanner(System.in);
        int Withdraw= sc.nextInt();
        if(Withdraw<=Balance){
        Balance = Balance - Withdraw;
        System.out.println("Balance withdrawed "+Withdraw); 
    }else{
        System.out.println("Insufficient Funds ");
    }
    menu();
    }

    public void DepositMoney(){
        Scanner sc = new Scanner(System.in);
        int deposit = sc.nextInt();
        Balance += deposit;
        System.out.println("Deposited to the Bank");
        menu();
    }
    
    public void Exit(){
        return;
    }

}

public class Atm_project {

    public static void main(String[] args) {
        
        Atm obj = new Atm();
        
    }
}
