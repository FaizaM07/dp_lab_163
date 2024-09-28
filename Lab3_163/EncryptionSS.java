import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class EncryptionSS {
    protected Iencrypt strategy;

    public EncryptionSS(Iencrypt strategy) {
        this.strategy = strategy;
    }

    public void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
        String data = readFile(inputFilePath);
        String encryptedData = strategy.encrypt(data);
        writeFile(outputFilePath, encryptedData);
        System.out.println("File encrypted and saved to: " + outputFilePath);
    }

    public void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
        String data = readFile(inputFilePath);
        String decryptedData = strategy.decrypt(data);
        writeFile(outputFilePath, decryptedData);
        System.out.println("File decrypted and saved to: " + outputFilePath);
    }

    private String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    private void writeFile(String filePath, String data) throws IOException {
        Files.write(Paths.get(filePath), data.getBytes());
    }
}
