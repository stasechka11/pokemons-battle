package framework.service;
import framework.client.PokemonClient;
import framework.model.request.CreatePokemonRequest;
import framework.model.response.CreatePokemonResponse;
import framework.specification.ResponseSpecifications;
import io.restassured.response.Response;

public class PokemonService {
    private final PokemonClient pokemonClient = new PokemonClient();

    public CreatePokemonResponse createPokemon(CreatePokemonRequest request) {

        Response response = pokemonClient.createPokemon(request);

        response.then().spec(ResponseSpecifications.statusCode200());

        return response.as(CreatePokemonResponse.class);
    }

    public String createPokemonAndGetId(CreatePokemonRequest request) {

        Response response = pokemonClient.createPokemon(request);

        response.then().spec(ResponseSpecifications.statusCode200());

        return response.jsonPath().getString("id");
    }

    public Response getPokemonById(String id) {

        Response response = pokemonClient.getPokemonById(id);

        response.then().spec(ResponseSpecifications.statusCode200());

        return response;
    }
}
