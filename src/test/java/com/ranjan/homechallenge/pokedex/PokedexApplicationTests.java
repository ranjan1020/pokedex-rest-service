package com.ranjan.homechallenge.pokedex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
class PokedexApplicationTests {


	@Autowired
	private TestRestTemplate template;


	/**
	 * This test calls the endpoint /pokemon/alakazam and asserts response is valid.
	 * 	Assertion removes some special character.
	 */
	@Test
	public void testAlakazamPokeApi() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/pokemon/alakazam", String.class);
		assertThat(response.getBody().replaceAll("[^a-zA-Z0-9.{:\",-_}]", " "))
				.isEqualTo("{\"name\":\"alakazam\",\"description\":\"Alakazam wields potent psychic powers. It s said that this Pok mon used these powers to create the spoons it holds.\",\"habitat\":\"urban\",\"isLegendary\":false,\"generation\":\"generation-i\"}");
	}

	/**
	 * This test calls the endpoint /pokemon/pikachu and asserts response is valid.
	 * 	Assertion removes some special character.
	 */
	@Test
	public void testPikachuPokeApi() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/pokemon/pikachu", String.class);
		assertThat(response.getBody().replaceAll("[^a-zA-Z0-9.{:\",-_}]", " "))
				.isEqualTo("{\"name\":\"pikachu\",\"description\":\"When Pikachu meet, they ll touch their tails together and exchange electricity through them as a form of greeting.\",\"habitat\":\"forest\",\"isLegendary\":false,\"generation\":\"generation-i\"}");
	}

	/**
	 * This test calls api with a pokemon name that does not exist and gets
	 * HTTPStatus NOT_FOUND
	 */
	@Test
	public void testNotFoundResponsePokeApi() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/pokemon/pikachu1", String.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}

	/**
	 * This test calls api with spaces as pokemon name and gets
	 * HTTPStatus BAD_RESPONSE
	 */
	@Test
	public void testBadRequestPokeApi() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/pokemon/  ", String.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
		assertThat(response.getBody()).isEqualTo("ApiCall.pokename: must not be blank");
	}


	/**
	 * This test calls api without a pokemon name and asserts response
	 * received from API
	 */
	@Test
	public void testNoPokemonNamePokeApi() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/pokemon/", String.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).isEqualTo("{\"Pokedex response:\":\"Pokemon name not received!!!!!\"}");
	}


}
