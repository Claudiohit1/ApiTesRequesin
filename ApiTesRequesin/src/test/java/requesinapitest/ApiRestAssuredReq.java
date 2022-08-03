package requesinapitest;

import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiRestAssuredReq {

	@Test
	public void statusCodeEmployee() {

		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("name", "Alicio");
		json.put("job", "especialista");
		request.body(json.toJSONString());
		Response response = request.post("https://reqres.in/api/users");
		assertEquals(201, response.getStatusCode());
		System.out.println(response.asPrettyString());

	}

}
