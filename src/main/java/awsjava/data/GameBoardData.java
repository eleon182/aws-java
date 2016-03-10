package awsjava.data;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import awsjava.data.dao.GameBoardDAO;

import java.util.List;

/**
 * Created by steve on 10/19/15.
 */
public class GameBoardData extends AWSDatabase {
    public List<GameBoardDAO> getGameBoard() {
        return getMapper().scan(GameBoardDAO.class, new DynamoDBScanExpression());
    }

    public GameBoardDAO getSector(GameBoardDAO sector){
        return getMapper().load(GameBoardDAO.class, sector.getX(), sector.getY());
    }

}
