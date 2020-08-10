package nl.qien.bellepractice;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/test")
    public class TestController {


        @GetMapping("/all")
        public String getTest() {
//            throw new NullPointerException();
            return "aliens! run!";
        }

        @PostMapping("/add")
        public Task postTask(@RequestBody Task task) {
            return task;
        }
    }