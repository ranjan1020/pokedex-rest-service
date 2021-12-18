# pokedex-rest-service

This is fun "Pokedex" game in form of Rest API that returns Pokemon information.
The API has two main API two main endpoints:
1. Returns basic Pokemon information.
2. Returns basic Pokemon information but with a 'fun' translation of the Pokemon description.

Endpoint 1:

http://localhost:8081/pokemon/{pokemon name)

Response contains following fields:
    * Pokemon's name
    * Pokemon's standard description
    * Pokemon's habitat
    * Pokeman's is_legandary status
    * Pokemon's generation

e.g. http://localhost:8081/pokemon/pikachu

Response:

{
"name": "pikachu",
"description": "When Pikachu meet, they’ll touch their tails together and exchange electricity through them as a form of greeting.",
"habitat": "forest",
"isLegendary": false,
"generation": "generation-i"
}








