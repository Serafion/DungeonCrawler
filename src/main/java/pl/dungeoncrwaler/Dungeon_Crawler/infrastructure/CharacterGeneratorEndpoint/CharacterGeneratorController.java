package pl.dungeoncrwaler.Dungeon_Crawler.infrastructure.CharacterGeneratorEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.Character;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;

@Controller
public class CharacterGeneratorController {

    @Autowired
    private CharacterGeneratorFacade characterGeneratorFacade;

    @PostMapping(value = "/generate_character", headers = "Accept=application/json")
    public ResponseEntity<Character> generateCharacter(){
        Character generatedCharacter = characterGeneratorFacade.generateRandomPlayer();
        return ResponseEntity.ok().body(generatedCharacter);
    }
}
