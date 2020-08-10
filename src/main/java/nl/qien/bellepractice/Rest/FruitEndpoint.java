package nl.qien.bellepractice.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fruit")
public class FruitEndpoint {
    @GetMapping("/mango")
    public String getFruitString() {
        return "mango is the king of fruits";
    }
}