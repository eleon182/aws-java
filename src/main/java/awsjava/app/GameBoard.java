package awsjava.app;

import awsjava.data.dao.GameBoardDAO;

import java.util.List;

/**
 * Created by steve on 10/19/15.
 */
public class GameBoard extends BaseApp{

    public List<GameBoardDAO> getGameBoard(){
        return gameBoardBO.getGameBoardData();
    }
}
