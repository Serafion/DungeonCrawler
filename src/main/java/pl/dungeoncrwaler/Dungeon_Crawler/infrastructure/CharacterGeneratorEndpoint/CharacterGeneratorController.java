package pl.dungeoncrwaler.Dungeon_Crawler.infrastructure.CharacterGeneratorEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.Character;

@Controller
public class CharacterGeneratorController {

    @Autowired
    private CharacterGeneratorFacade characterGeneratorFacade;

    @RequestMapping(value = "/generate_character", method = RequestMethod.GET, headers = "Accept=application/json")
    public ResponseEntity<Character> generateCharacter(){
        Character generatedCharacter = characterGeneratorFacade.generateRandomPlayer();
        return ResponseEntity.ok().body(generatedCharacter);
    }
}
