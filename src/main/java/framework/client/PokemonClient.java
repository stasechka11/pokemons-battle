package framework.client;
import framework.config.ConfigManager;
import framework.model.request.CreatePokemonRequest;
import framework.specification.RequestSpecifications;
import io.restassured.response.Response;

public class PokemonClient extends BaseClient {
    public Response createPokemon(CreatePokemonRequest body) {

        return post(
                RequestSpecifications.authorizedRequestSpec(),
                ConfigManager.getPokemonEndpoint(),
                body
        );
    }

    public Response getPokemonById(String id) {

        return get(
                RequestSpecifications.authorizedRequestSpec(),
                ConfigManager.getPokemonEndpoint() + "/" + id
        );
    }
}
