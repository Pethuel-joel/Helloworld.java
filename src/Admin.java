public class Admin extends User{

    @Override
    String getPermission() {
        return null;
    }

    @Override
    public boolean authenticate(String email, String password )
    {
        return super.authenticate();
    }
}
