package data.body;

import java.util.HashMap;

public class UserBody {

    public HashMap<String, Object> bodyUser(Integer id, String userName, String password){
        HashMap<String, Object> body = new HashMap<>();
        body.put("id", id);
        body.put("userName", userName);
        body.put("password", password);
        return body;
    }
}
