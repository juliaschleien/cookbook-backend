package julia.schleien.Cookbook.controller;

import julia.schleien.Cookbook.model.InformationEntity;
import julia.schleien.Cookbook.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

/**
 * @author Julia Schleien
 * @version 1.0
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/information")
public class InformationController {

    @Autowired
    private InformationFindAllService informationFindAllService;

    @Autowired
    private InformationFindByIdService informationFindByIdService;

    @Autowired
    private InformationSaveService informationSaveService;

    @Autowired
    private InformationUpdateService informationUpdateService;

    @Autowired
    private InformationDeleteService informationDeleteService;

    @GetMapping
    public ResponseEntity<List<InformationEntity>> findAll() {
        return new ResponseEntity<>(
                this.informationFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<InformationEntity> findById(@PathVariable("id") long id) {
        InformationEntity informationEntity = this.informationFindByIdService.findById(id);
        if (Objects.nonNull(informationEntity)) {
            return new ResponseEntity<>(
                    informationEntity,
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<InformationEntity> save(@Valid @RequestBody InformationEntity informationEntity) {
        return new ResponseEntity<>(
                this.informationSaveService.save(informationEntity),
                new HttpHeaders(),
                HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<InformationEntity> update(@RequestBody InformationEntity informationEntity) {

        return new ResponseEntity<>(
                this.informationUpdateService.update(informationEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<InformationEntity> delete(@PathVariable("id") long id) {
        this.informationDeleteService.delete(id);
        return new ResponseEntity<>(
                new HttpHeaders(),
                HttpStatus.OK);
    }
}
