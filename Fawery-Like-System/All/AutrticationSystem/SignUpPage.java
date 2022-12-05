package All.AutrticationSystem;
import All.UserThings.Customer;
import All.StorageSystem.Storage;

import java.util.Scanner;
public class SignUpPage extends Authentication {
    Scanner strVal = new Scanner(System.in) ;

    SignUpPage(Storage D) {
        super(D);

    }
    public boolean check(String U,String P){
        if (D.getEmails().containsKey(U)){
                return false;
        }
        else {
            return true;
        }
    }
    public Customer Signin(String Email , String name, String passwords){

        String UserEmail = Email;
        if (check(Email,passwords)){
            Customer temp2 = new Customer();//we will set now Email, name, passwords
            temp2.setEmail(Email);
            temp2.setName(name);
            temp2.setPasswords(passwords);
            D.addUser(temp2);
            return temp2;
        }
        else
        {
            while (!check(UserEmail,passwords)) {
                System.out.println("email was exist please enter another email ");
                UserEmail = strVal.nextLine();
            }
            Customer temp2 = new Customer();//we will set now UserEmail, name, passwords
            temp2.setEmail(UserEmail);
            temp2.setName(name);
            temp2.setPasswords(passwords);
            D.addUser(temp2);
            return temp2;
        }
    }
}
