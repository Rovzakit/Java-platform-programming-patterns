package Homework.sixteenth.controller;

import Homework.sixteenth.Game;
import Homework.sixteenth.Level;
import Homework.sixteenth.LevelTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class LevelController {
    @Autowired
    private LevelTest test;

    @PostMapping("/level")
    public void post(@RequestBody Level level) {
        test.addLevel(level);
    }

    @GetMapping("/levels")
    public List<Level> getAll() {
        return test.getLevels();
    }

    @DeleteMapping("/level/{id}")
    public void delete(@PathVariable UUID id) {
        test.deleteLevel(id);
    }

    @GetMapping(value = "/level/{Id}/game")
    public @ResponseBody Game getGame(@PathVariable("Id") UUID id){
        return test.getGame(id);
    }

}
