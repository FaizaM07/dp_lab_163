import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class DES implements Iencrypt  {
    private SecretKey secretKey;



    @Override
    public String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    @Override
    public String decrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decoded = Base64.getDecoder().decode(data);
        return new String(cipher.doFinal(decoded));
    }
}
