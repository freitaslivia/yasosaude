package br.com.api.yaso.controller;

import br.com.api.yaso.model.Subscriber;
import br.com.api.yaso.repository.SubscriberRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/subscriber")
@Tag(name = "api-subscriber")
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @Operation(summary = "Criando um novo inscrito")
    @PostMapping
    public ResponseEntity<Subscriber> createSubscriber(@RequestBody @Valid Subscriber subscriber) {
        Subscriber savedSubscriber = subscriberRepository.save(subscriber);
        return new ResponseEntity<>(savedSubscriber, HttpStatus.CREATED);
    }

}
