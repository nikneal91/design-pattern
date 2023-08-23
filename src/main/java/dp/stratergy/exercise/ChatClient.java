package dp.stratergy.exercise;

public class ChatClient {
    private EncryptionAlgo encryptionAlgorithm;

    public ChatClient(EncryptionAlgo encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message, EncryptionAlgo algo) {
        algo.encrypt();
        System.out.println("Sending the encrypted message...");
    }

    public void send(String message) {
        encryptionAlgorithm.encrypt();
        System.out.println("Sending the encrypted message...");
    }
}
