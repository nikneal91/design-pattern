package dp.stratergy.exercise;

public class Main {

    public static void main(String[] args) {
        EncryptionAlgo algo = new AESAlgorithm();
        ChatClient chatClient = new ChatClient(algo);
        chatClient.send("sending message 1");
        chatClient.send("sending message 2");
        chatClient.send("sending message 3",new DESAlgorithm());

    }
}
