package ObjectsAndClasses.MoreExercise.P04TeamworkProjects;

public class Creator {
    private String creatorName;
    private String createdTeamName;

    public Creator (String creatorName, String createdTeamName) {
        this.creatorName = creatorName;
        this.createdTeamName = createdTeamName;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public String getCreatedTeamName() {
        return createdTeamName;
    }
}
