import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Encryption Algorithm: 1. AES  2. DES  3. Caesar Cipher");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        Iencrypt strategy = null;

        try {
            switch (choice) {
                case 1 -> strategy = new AES();
                case 2 -> strategy = new DES();
                case 3 -> strategy = new Ccipher();
                default -> {
                    System.out.println("Invalid choice!");
                    return;
                }
            }

            System.out.println("Enter the input file path: ");
            String inputFilePath = scanner.nextLine();

            System.out.println("Enter the output file path for encryption: ");
            String encryptedFilePath = scanner.nextLine();

            System.out.println("Enter the output file path for decryption: ");
            String decryptedFilePath = scanner.nextLine();

            EncryptionSS service = new EncryptionSS(strategy) {};
            service.encryptFile(inputFilePath, encryptedFilePath);
            service.decryptFile(encryptedFilePath, decryptedFilePath);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
