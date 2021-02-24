package evk.itmo.fprj.web;


import evk.itmo.fprj.dto.Player;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/champ")
public class FirstController {

    private List<Player> players = new ArrayList<>();


    @GetMapping
    @RequestMapping("/players/{id}")
    public Player readPlayer(String name, String surname, @PathVariable Integer id) {
        return new Player(id, name, surname);
    }


    @PostMapping
    @RequestMapping("/players/new")
    public Player createPlayer(@RequestBody Player player) {
        players.add(player);
        player.setId(1);
        return player;
    }


    @PutMapping
    @RequestMapping("/players/{id}/put")
    public Object putPlayer(String name, String surname, @PathVariable Integer id) {
        for (Player player : players) {
            if (player.getId().equals(id)) {
                player.setName(name);
                player.setSurname(surname);
                return player;
            }
        }
        return null;
    }


    @DeleteMapping
    @RequestMapping("/players/{id}/delete")
    public Object deletePlayer(@PathVariable Integer id) {
        for (Player player : players) {
            if (player.getId().equals(id)) {
                players.remove(player);
            }

        }
        return null;
    }








}












