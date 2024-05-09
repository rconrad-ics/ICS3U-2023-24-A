package Objects;

public class Student {
    private String name; //attributes - variables that are used define the state of the object
    private int age;
    private double gpa;

    //Constructor to initialize the values of the attributes
    public Student(String studentName, int studentAge, double studentGPA){
        //initializing the name, age and gpa with the provided values
        name = studentName;
        age = studentAge;
        gpa = studentGPA;
    } 

    //Method stub to print student information

    //Functions are the behaviour of the class - what the object can do
    public void printStudentInfo(){
        //Implement the code to print the student name, age and gpa
    }

    //Method to check if student is eligible for a scholarship
    public boolean isScholarshipEligible(){
        //Implement code the check if gpa is high enough for scholarship
        return false;
    }
    
public class BankAccount{
    private double accountBalance;
    private double interestRate;
    private String accountHolder;
    private String password;
    private int accountNumber;

    //constructor to initialize attributes
    public BankAccount(String holderName, String holderPass, int accountNum){
        //intitalize variables
        accountBalance =0;
        interestRate = 1.3;
    }

        //Method stub to deposit money
    public void deposit(double amount){
        //write code to add money to the account balance
    }
    //method stub to withdraw money
    public void withdrawal(double amount){
        //code to withdraw money from acount
    }
//method stub to get account details
    public void printAccountDetails(){
        //print balance, account number, interest rate, holder name
    }
}

}
