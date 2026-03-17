package framework.service;
import framework.client.PokemonClient;
import framework.model.request.CreatePokemonRequest;
import framework.model.response.CreatePokemonResponse;
import framework.specification.ResponseSpecifications;
import io.restassured.response.Response;

public class PokemonService {
    private final PokemonClient pokemonClient = new PokemonClient();

    public Response createPokemon(CreatePokemonRequest request, int expectedStatusCode) {
        Response response = pokemonClient.createPokemon(request);
        response.then().spec(ResponseSpecifications.statusCode(expectedStatusCode));
        return response;
    }

    public CreatePokemonResponse createPokemonDto(CreatePokemonRequest request, int expectedStatusCode) {
        Response response = createPokemon(request, expectedStatusCode);
        return response.as(CreatePokemonResponse.class);
    }

    public String createPokemonAndGetId(CreatePokemonRequest request, int expectedStatusCode) {
        Response response = createPokemon(request, expectedStatusCode);
        return response.jsonPath().getString("id");
    }

    public Response getPokemonById(String id, int expectedStatusCode) {
        Response response = pokemonClient.getPokemonById(id);
        response.then().spec(ResponseSpecifications.statusCode(expectedStatusCode));
        return response;
    }
}
