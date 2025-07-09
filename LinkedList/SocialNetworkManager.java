package DSA_LinkedList;


import java.util.ArrayList;

// Node class for each user
class UserNode {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

// Manager class for social media user connections
public class SocialNetworkManager {
    private UserNode head;

    // Add user
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    private UserNode getUserById(int userId) {
        UserNode current = head;
        while (current != null) {
            if (current.userId == userId) return current;
            current = current.next;
        }
        return null;
    }

    // Add friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = getUserById(userId1);
        UserNode user2 = getUserById(userId2);

        if (user1 == null || user2 == null || userId1 == userId2) {
            System.out.println("Invalid users.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) user1.friendIds.add(userId2);
        if (!user2.friendIds.contains(userId1)) user2.friendIds.add(userId1);
        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    // Remove friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = getUserById(userId1);
        UserNode user2 = getUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("Invalid users.");
            return;
        }

        user1.friendIds.remove((Integer) userId2);
        user2.friendIds.remove((Integer) userId1);
        System.out.println("Friend connection removed.");
    }

    // Find mutual friends
    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = getUserById(userId1);
        UserNode user2 = getUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("Invalid users.");
            return;
        }

        ArrayList<Integer> mutuals = new ArrayList<>();
        for (int id : user1.friendIds) {
            if (user2.friendIds.contains(id)) {
                mutuals.add(id);
            }
        }

        if (mutuals.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            System.out.println("Mutual Friends:");
            for (int id : mutuals) {
                UserNode friend = getUserById(id);
                System.out.println("- " + friend.name + " (ID: " + id + ")");
            }
        }
    }

    // Display friends of a user
    public void displayFriends(int userId) {
        UserNode user = getUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (int id : user.friendIds) {
            UserNode friend = getUserById(id);
            if (friend != null) {
                System.out.println("- " + friend.name + " (ID: " + id + ")");
            }
        }
    }

    // Search for a user
    public void searchUser(String keyword) {
        UserNode current = head;
        boolean found = false;

        while (current != null) {
            if (String.valueOf(current.userId).equals(keyword) || current.name.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + current.name + " | ID: " + current.userId + " | Age: " + current.age);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("User not found.");
        }
    }

    // Count number of friends for each user
    public void countAllFriendships() {
        UserNode current = head;
        while (current != null) {
            System.out.println(current.name + " has " + current.friendIds.size() + " friend(s).");
            current = current.next;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        SocialNetworkManager manager = new SocialNetworkManager();

        manager.addUser(1, "Alice", 20);
        manager.addUser(2, "Bob", 22);
        manager.addUser(3, "Charlie", 21);
        manager.addUser(4, "David", 23);

        manager.addFriendConnection(1, 2);
        manager.addFriendConnection(1, 3);
        manager.addFriendConnection(2, 3);
        manager.addFriendConnection(3, 4);

        System.out.println("\nFriends of Alice:");
        manager.displayFriends(1);

        System.out.println("\nMutual friends of Alice and Bob:");
        manager.findMutualFriends(1, 2);

        System.out.println("\nSearching for user 'David':");
        manager.searchUser("David");

        System.out.println("\nFriend counts:");
        manager.countAllFriendships();

        System.out.println("\nRemoving connection between Alice and Charlie...");
        manager.removeFriendConnection(1, 3);

        System.out.println("\nFriends of Alice:");
        manager.displayFriends(1);
    }
}
