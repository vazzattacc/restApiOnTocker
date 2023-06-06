package com.vivelibre.vivlibre.api.Controller;

import com.vivelibre.vivlibre.api.Dto.UserDto;
import com.vivelibre.vivlibre.api.Service.TokenService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMessage;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vazgen Smbatyan
 */
@RestController
@RequestMapping()
public class AuthenticationController {

    @Autowired
    TokenService tokenService;
    

    @GetMapping("/test")
    public String getTest() {
        return "hola esto funciona";
    }
    
    @PostMapping("/token")
    public String createToken(@RequestBody UserDto userDto){
            return tokenService.createToken(userDto);
//            return "Token generated successfully";
    }

//    @PostMapping("/token")
//    public String getToken(@RequestBody Map<String, Object> jsonBody) {
//        if (!jsonBody.isEmpty()) {
//            //return TokenService.generateToken(jsonBody);
//            return "Token generated successfully";
//        } else {
//            return String.format("Error: %s", "A error has occured");
//        }
//    }

}
