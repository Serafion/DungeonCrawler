package pl.dungeoncrwaler.Dungeon_Crawler.infrastructure.CharacterGeneratorEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.Character;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;

@Controller
public class CharacterGeneratorController {

    @Autowired
    private CharacterGeneratorFacade characterGeneratorFacade;

    @GetMapping(value = "/generateCharacter", headers = "Accept=application/json")
    public ResponseEntity<Character> generateCharacter(){
        Character generatedCharacter = characterGeneratorFacade.generateRandomPlayer();
        return ResponseEntity.status(HttpStatus.OK).body(generatedCharacter);
    }
}
