package awsjava.app;

import awsjava.bo.GameBoardBO;
import awsjava.bo.UserProfileBO;
import awsjava.bo.UserTokenBO;
import awsjava.defaults.GameConstants;

/**
 * Created by steve on 10/19/15.
 */
public class BaseApp {
    protected UserProfileBO userProfileBO = new UserProfileBO();
    protected GameBoardBO gameBoardBO = new GameBoardBO();
    GameConstants gameConstants = new GameConstants();
    UserTokenBO userTokenBO = new UserTokenBO();

    public String getUsernameFromToken(String token){
        return userProfileBO.getUsernameFromToken(token);
    }
}
