import java.util.*;

class Account {
    String Customer_Name;
    long Account_Number;
    String Acc_Type;
    int Balance;

    public Account() {
        Customer_Name = "";
        Account_Number = 0;
        Balance = 0;
        Acc_Type = "";
    }

    void input() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        this.Customer_Name = userinput.nextLine();
        System.out.println("Enter Account No");
        this.Account_Number = userinput.nextInt();
        System.out.println("Enter  Account Type");
        // you need to put an extra scan.nextLine before your string input scanner to consume the extra \n like
        this.Acc_Type = userinput.next();
        System.out.println("Enter Balance");
        this.Balance = userinput.nextInt();

    }

    void display() {
        System.out.println("Customer Name " + Customer_Name);
        System.out.println("Account No " + Account_Number);
        System.out.println("Account Type " + Acc_Type);
        System.out.println("Balance " + Balance);
    }

    public void deposite() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Write The Ammount");
        int userInpt = userinput.nextInt();
        Balance = Balance + userInpt;
        System.out.println("New Balance Is " + Balance);
    }


}

class SavingsAccount extends Account {
    float interest;

    void comp_inter() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter Interest Rate");
        float rate = userinput.nextFloat();
        System.out.println("Enter Time (In Years)");
        float timeInYears = userinput.nextFloat();
        interest = (super.Balance * rate * timeInYears) / 100;
        System.out.println("now your Intrest In Years :" + interest);
    }

    public void withdrawl() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Write The Ammount");
        int userInpt = userinput.nextInt();
        if (Balance >= userInpt) {
            Balance = Balance - userInpt;
            System.out.println("New Balance Is " + Balance);
        } else {
            System.out.println("The amount cannot be withdrawn");
        }

    }

    public void check_Balance() {
        System.out.println("Your Balance Is :" + Balance);
    }

}

class CurrentAccount extends Account {
    int penalty;

    void min_bal() {
        if (super.Balance <= 2000) {
            penalty = 50;
            if (super.Balance > penalty) {
                super.Balance = super.Balance - penalty;
                System.out.println("penality imposed");
            } else if (super.Balance < penalty) {
                System.out.println("penality Would Be cut from next deposite");
            }

        } else {
            System.out.println(" No penality imposed");
        }
    }

    public void withdrawl() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Write The Ammount");
        int userInpt = userinput.nextInt();
        if (Balance >= userInpt) {
            Balance = Balance - userInpt;
            System.out.println("New Balance Is " + Balance);
        } else {
            System.out.println("The amount cannot be withdrawn");
        }

    }

    public void check_Balance() {
        System.out.println("Your Balance Is" + super.Balance);
    }
}

public class Banking {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Welcome To The Banking App");
        boolean _case1 = false;
        boolean _case2 = false;
        do {
            //Incompatible types. Found: 'int', required: 'boolean'
            System.out.println("Please enter 1 For Current Account");
            System.out.println("Please enter 2 For Savings Account");
            int userInpt = userinput.nextInt();
            switch (userInpt) {
                case 1:
                    _case1 = true;
                    System.out.println("Current Account");
                    CurrentAccount obj1 = new CurrentAccount();
                    obj1.input();
                    boolean exit1 = true;
                    while (exit1) {
                        System.out.println("Please enter 1 For Display");
                        System.out.println("Please enter 2 For Deposit");
                        System.out.println("Please enter 3 For Any Pelanty");
                        System.out.println("Please enter 4 For Withdrawl");
                        System.out.println("Please enter 5 For Check Balance");
                        System.out.println("Please enter 6 For Exit");
                        int userInpt2 = userinput.nextInt();
                        switch (userInpt2) {
                            case 1:
                                obj1.display();
                                break;
                            case 2:
                                obj1.deposite();
                                break;
                            case 3:
                                obj1.min_bal();
                                break;
                            case 4:
                                obj1.withdrawl();
                                break;
                            case 5:
                                obj1.check_Balance();
                                break;
                            case 6:
                                exit1 = false;
                                break;
                        }
                    }

                    break;
                case 2:
                    _case2 = true;
                    System.out.println("SavingsAccount");
                    SavingsAccount obj2 = new SavingsAccount();
                    obj2.input();
                    boolean exit = true;
                    while (exit) {
                        System.out.println("Please enter 1 For Display");
                        System.out.println("Please enter 2 For Deposit");
                        System.out.println("Please enter 3 For See Interest");
                        System.out.println("Please enter 4 For Withdrawl");
                        System.out.println("Please enter 5 For Check Balance");
                        System.out.println("Please enter 6 For Exit");
                        int userInpt3 = userinput.nextInt();
                        switch (userInpt3) {
                            case 1:
                                obj2.display();
                                break;
                            case 2:
                                obj2.deposite();
                                break;
                            case 3:
                                obj2.comp_inter();
                                break;
                            case 4:
                                obj2.withdrawl();
                                break;
                            case 5:
                                obj2.check_Balance();
                                break;
                            case 6:
                                exit = false;
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid input Please Try Again");
                    break;
            }


        } while (!(_case1 | _case2));
    }
}
