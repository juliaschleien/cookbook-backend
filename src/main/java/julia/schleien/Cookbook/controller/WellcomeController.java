package julia.schleien.Cookbook.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Julia Schleien
 * @version 1.0
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WellcomeController {

    @RequestMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<String>("Wellcome Server!", new HttpHeaders(), HttpStatus.CREATED);
    }

}
