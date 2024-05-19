import java.util.*;

public class App {
    static HashMap<Integer, Account> accounts = new HashMap<>();
    public static Account VishuAccount;
    static Account KrishAccount;
    static Account MomAccount;
    static Account DadAccount;
    static ChildAccount TejasAccount;
    static String output;
    

    public static void main(String[] args) {
        LoadAccounts();
        PrintBalances();
       

        Scanner no = new Scanner(System.in);

        System.out.println("for transaction, press 1");
        System.out.println("for deposit, press 2");
        System.out.println("for withdraw, press 3");

        int process = no.nextInt();
        
        switch (process) {
            case 1:
            do  {
        
                System.out.println("Enter Payer AccountId:");
                int payerAccountId = no.nextInt();
        
                System.out.println("Enter Payee AccountId:");
                int payeeAccountId = no.nextInt();
        
                System.out.println("Enter Amount:");
                double amount = no.nextDouble();
        
                Account payerAccount = accounts.get(payerAccountId);
                Account payeeAccount = accounts.get(payeeAccountId);
               
        
            payerAccount.TransferFund(payeeAccount, amount);
        
            System.out.println("final Balances");
            PrintBalances();
        
            System.out.println("want to transfer again?");
               output  = no.next();
              }
               
               while (output.equals("yes"));

                break;

            case 2:
            System.out.println("Enter your AccountId:");
            int userAccountId = no.nextInt();
            
            System.out.println("Enter Amount:");
            double amount = no.nextDouble();
               
                Account userAccount = accounts.get(userAccountId);
                userAccount.Deposit(amount);

                System.out.println("final Balances");
                PrintBalances();

            case 3:
            System.out.println("Enter your AccountId:");
            int yourAccountId = no.nextInt();
            
            System.out.println("Enter Amount:");
            double Amount = no.nextDouble();
               
                Account yourAccount = accounts.get(yourAccountId);
                yourAccount.WithDraw(Amount);

                System.out.println("final Balances");
                PrintBalances();


            default: System.out.println("Enter 1,2 or 3");
                break;
        }

      
       System.out.println("thanks, visit again!");
    }

    static void PrintBalances() {
        for (Account acc : accounts.values()) {            
            acc.PrintBalance();
          }
    }

    static void LoadAccounts() {
        VishuAccount = new Account(6, "Vishu", 5000.00);
        KrishAccount = new Account(27, "Kshitij", 2000.00);
        MomAccount = new Account(208, "Mom", 3000);
        DadAccount = new Account(18991, "Dad", 200000);
        TejasAccount = new ChildAccount(7, "Tejas", 10000, DadAccount.AccountId);

        accounts.put(6, VishuAccount);
        accounts.put(27, KrishAccount);
        accounts.put(18991, DadAccount);
        accounts.put(208, MomAccount);
       accounts.put(7, TejasAccount);
    }
   
}
