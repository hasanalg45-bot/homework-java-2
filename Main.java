public class Main {
    public static void main(String[] args) {
        WorkshopRegistration reg = new WorkshopRegistration();
        try {
            reg.registerParticipant("Hassan", 15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
