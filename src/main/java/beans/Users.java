package beans;

import enumerate.BuildStrategy;

public final class Users {

    private final String username;
    private final String password;
    private final String logcode;
    private final String location;
    private final String inviteid;
    private final BuildStrategy strategy;


    public Users(String username,String password,String logcode,String location,String inviteid,BuildStrategy strategy){
        this.username = username;
        this.password = password;
        this.logcode = logcode;
        this.location = location;
        this.inviteid = inviteid;
        this.strategy = strategy;
    }



}
