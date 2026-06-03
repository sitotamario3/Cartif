package miproyecto.pruebasjava;

/**
 * DESCRIPTION:
 * This app is meant to register a list of usernames and email addresses.
 * It processes a raw list of strings, splits them into names and emails, 
 * validates that the email contains both an "@" symbol and a "." symbol,
 * and adds valid users to a registry array. 
 * Finally, it counts how many users were successfully registered.
 */
public class UserRegistry {
    public static void main(String[] args) {
        String[] rawData = {"alice:alice@email.com", "bob:bobemail.com", "charlie:charlie@com", "david:david@email.com"};
        
        String[] registeredNames = new String[rawData.length];
        int activeUsers = 0;

        for (int i = 0; i < rawData.length; i++) {
            String[] parts = rawData[i].split(":");
            String name = parts[0];
            String email = parts[1];

            if (email.contains("@") && email.contains(".")) {
                registeredNames[activeUsers] = name;
                activeUsers++;
                System.out.println("Successfully registered: " + name);
            } else {
                System.out.println("Registration failed for: " + name + " (Invalid Email)");
            }
        }

        System.out.println("Total registered users: " + activeUsers);
    }
}