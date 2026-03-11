import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.management.relation.Role;
import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class PermissionServiceTest1 {

    private PermissionService service;
    private User user;

    @BeforeEach
    void setUp() {
        service = new PermissionService();
    }

    @AfterEach
    void tearDown() {
        user = null;
    }

    // ===== ADMIN =====

    @Test
    void adminCanDeleteUser() {

        user = new User(Role.ADMIN);

        boolean result = service.canPerformAction(user, Action.DELETE_USER);

        assertTrue(result);
    }

    @Test
    void adminCanLockUser() {

        user = new User(Role.ADMIN);

        boolean result = service.canPerformAction(user, Action.LOCK_USER);

        assertTrue(result);
    }

    @Test
    void adminCanViewProfile() {

        user = new User(Role.ADMIN);

        boolean result = service.canPerformAction(user, Action.VIEW_PROFILE);

        assertTrue(result);
    }

    // ===== MODERATOR =====

    @Test
    void moderatorCannotDeleteUser() {

        user = new User(Role.MODERATOR);

        boolean result = service.canPerformAction(user, Action.DELETE_USER);

        assertFalse(result);
    }

    @Test
    void moderatorCanLockUser() {

        user = new User(Role.MODERATOR);

        boolean result = service.canPerformAction(user, Action.LOCK_USER);

        assertTrue(result);
    }

    @Test
    void moderatorCanViewProfile() {

        user = new User(Role.MODERATOR);

        boolean result = service.canPerformAction(user, Action.VIEW_PROFILE);

        assertTrue(result);
    }

    // ===== USER =====

    @Test
    void userCannotDeleteUser() {

        user = new User(Role.USER);

        boolean result = service.canPerformAction(user, Action.DELETE_USER);

        assertFalse(result);
    }

    @Test
    void userCannotLockUser() {

        user = new User(Role.USER);

        boolean result = service.canPerformAction(user, Action.LOCK_USER);

        assertFalse(result);
    }

    @Test
    void userCanViewProfile() {

        user = new User(Role.USER);

        boolean result = service.canPerformAction(user, Action.VIEW_PROFILE);

        assertTrue(result);
    }
}