# pokedex-rest-service

## **About Project:**

This is fun "Pokedex" game in form of Restful API that returns Pokemon information.
The API has two main API two main endpoints:
1. Returns basic Pokemon information.
2. Returns basic Pokemon information but with a 'fun' translation of the Pokemon description.

This project is written as Spring Boot application.

## **Endpoint 1:**
Given a Pokemon name this api call returns standard Pokemon description and additional information.
This api calls another api "https://pokeapi.co/api/v2/pokemon-species" to get the Pokemon details.

Endpoint: `http://localhost:8081/pokemon/{pokemon name)`

Response contains following fields:

    -- Pokemon's name
    -- Pokemon's standard description
    -- Pokemon's habitat
    -- Pokeman's is_legandary status
    -- Pokemon's generation

e.g. http://localhost:8081/pokemon/pikachu

Response:

`{
"name": "pikachu",
"description": "When Pikachu meet, they’ll touch their tails together and exchange electricity through them as a form of greeting.",
"habitat": "forest",
"isLegendary": false,
"generation": "generation-i"
}`

## **Endpoint 2:**
Given a Pokemon name this api call returns description and other basic information using following rules:
 1. If the Pokemon's habitat is cave or it's a legendary Pokemon then apply yoda translation.
 2. For all other Pokemon, apply the Shakespeare translation
 3. If it cannot be translated then use standard translation

This api calls another api "https://api.funtranslations.com/" to get translated description. 


Endpoint: `http://localhost:8081/pokemon/translated/{pokemon name}`

Response contains following fields:

    -- Pokemon's name
    -- Pokemon's translated description
    -- Pokemon's habitat
    -- Pokeman's is_legandary status
    -- Pokemon's generation

e.g. http://localhost:8081/pokemon/translated/ditto

Response:

`{
"name":"ditto",
"description":"At which hour 't encounters another ditto,  'twill moveth faster than ingraft to duplicate yond opponent jump.",
"habitat":"urban",
"isLegendary":false,
"generation":"generation-i"
}`

## **Get Started:**

For development following software are required:
1. Java (version "17.0.1" recommended)
2. Maven
3. Git

Starting this application:
1. Any IDE (e.g. Intellij) can be used to import this project and start this application by selecting "run PokedexApplication".
2. From command line interface run following command from project's root directory:
   `mvn spring-boot:run`

This application can also be run as standalone jar file. Java is pre-requisite to run this a jar file. Jar file can be found in project root directory. 

`java -jar target/pokedex-0.0.1-SNAPSHOT.jar`

Test this application by calling the endpoints from
1. A browser
2. Postman
3. Or any other tool/app to test API

## **Future Improvements in pipeline:**
1. Caching of request to reduce number of time other api's are called by this application internally.

