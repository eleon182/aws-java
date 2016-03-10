package awsjava.bo;

import awsjava.data.UserProfileData;
import awsjava.data.UserTokenData;

/**
 * Created by steve on 10/21/15.
 */
public class MainBO {
    UserProfileData userProfileData = new UserProfileData();
    UserTokenData userTokenData = new UserTokenData();

    public String getUsernameFromToken(String token) {
        return userTokenData.getUsername(token);
    }
}
