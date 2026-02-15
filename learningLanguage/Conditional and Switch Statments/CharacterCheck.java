public class CharacterCheck {
    public static void main(String[] args) {
        char ch = '&';
        if (65<=ch&&ch<=90) {
            System.out.println("The Character is Upper Case");
        }
        else if (97<=ch&&ch<=122) {
            System.out.println("The character is Lower Case");
        }
        else if (48<=ch &&ch<=57) {
            System.out.println("The character is a Digit");
        }
        else {
            System.out.println("It is a special Character");
        }
    } 
}
