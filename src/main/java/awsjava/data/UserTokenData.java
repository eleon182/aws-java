package awsjava.data;

import awsjava.data.dao.UserTokenDAO;
import org.joda.time.DateTime;

import java.util.UUID;

/**
 * Created by steve on 10/19/15.
 */
public class UserTokenData extends AWSDatabase{

    public boolean validateToken(String token){
        UserTokenDAO dao = getMapper().load(UserTokenDAO.class, token);

        if(dao != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getUsername(String token){
        UserTokenDAO dao = getMapper().load(UserTokenDAO.class, token);

        if(dao != null) {
            return dao.getUsername();
        }
        else {
            return null;
        }
    }

}
