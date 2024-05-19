import java.util.* ;
//Inheritance 
public class ChildAccount extends Account {

    // int AccountId;
    // String AccountName ;
    // double Balance ;
    int ParentAccountId ; 

    public ChildAccount(int AccountId,String AccountName,double Balance,int ParentAccountId){
       
        this.AccountId = AccountId ;
        this.AccountName = AccountName ;
        this.Balance = Balance ;
        this.ParentAccountId = ParentAccountId;      

     }

     public void TransferFund(Account payeeAccount,double amount)
    {   
            System.out.println("This is a child account, hence enter a password to transfer amounts");
            Scanner x = new Scanner(System.in);
            int password = x.nextInt();

            if (password != this.ParentAccountId) {
                System.out.println("password is incorrect. Transfer failed!");
                return;
            }

            super.TransferFund(payeeAccount, amount);
        
    //     if(this.Balance < amount) {
    //         System.out.println("insuffient balance");
    //         return ;
    //      } 

    //      if(this.AccountId==payeeAccount.AccountId) {
    //         System.out.println("Self Transfer Scam!");
    //             return ;
    //     }

    // this.Balance = this.Balance-amount ;
    // payeeAccount.Balance = payeeAccount.Balance + amount ;    

    }

    // public void WithDraw(double amount) {

    // this.Balance = this.Balance - amount;  

    // }

    // public void Deposit(double amount) {

    //     this.Balance = this.Balance + amount;

    // }

}
