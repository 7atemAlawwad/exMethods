import java.util.Scanner;

public class exMethods {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
//        1 - Write a Java method to find the smallest number among three
//        numbers.
//                Test Data:
//        Input the first number: 25
//        Input the Second number: 37
//        Input the third number: 29
//        Expected Output:
//        The smallest value is 25.0

        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = s.nextInt();

        double smallest = smallestNumber(num1,num2,num3);

        System.out.println("The smallest number is " + smallest);


//        2 - Write a Java method that check if the entered number is negative or
//        positive or zero.

        System.out.print("Enter Number: ");
        int n = s.nextInt();

        System.out.println(posOrNegOrZero(n));


//        3 - Write a Java method to check whether a string is a valid password.
//        Password rules:
//        A password must have at least ten characters. A
//        password consists of only letters and digits. A
//        password must contain at least two digits.

        System.out.print("1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits.\n\n" +
                "Input a password (You are agreeing to the above Terms and Conditions): ");

        String password = s.nextLine();

        validatePassword(password);





    }

public static void validatePassword(String password){
        if(password.length() < 8){
            System.out.println("Password must be at least 8 characters");
        }
        if(checkPasswordContainsOnlyLettersAndDigits(password) == false){
            System.out.println("Password consists of only letters and digits.");

        }
        if (checkPasswordContainAtLeastTwoDigits(password) == false) {
            System.out.println("Password must contain at least two digits");
        }
        else {
            System.out.println("Password is valid: "+password);
        }
}
public static boolean checkPasswordContainsOnlyLettersAndDigits(String password){

        return password.chars().allMatch(Character::isLetterOrDigit);
}

public static boolean checkPasswordContainAtLeastTwoDigits(String password){
        int counter = 0;
    for(int i = 0; i < password.length(); i++){
        if(password.charAt(i) == '1'){
            counter++;
        }
        else if(password.charAt(i) == '2'){
            counter++;
        }
        else if(password.charAt(i) == '3'){
            counter++;
        }
        else if(password.charAt(i) == '4'){
            counter++;
        }
        else if(password.charAt(i) == '5'){
            counter++;
        }
        else if(password.charAt(i) == '6'){
            counter++;
        }
        else if(password.charAt(i) == '7'){
            counter++;
        }
        else if(password.charAt(i) == '8'){
            counter++;
        }
        else if(password.charAt(i) == '9'){
            counter++;
        }
        else if(password.charAt(i) == '0'){
            counter++;
        }
    }
    if(counter >= 2){
        return true;
    }
    else{
        return false;
    }

}




    public static String posOrNegOrZero(int n){
        if (n < 0){
            return "Negative Number";
        }
        else if (n == 0){
            return "Zero";
        }
        else{
            return "positive Number";
        }
    }

    public static int smallestNumber(int a, int b, int c){

        if(a<=b && a<c){
            return a;
        }
        else if(b<a && b<=c){
            return b;
        }
        else if(c<a && c<b){
            return c;
        }
        return -1;
    }

}
