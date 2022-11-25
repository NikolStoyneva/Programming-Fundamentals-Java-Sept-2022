package ObjectsAndClasses.MoreExercise.P04TeamworkProjects;

import java.util.List;

public class Team {
    private String creator;
    private String name;
    private List<String> members;

    public Team (String name, List<String> members, String creator) {
        this.name = name;
        this.members = members;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public List<String> getMembers() {
        return members;
    }

    public int membersCount () {
        return members.size();
    }

    public String getCreator() {
        return creator;
    }
}
