public class CountPersonInRoom {

    public static String counter(int personInRoom, String alarmLevel) {
        switch (alarmLevel) {
            case "Grün":
                System.out.println("Alarmstufe Grün");
                if (personInRoom > 60) {
                    return "Zu viele Personen";
                } else {
                    return "Maximale Personenzahl nicht überschritten";
                }
            case "Gelb":
                System.out.println("Alarmstufe Gelb");
                if (personInRoom > 30) {
                    return "Zu viele Personen";
                } else {
                    return "Maximale Personenzahl nicht überschritten";
                }
            default:
                System.out.println("Anderer Wert. Bitte Eingabe überprüfen!");
                return "Zu viele Personen";
        }
    }
}
