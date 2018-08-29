package mytests;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class GetTest {

	public static void main(String[] args) {

		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/api/users");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

}
