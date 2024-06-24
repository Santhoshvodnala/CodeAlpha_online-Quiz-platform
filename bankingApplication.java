import java.util.Scanner;
public class bankingApplication{
   
       private static double balance=0;
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do{
        System.out.println("1.Deposit ");
        System.out.println("2.Withdraw ");
        System.out.println("3.Check balance : ");
        System.out.println("4.Exit");
        System.out.println("Enter your choice : ");
        choice=sc.nextInt();
   
        switch (choice) {
            case 1:
               Deposit();
                break;
            case 2:
            Withdraw();
            break;
            case 3:
            checkBalance();
            break;
            case 4:
            System.out.println("Exiting operation");
            break;
            default:System.out.println("You choose invalid option ");
                break;
        }
        
    }while(choice!=4);
}
private static void Deposit(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter amount to Deposit : ");
    double amount=scan.nextDouble();
    balance+=amount;
    System.out.println("Amount successfully Deposit..Current balance:$" +balance );
  }
   
  private static void Withdraw(){
    System.out.println("Enter amount to withdraw : ");
    Scanner scan=new Scanner(System.in);
    double amount=scan.nextDouble();

    if(balance < amount){
        System.out.println("Insufficent balance!!!");
    }
    else{
        balance-=amount;
        System.out.println("Amount Successfully withdraw..Current balance: $"+balance);
    }
}
 private static void checkBalance(){
    System.out.println("Current balance : $"+balance);
 }


}