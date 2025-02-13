import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose one of the following options:");
        System.out.println("1. Encrypt by Caesar encryption.");
        System.out.println("2. Decrypt by Caesar decryption.");
        System.out.println("3. Encrypt by Vigenere decryption.");
        System.out.println("4. Decrypt by Vigenere decryption.");
        System.out.println("\033[31mChoose any other number to exit.\033[0m");
        System.out.print("Please enter only number: ");
        int num=in.nextInt();
        if(num==1){
            System.out.println("Please enter the text to encrypt:");
            String textToEncrypt=in.next();
            while (!textToEncrypt.matches("[a-zA-Z]+")) {
                System.out.println("Error: Please enter only letters for Caesar cipher.");
                textToEncrypt = in.next();
            }
            System.out.println("Enter number to move:");
            long key =in.nextInt();
            String encryptedText= toEncryptCaesar(textToEncrypt,key);
            System.out.println("Encrypted text: "+encryptedText);
        }
        else if(num==2){
            System.out.println("Please enter the text to decrypt:");
            String textToDecrypt=in.next();
            while (!textToDecrypt.matches("[a-zA-Z]+")) {
                System.out.println("Error: Please enter only letters for Caesar cipher.");
                textToDecrypt = in.next();
            }
            System.out.println("Enter number to move:");
            long key=in.nextInt();
            String encryptedText= toDecryptCaesar(textToDecrypt,key);
            System.out.println("Decrypted text: "+encryptedText);
        }
        else if(num==3){
            System.out.println("Please enter the text to encrypt:");
            String textToEncrypt=in.next();
            while (!textToEncrypt.matches("[a-zA-Z]+")) {
                System.out.println("Error: Please enter only letters for Vigenere cipher.");
                textToEncrypt = in.next();
            }
            System.out.println("Please enter key word:");
            String keyWord=in.next();
            while (!keyWord.matches("[a-zA-Z]+")) {
                System.out.println("Error: Please enter only letters for Vigenere key.");
                keyWord = in.next();
            }
            String encryptedText=toEncryptVirger(textToEncrypt,keyWord);
            System.out.println("Encrypted text: "+encryptedText);
        }
        else if(num==4){
            System.out.println("Please enter the text to decrypt:");
            String textToDecrypt=in.next();
            while (!textToDecrypt.matches("[a-zA-Z]+")) {
                System.out.println("Error: Please enter only letters for Vigenere cipher.");
                textToDecrypt = in.next();
            }
            System.out.println("Enter key word:");
            String keyWord=in.next();
            while (!keyWord.matches("[a-zA-Z]+")) {
                System.out.println("Error: Please enter only letters for Vigenere key.");
                keyWord = in.next();
            }
            String decryptedText=(toDecryptVigenere(textToDecrypt,keyWord));
            System.out.println("Decrypted text: "+decryptedText);
        }
        else{
            exitProgram();
        }

    }

    public static String toEncryptCaesar(String textToEncrypt, long key) {
        //Caesar encryption
        StringBuilder EncryptedText = new StringBuilder() ;
        textToEncrypt=textToEncrypt.toLowerCase();
        for (int i = 0; i < textToEncrypt.length(); i++) {
            char c = textToEncrypt.charAt(i);
            if (Character.isLetter(c)) {
                //For only letters
                c=(char)((c-'a'+key+26)%26+'a');

            }
            EncryptedText.append(c);
        }
        return EncryptedText.toString();
    }

    public static String toDecryptCaesar(String textToDecrypt, long key) {
        //Caesar decryption
        StringBuilder DecryptedText = new StringBuilder() ;
        textToDecrypt=textToDecrypt.toLowerCase();
        for (int i = 0; i < textToDecrypt.length(); i++) {
            char c = textToDecrypt.charAt(i);
            if (Character.isLetter(c)) {
                c=(char)((c-'a'-key+26)%26+'a');
            }
            DecryptedText.append(c);
        }
        return DecryptedText.toString();
    }
    public static String toEncryptVirger(String textToEncrypt, String keyWord) {
        StringBuilder encryptedText = new StringBuilder() ;
        textToEncrypt=textToEncrypt.toLowerCase();
        keyWord=keyWord.toLowerCase();
        int keyIndex=0;
        for (int i = 0; i < textToEncrypt.length(); i++) {
            char c = textToEncrypt.charAt(i);

            if (Character.isLetter(c)) {
                int shift = keyWord.charAt(keyIndex) - 'a';

                c = (char) ((c - 'a' + shift + 26) % 26 + 'a');
                keyIndex = (keyIndex + 1) % keyWord.length();
            }

            encryptedText.append(c);
        }

        return encryptedText.toString();

    }
    public static String toDecryptVigenere(String textToDecrypt, String keyWord) {
        StringBuilder decryptedText = new StringBuilder();
        textToDecrypt = textToDecrypt.toLowerCase();
        keyWord = keyWord.toLowerCase();

        int keyIndex = 0;

        for (int i = 0; i < textToDecrypt.length(); i++) {
            char c = textToDecrypt.charAt(i);

            if (Character.isLetter(c)) {
                int shift = keyWord.charAt(keyIndex) - 'a';
                c = (char) ((c - 'a' - shift + 26) % 26 + 'a');
                keyIndex = (keyIndex + 1) % keyWord.length();
            }

            decryptedText.append(c);
        }

        return decryptedText.toString();
    }
        public static void exitProgram() {
            System.out.println("Exiting program...");
            System.exit(0);
        }

}
