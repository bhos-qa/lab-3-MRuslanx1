import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PermissionManagerTest {

    private PermissionManager permissionManager;

    @BeforeEach
    public void setUp() {
        permissionManager = new PermissionManager();
    }

    @Test
    public void testGetRoleName() {
        assertEquals("Admin", permissionManager.getRoleName(PermissionLevel.ADMIN));
        assertEquals("Developer", permissionManager.getRoleName(PermissionLevel.DEVELOPER));
        assertEquals("User", permissionManager.getRoleName(PermissionLevel.USER));
    }
}
    @Test
    public void testSetPermissionLevel() {
        // Initially, mCurrentLevel should be USER
        permissionManager.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals("Admin", permissionManager.getRoleName(PermissionLevel.ADMIN));

        permissionManager.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals("Developer", permissionManager.getRoleName(PermissionLevel.DEVELOPER));
    }
