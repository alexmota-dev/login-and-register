package alexcode.security.eccomerce.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teste-controller")
public class TestController {

    @GetMapping
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Um teste para um endpoint com segurança");
    }
}
