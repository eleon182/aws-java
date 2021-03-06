package awsjava.data;

import com.amazonaws.auth.profile.ProfilesConfigFile;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;

import java.util.List;

/**
 * Created by steve on 10/18/15.
 */
public class AWSDatabase {
    private DynamoDBMapper mapper;
    private AmazonDynamoDB aws;

    public AWSDatabase() {
//        aws = new AmazonDynamoDBClient(new ProfilesConfigFile().getCredentials("steve"));

        aws = new AmazonDynamoDBClient();
        aws.setRegion(Region.getRegion(Regions.US_WEST_2));
        mapper = new DynamoDBMapper(aws);
    }

    DynamoDBMapper getMapper() {
        return mapper;
    }

    public List<String> listTables() {
        ListTablesResult result = aws.listTables();

        return result.getTableNames();
    }

}
