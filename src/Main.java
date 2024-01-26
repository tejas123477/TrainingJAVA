import com.hexaware.Logger.DemoLogger;
import com.hexaware.dao.ServiceProviderImpl;
import com.hexaware.dto.Bank;
import com.hexaware.dto.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        ArrayList<BankAccount>mylist=new ArrayList<>();

        DemoLogger obj = new DemoLogger();
        obj.makeSomeLog();
        LogManager lgmngr = LogManager.getLogManager();
        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // Getting the global application level logger
        // from the Java Log Manager
        log.log(Level.INFO, "This is a log message");


        BankAccount bankAccount1=new BankAccount(1111,"ram","savings",25000);
        BankAccount bankAccount2=new BankAccount(1112,"lakshman","current",20000);
        BankAccount bankAccount3=new BankAccount(1113,"krishna","savings",10000);

        mylist.add(bankAccount1);
        mylist.add(bankAccount2);
        mylist.add(bankAccount3);

        Bank myBank = new Bank("ICICI", mylist);
        ServiceProviderImpl myServiceObj = new ServiceProviderImpl(myBank);
        System.out.println("Balance of account 1111 : " + myServiceObj.checkBalance(1111));
        System.out.println("Status of deposit: " + myServiceObj.deposit(1111, 5000.50));
        System.out.println("Balance of account 1111 : " + myServiceObj.checkBalance(1111));
        System.out.println("Status of deposit: " + myServiceObj.withdraw(1112, 5000.50));
        System.out.println("Balance of account 1112: " + myServiceObj.checkBalance(1112));

        System.out.println("new account status " + myServiceObj.createAccount(new BankAccount(1212,"zaheer", "Savings", 10000.0)));

        System.out.println(myBank);

        System.out.println("remove account status " + myServiceObj.removeAccount(1111));

        System.out.println(myBank);
//    } catch (AccountNumberInvalidException e) {
//        e.printStackTrace();
//    } catch (InsufficientFundsException e) {
//        e.printStackTrace();
//    } catch (NegativeAmountException e) {
//        e.printStackTrace();
//    }
        System.out.println("Hello world!");
    }
}