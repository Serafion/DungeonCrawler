package pl.dungeoncrwaler.Dungeon_Crawler.HttpClients;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.NameGenerator;
import pl.dungeoncrwaler.Dungeon_Crawler.HttpClients.NameModel.Result;
import pl.dungeoncrwaler.Dungeon_Crawler.HttpClients.NameModel.Root;

@Slf4j
@Component
public class NameGeneratorClient implements NameGenerator {

    RestTemplate restTemplate= new RestTemplate();
    ObjectMapper mapper = new ObjectMapper();
    @Override
    public String generateName() {
        try {String uri = "https://randomuser.me/api/";
        ResponseEntity<Object> response = restTemplate.getForEntity(uri,Object.class);
        ObjectMapper map = new ObjectMapper();
        String json = map.writeValueAsString(response.getBody());
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        Root root = mapper.readValue(json,Root.class);
        Result result = root.getResults().get(0);
        log.info(result.toString());
        return result.getName().getFirst()+" "+result.getName().getLast();}
        catch (Exception e){
            log.info(e.getMessage());
            return "Jean Grey";
        }
    }
}
