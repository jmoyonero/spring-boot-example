package roomscape.com.demo;

import org.springframework.web.bind.annotation.*;
import roomscape.com.demo.entities.EscapeRoom;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class WebController {

    // TODO: Local data
    private final ArrayList<EscapeRoom> escapeRooms = new ArrayList<>();
    private int idGenerator = 1000;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping(path = "/v1/escape-room/create", consumes = "application/json", produces = "application/json")
    public EscapeRoom createEscapeRoom(@RequestBody EscapeRoom escapeRoom) {
        escapeRoom.setId(idGenerator++);
        escapeRooms.add(escapeRoom);
        return escapeRoom;
    }

    @GetMapping(path="/v1/escape-room/list", produces = "application/json")
    public ArrayList<EscapeRoom> listEscapeRooms(){
        return escapeRooms;
    }
}
