package uk.co.mo.oidcresource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MeController {

    @GetMapping("/meresource")
    public ResponseEntity<Principal> get(Principal principal) {
        return ResponseEntity.ok(principal);
    }
}
