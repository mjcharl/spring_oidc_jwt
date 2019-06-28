package uk.co.mo.oidc;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeController {

    @GetMapping("/me")
    public ResponseEntity<OAuth2AuthenticationToken> get(OAuth2AuthenticationToken token) {
        return ResponseEntity.ok(token);
    }
}
