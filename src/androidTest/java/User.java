// Class Declaration
public class User {
    // Instance Variables
    String name;
    String description;
    int id;
    boolean followed;

    // Constructor Declaration of Class
    public User(String name, String description, int id,
               boolean followed)
    {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    // method 1
    public String getName() { return name; }

    // method 2
    public String getDescription() { return description; }

    // method 3
    public int getId() { return id; }

    // method 4
    public boolean getFollowed() { return followed; }
}
