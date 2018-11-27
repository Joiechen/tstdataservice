package patterns;

import beans.Users;
import enumerate.BuildStrategy;

public class UserBuilder {

    String username = "test@qq.com";
    String password ="hkjhkjhjkhkj";
    String logcode = "hhhh";
    String location = "";
    String inviteid = "";
    BuildStrategy strategy = BuildStrategy.OUT_OF_BOX;

    public UserBuilder(){};

    public UserBuilder withUserame(String userame){
        this.username = userame;
        return this;
    }

    public UserBuilder withPassword(String password){
        this.password = password;
        return this;
    }

    public UserBuilder withLogcode(String logcode){
        this.logcode = logcode;
        return this;
    }

    public UserBuilder withLocation(String location){
        this.location = location;
        return this;
    }

    public UserBuilder withInviteid(String inviteid){
        this.inviteid = inviteid;
        return this;
    }

    public UserBuilder withBuildStrategy(BuildStrategy strategy){
        this.strategy = strategy;
        return this;
    }

    public Users build(){
        return new Users(username,password,logcode,location,inviteid,strategy);
    }
}
