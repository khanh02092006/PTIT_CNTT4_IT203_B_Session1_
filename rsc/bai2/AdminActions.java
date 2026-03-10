package bai2;

interface AdminActions {

    default void logActivity(String activity) {
        System.out.println("Admin action: " + activity);
    }
}