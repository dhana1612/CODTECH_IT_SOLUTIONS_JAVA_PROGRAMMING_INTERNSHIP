package File_Encryption_Decryption;
import java.io.*;

public class FileEncryptionDecryption {

	    public static void main(String[] args) {
	        try {
	            // Input file path
	            String filePath = "F:\\CODTECH_IT_SOLUTIONS_INTERNSHIP\\Text File Encryption-Decryption/Text_File.txt";

	            // Output file paths for encryption and decryption
	            
	            String encryptedFilePath = "F:\\CODTECH_IT_SOLUTIONS_INTERNSHIP\\Text File Encryption-Decryption/Encrypted_File.txt";
	            String decryptedFilePath = "F:\\CODTECH_IT_SOLUTIONS_INTERNSHIP\\Text File Encryption-Decryption/Decrypted_File.txt";

	           
	            int key = getKeyFromUser();

	            // Encrypt the file
	            encryptFile(filePath, encryptedFilePath, key);
	            System.out.println("File encrypted successfully.");

	            // Decrypt the file
	            decryptFile(encryptedFilePath, decryptedFilePath, key);
	            System.out.println("File decrypted successfully.");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static int getKeyFromUser() {
	       
	        System.out.print("Enter the key for encryption/decryption: ");
	        java.util.Scanner scanner = new java.util.Scanner(System.in);
	        return scanner.nextInt();
	    }

	    private static void encryptFile(String inputFilePath, String outputFilePath, int key) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
	             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

	            int c;
	            while ((c = reader.read()) != -1) {
	               
	                char encryptedChar = (char) (c + key);
	                writer.write(encryptedChar);
	            }
	        }
	    }

	    private static void decryptFile(String inputFilePath, String outputFilePath, int key) throws IOException {
	        
	        encryptFile(inputFilePath, outputFilePath, -key);
	    }

}
