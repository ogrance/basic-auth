package org.green.basic;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/access")
public class RestApiController {

    @PostMapping("/restricted")
    public String authenticated(@RequestBody Map<String, String> values) {
        return "Success! restricted.";
    }


    @PostMapping("/permitted")
    public String permitted(@RequestBody Map<String, String> values) {
        return "Success! permitted.";
    }
}

