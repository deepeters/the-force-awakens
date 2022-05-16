package ke.springboot.graphql.theforceapi.service;

import graphql.schema.DataFetcher;
import ke.springboot.graphql.theforceapi.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Component
public class GraphQLDataFetcher {

    private final String REST_URL = "https://swapi.dev/api/";

    private static final Logger logger = LoggerFactory.getLogger(GraphQLDataFetcher.class);

    @Autowired
    private RestTemplate restTemplate;

    public DataFetcher<List<Person>> getAllPeople(){
        logger.info("this is a info message");
        return dataFetchingEnvironment -> {
            return restTemplate
                    .exchange(REST_URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Person>>() {
                    }).getBody();
        };
    }

    public DataFetcher<Person> getPeopleByName(){
        return dataFetchingEnvironment -> {
            String name = dataFetchingEnvironment.getArgument("name");
            return restTemplate.getForObject(REST_URL + "people/" + name, Person.class);
        };
    }

    //This class has a problem
    public DataFetcher<Person> getPeopleByPage(){
        return dataFetchingEnvironment -> {
            String page = dataFetchingEnvironment.getArgument("page");
            return restTemplate.getForObject(REST_URL + "people/" + page, Person.class);
        };
    }

}
