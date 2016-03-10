package awsjava.resource;

import awsjava.app.GameBoard;
import awsjava.app.Purchase;
import awsjava.app.UserProfile;
import awsjava.data.AWSDatabase;
import awsjava.defaults.GameConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/constants")
@RestController
public class MainResource {

    GameBoard gameBoard = new GameBoard();
    UserProfile userProfile = new UserProfile();
    Purchase purchase = new Purchase();

    @RequestMapping("/tables")
    ResponseEntity<?> getDetails() {
        AWSDatabase temp = new AWSDatabase();
        return new ResponseEntity<>(temp.listTables(), HttpStatus.OK);
    }

    @RequestMapping("/game")
    ResponseEntity<?> gameConstants() {
        return new ResponseEntity<>(new GameConstants(), HttpStatus.OK);
    }


}
