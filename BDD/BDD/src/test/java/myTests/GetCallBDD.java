package myTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {

	@Test
	public void test_noOfCircuitsFor2017()
	{
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			assertThat().
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
			and().
			header("content-length", "4551").
			and().
			statusCode(200);
	}
	
}
