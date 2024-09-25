public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    // Constructor
    public PermissionManager() {
        this.mCurrentLevel = PermissionLevel.USER;
    }

    // Method to get the role name based on the PermissionLevel
    public String getRoleName(PermissionLevel level) {
        switch (level) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "Unknown Role";
        }
    }

    // Method to set the PermissionLevel
    public void setPermissionLevel(PermissionLevel level) {
        this.mCurrentLevel = level;
    }
}
