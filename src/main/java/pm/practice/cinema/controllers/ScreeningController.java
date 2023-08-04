package pm.practice.cinema.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pm.practice.cinema.dto.incoming.ScreeningCommand;
import pm.practice.cinema.services.ScreeningService;

@RestController
@RequestMapping("/api/screenings")
public class ScreeningController {

    private ScreeningService screeningService;

    public ScreeningController(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }

    @PostMapping
    public ResponseEntity addScreening(@RequestBody ScreeningCommand command){
        screeningService.addScreening(command);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}
