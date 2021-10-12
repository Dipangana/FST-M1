package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Activity1_RestAssured {
	
	//String Root_uri = "https://api.github.com";
	//String token = "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";
	
	
	RequestSpecification requestSpec;
	   
    ResponseSpecification responseSpec;
    int id;
   
	
	
	@BeforeClass
	public void setup() {
	 requestSpec = new RequestSpecBuilder().addHeader("Authorization", "token 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")
     
     .setContentType(ContentType.JSON)

     .setBaseUri("https://api.github.com")
   
     

     .build();
	 responseSpec = new ResponseSpecBuilder()
	          
        //     .expectStatusCode(200)
       
             .expectContentType("application/json")
      
             .build();
 }

	 


	
	

	  @Test(priority=2) 
	  public void GETrequest() { 
		  Response response1 =
	  given().spec(requestSpec)
	  
	 .when().get("/user/keys");
		  response1.then().spec(responseSpec);
	 
	  // Assertion System.out.println(response.asPrettyString());
	 
		  String  body2 = response1.getBody().asPrettyString();
		  System.out.println(body2);
		  Assert.assertEquals(response1.getStatusCode(),200);
	
	  }
	
	
	@Test(priority=1)
	public void POSTrequest() {
		String body = 
			 "   {\"title\": \"TestAPIKey\", \"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDo/MEyb5cHKf/zg76yhx81dOCNKR/n3VWMcSfxya+Dma5PMPzcvOwtf7SIfXNhI9x1Jyu+IYJEX4bUK8Ag4W2esvSnJ8vZKpbpGP7V7TtW2xBGB/ql6rGICDyU2pzLmABM5wCVLmQnLPR/aVaLlFQQpHDTWZDgTunsen7EERd9bEdrAZDLjAUkDqUNfgu13oDiZUO9HY2UpO4lXs+301XMP2kpWWHsAtW4mpBp1Nak5yDlmPHTWhYvgsLrxZJrEpLMkXnTzOZcDhQKU9W1D//SNi/w04QoSeLt2tg97jZjH3MDa/GNbgsOC7YvePOmdSCFkBMI8+Zjj+FnaPrKntHlg25+DkeuGjOd7SCRg7crQprB0ag2n9yf1KAx326kZ37lAVvelpZkqiiF/yOup+DZb9G61130qE7TKQtMffQTZpUiSHkIMr7exiH6Y1CWjoaVmKU8PKYeRy5/9f+auDKLJPgeEHEn3eNW3Au6cUAxAiFPEZ5RrWFRS0PpnFzkrLU=\"}";
				
		
		Response response = given().spec(requestSpec)
                .body(body) 
                .when().post("/user/keys"); 
		response.then().spec(responseSpec);
		
		
		String  body1 = response.getBody().asPrettyString();
		//String id = response.then().extract().path("id");
		System.out.println(body1);
		JsonPath jsonPathEvaluator = response.jsonPath();
		id = jsonPathEvaluator.get("id");
		System.out.println(id);
		
		Assert.assertEquals(response.getStatusCode(),201);
		
		
	}
	
	@Test(priority=3)
	public void DELETErequest() {
		Response response2 = given().spec(requestSpec)
				.pathParam("keyId",id )
				.when().delete("/user/keys/{keyId}");
		//response2.then().spec(responseSpec);
		String  body3 = response2.getBody().asPrettyString();
		  System.out.println(body3);
		  Assert.assertEquals(response2.getStatusCode(),204);
				
	}
	
	
	
		
	}



