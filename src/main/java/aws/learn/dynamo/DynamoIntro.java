//package aws.learn.dynamo;
//
//import com.amazonaws.auth.AWSCredentialsProvider;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.PropertiesCredentials;
//import com.amazonaws.auth.profile.ProfileCredentialsProvider;
//import com.amazonaws.regions.AwsProfileRegionProvider;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
//import com.amazonaws.services.dynamodbv2.document.DynamoDB;
//import com.amazonaws.services.dynamodbv2.model.DescribeTableResult;
//import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
//import com.amazonaws.services.dynamodbv2.model.GetItemResult;
//import com.amazonaws.services.dynamodbv2.model.TableDescription;
//
//import java.util.Map;
//
//public class DynamoIntro {
//        static String profileName = "vrudyk-iam";
//    public static void main(String[] args) {
//        AmazonDynamoDB amazonDynamoDB = AmazonDynamoDBClientBuilder.standard()
//                .withRegion(Regions.EU_WEST_2)
//                .withCredentials(new ProfileCredentialsProvider(profileName))
//                .build();
//
//
//        String tableName = "baseT";
//        DescribeTableResult result = amazonDynamoDB.describeTable(tableName);
//
//        TableDescription table = result.getTable();
//        System.out.println(table.getTableName());
//        System.out.println(table.getItemCount());
//
//        GetItemResult item = amazonDynamoDB.getItem(tableName, Map.of());
//        System.out.println(item);
//    }
//}
