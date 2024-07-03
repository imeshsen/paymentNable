import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;

public class PaymentDataEncryption {

    public static void main(String[] args) throws Exception {
        // Generate a key for AES encryption
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(new SecureRandom());
        SecretKey secretKey = keyGenerator.generateKey();

        // Initialize the Cipher for Encryption
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        
        // Encrypt the data
        String paymentData = "Sensitive Payment Information";
        byte[] encryptedData = cipher.doFinal(paymentData.getBytes());
        
        // Decrypt the data (For demonstration purposes)
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedData = cipher.doFinal(encryptedData);
        
        // Output to demonstrate successful encryption and decryption
        System.out.println("Original Data: " + paymentData);
        System.out.println("Encrypted Data: " + new String(encryptedData));
        System.out.println("Decrypted Data: " + new String(decryptedData));
    }
}
