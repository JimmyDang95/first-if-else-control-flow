public class CountPersonInRoom {

    public static void main(String[] args) {

        int personInRoom = 35;

        String result = counter(personInRoom);

        System.out.println(result);
    }

    public static String counter(int personInRoom) {
        if (personInRoom > 30) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }
}
