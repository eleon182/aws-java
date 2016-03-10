package awsjava.bo;

import awsjava.data.GameBoardData;
import awsjava.data.UserProfileData;
import awsjava.data.UserTokenData;
import awsjava.defaults.GameConstants;

/**
 * Created by steve on 10/21/15.
 */
public class MainBO {
    UserProfileData userProfileData = new UserProfileData();
    UserTokenData userTokenData = new UserTokenData();
    GameBoardData gameBoardData = new GameBoardData();
    GameConstants gameConstants = new GameConstants();

    public String getUsernameFromToken(String token) {
        return userTokenData.getUsername(token);
    }
}
