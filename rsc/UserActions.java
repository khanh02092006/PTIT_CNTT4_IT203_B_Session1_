interface UserActions {

    default void logActivity(String activity) {
        System.out.println("User action: " + activity);
    }
}