package com.hamma.app.rest;

import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UserRestService<T> {
	private HttpClient client;

	public HttpResponse<T> getUser() {
		// HttpRequest.newBuilder(new URI("https://postman-echo.com/get"))
		try {
			/*
			 * setting a time out HttpRequest request = HttpRequest.newBuilder() .uri(new
			 * URI("https://postman-echo.com/get")) .timeout(Duration.of(10, SECONDS))
			 * .GET() .build(); set body HttpRequest request = HttpRequest.newBuilder()
			 * .uri(new URI("https://postman-echo.com/post")) .POST(HttpRequest.noBody())
			 * .build(); String as a body, HttpRequest request = HttpRequest.newBuilder()
			 * .uri(new URI("https://postman-echo.com/post")) .headers("Content-Type",
			 * "text/plain;charset=UTF-8")
			 * .POST(HttpRequest.BodyProcessor.fromString("Sample request body")) .build();
			 * proxy HttpResponse<String> response = HttpClient .newBuilder()
			 * .proxy(ProxySelector.getDefault()) .build() .send(request,
			 * HttpResponse.BodyHandler.asString());
			 */
			HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://postman-echo.com/get"))
					.headers("key1", "value1", "key2", "value2").GET().build();

			HttpRequest request2 = HttpRequest.newBuilder().uri(new URI("https://postman-echo.com/get"))
					.header("key1", "value1").header("key2", "value2").GET().build();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public HttpResponse<String> exempleAuthCon() {
		HttpResponse<String> response = HttpClient.newBuilder().authenticator(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("username", "password".toCharArray());
			}
		}).build().send(request, HttpResponse.BodyHandler.asString());
		return reponse;
	}

}
