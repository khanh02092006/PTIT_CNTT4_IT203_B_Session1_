package bai2;

class SuperAdmin implements UserActions, AdminActions {

    @Override
    public void logActivity(String activity) {
        UserActions.super.logActivity(activity);
        AdminActions.super.logActivity(activity);
    }
}