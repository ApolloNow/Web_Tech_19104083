import java.util.*;

class Customer {
    int age; 
    String name, accountNumber, address;    
       
    public Customer(String name, String accountNumber, String address, int age) {        
        this.name = name;        
        this.address = address;        
        this.accountNumber = accountNumber;        
        this.age = age;   
     }
}
class Account{
    String accountType, branch;
    public Account(String accountType, String branch) {        
        this.accountType = accountType;        
        this.branch = branch;    
    }
}
class RBI {  
    int minBal, maxWithdrawal;
    double minInterestRate;    
    public RBI() {
        minBal = 100;        
        maxWithdrawal = 1000000;        
        minInterestRate = 4.0;    
    }    
    public void set_minRate(double minInterestRate) {        
        if (minInterestRate >= this.minInterestRate) {            
            this.minInterestRate = minInterestRate;        
        } 
        else {            
            System.out.println("As per RBI guidelines minimum interest rate should be "+this.minInterestRate);        
        }    
    }    
    public void set_minBal(int minBal) {        
        if (minBal < this.minBal) {            
            this.minBal = minBal;        
        } else {            
            System.out.println("As per RBI guidelines minimum balance should be "+this.minBal);        
        }    
    }
    public void set_max_wl(int maxWithdrawal) {        
        if (maxWithdrawal > this.maxWithdrawal) {            
            this.maxWithdrawal = maxWithdrawal;        
        } else {            
            System.out.println("As per RBI guidelines maximum withdrawal cant be over "+this.maxWithdrawal);        
        }    
    }    
    public void printInfo() {    
        System.out.println("\nUpdated Minimum Balance: " + minBal);        
        System.out.println("Updated Minimum Interest Rate: " + minInterestRate);        
        System.out.println("Updated Maximum Withraw Limit: " + minBal);    
    }
}


class ICICI extends RBI {  
    public ICICI(int minBal, int maxWithdrawal, double minInterestRate) {        
        set_minRate(minInterestRate);        
        set_minBal(minBal);        
        set_max_wl(maxWithdrawal);    
    }    
    public void printInfo() {        
        System.out.println("\nFinal Minimum Balance: " + minBal);        
        System.out.println("Final Minimum Interest Rate: " + minInterestRate);        
        System.out.println("Final Maximum Withraw Limit: " + minBal);    
    }
}

class SBI extends RBI {
    public SBI(int minBal, int maxWithdrawal, double minInterestRate) {        
        set_minRate(minInterestRate);        
        set_minBal(minBal);        
        set_max_wl(maxWithdrawal);    
    }    
    public void printInfo() {        
        System.out.println("\nFinal Minimum Balance: " + minBal);        
        System.out.println("Final Minimum Interest Rate: " + minInterestRate);        
        System.out.println("Final Maximum Withraw Limit: " + minBal);    
    }
}


class PNB extends RBI {
    public PNB(int minBal, int maxWithdrawal, double minInterestRate) {        
        set_minRate(minInterestRate);        
        set_minBal(minBal);        
        set_max_wl(maxWithdrawal);    
    }    public void printInfo() {        
        System.out.println("\nFinal Minimum Balance: " + minBal);        
        System.out.println("Final Minimum Interest Rate: " + minInterestRate);        
        System.out.println("Final Maximum Withraw Limit: " + minBal);    
    }
}
public class Q2 {   
    public static void main(String args[]) {        
        Scanner sc = new Scanner(System.in);
        int x;        
        System.out.println("Enter your bank");        
        System.out.println("1: SBI\n2: ICICI\n3: PNB");        
        x = sc.nextInt();        
              
        System.out.println("Enter minimum balance, maximum withdraw limit and minimum Interest rate");        
        int a, b;        
        double c;        
        a = sc.nextInt();        
        b = sc.nextInt();        
        c = sc.nextDouble();        
        RBI bank;
        sc.close();        
        switch (x) {            
            case 1:                
                bank = new SBI(a, b, c);                
                bank.printInfo();                
                break;            
            case 2:                
                bank = new ICICI(a, b, c);                
                bank.printInfo();                
                break;            
            case 3:               
                bank = new PNB(a, b, c);                
                bank.printInfo();               
                break;            
            default:                
                System.out.println("Invalid Input");        
        }    
    }
}
