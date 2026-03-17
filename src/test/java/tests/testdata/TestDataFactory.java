package tests.testdata;

import framework.model.request.CreatePokemonRequest;

public class TestDataFactory {
    public static CreatePokemonRequest pokemonForCreation() {

        return CreatePokemonRequest.builder()
                .name("generate")
                .photoId(-1)
                .build();
    }
}
