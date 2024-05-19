import java.util.* ;
public class Account {
   
    //Data/ Members
     // Data
        //1. Account
    int AccountId;
    String AccountName ;
    double Balance ;
    static int AccountCount =0;

    //Bevavior
     // Behavior
         // Fund Transfer  
          public Account(int AccountId,String AccountName,double Balance){
            this.AccountId = AccountId ;
            this.AccountName = AccountName ;
            this.Balance = Balance ;

         }

         
    public Account(){
            
        }
        
    
    public void TransferFund(Account payeeAccount,double amount)
    {

        
        if(this.Balance < amount) {
            System.out.println("insuffient balance");
            return ;
         } 

         if(this.AccountId==payeeAccount.AccountId) {
            System.out.println("Self Transfer Scam!");
                return ;
        }

    this.Balance = this.Balance-amount ;
    payeeAccount.Balance = payeeAccount.Balance + amount ;

    

    }
    public void WithDraw(double amount) {

    this.Balance = this.Balance - amount;

   

    }

    public void Deposit(double amount) {

        this.Balance = this.Balance + amount;
    }
    public void PrintBalance() {

        System.out.println(this.AccountName + ":" + this.Balance);
    }
    
}


      


    
