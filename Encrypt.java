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
        in.nextLine();

        if (num == 1) {
            System.out.println("Please enter the text to encrypt:");
            String textToEncrypt = in.nextLine();
            System.out.println("Enter number to move:");
            long key = in.nextInt();
            String encryptedText = toEncryptCaesar(textToEncrypt, key);
            System.out.println("Encrypted text: " + encryptedText);
        } else if (num == 2) {
            System.out.println("Please enter the text to decrypt:");
            String textToDecrypt = in.nextLine();
            System.out.println("Enter number to move:");
            long key = in.nextInt();
            String decryptedText = toDecryptCaesar(textToDecrypt, key);
            System.out.println("Decrypted text: " + decryptedText);
        } else if (num == 3) {
            System.out.println("Please enter the text to encrypt:");
            String textToEncrypt = in.nextLine();
            System.out.println("Please enter key word:");
            String keyWord = in.next();
            String encryptedText = toEncryptVigenere(textToEncrypt, keyWord);
            System.out.println("Encrypted text: " + encryptedText);
        } else if (num == 4) {
            System.out.println("Please enter the text to decrypt:");
            String textToDecrypt = in.nextLine();
            System.out.println("Enter key word:");
            String keyWord = in.next();
            String decryptedText = toDecryptVigenere(textToDecrypt, keyWord);
            System.out.println("Decrypted text: " + decryptedText);
        } else {
            exitProgram();
        }

    }
    public static String toEncryptCaesar(String textToEncrypt, long key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : textToEncrypt.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + key + 26) % 26 + base);
            }
            encryptedText.append(c);
        }
        return encryptedText.toString();
    }

    public static String toDecryptCaesar(String textToEncrypt, long key) {
        //Caesar decryption
        StringBuilder encryptedText = new StringBuilder();
        for (char c : textToEncrypt.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base - key + 26) % 26 + base);
            }
            encryptedText.append(c);
        }
        return encryptedText.toString();
    }

    public static String toEncryptVigenere(String textToEncrypt, String keyWord) {
        StringBuilder encryptedText = new StringBuilder();
        keyWord = keyWord.toLowerCase();
        int keyIndex = 0;

        for (char c : textToEncrypt.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int shift = keyWord.charAt(keyIndex % keyWord.length()) - 'a';
                c = (char) ((c - base + shift + 26) % 26 + base);
                keyIndex++;
            }
            encryptedText.append(c);
        }
        return encryptedText.toString();
    }

    public static String toDecryptVigenere(String textToDecrypt, String keyWord) {
        StringBuilder decryptedText = new StringBuilder();
        keyWord = keyWord.toLowerCase();
        int keyIndex = 0;

        for (char c : textToDecrypt.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int shift = keyWord.charAt(keyIndex % keyWord.length()) - 'a';
                c = (char) ((c - base - shift + 26) % 26 + base);
                keyIndex++;
            }
            decryptedText.append(c);
        }
        return decryptedText.toString();
    }
        public static void exitProgram() {
            System.out.println("Exiting program...");
            return;
        }

}
