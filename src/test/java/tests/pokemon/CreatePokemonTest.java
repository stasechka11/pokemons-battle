package tests.pokemon;

import framework.model.request.CreatePokemonRequest;
import framework.model.response.CreatePokemonResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;
import tests.testdata.TestDataFactory;

public class CreatePokemonTest extends BaseTest {
    @Test
    void shouldCreatePokemon() {

        CreatePokemonRequest request = TestDataFactory.pokemonForCreation();

        CreatePokemonResponse response = pokemonService.createPokemonDto(request, 201);

        Assertions.assertEquals("Покемон создан", response.getMessage());
        Assertions.assertTrue(
                response.getId() != null && !response.getId().isBlank(),
                "Pokemon id should not be null or empty"
        );
    }
}
