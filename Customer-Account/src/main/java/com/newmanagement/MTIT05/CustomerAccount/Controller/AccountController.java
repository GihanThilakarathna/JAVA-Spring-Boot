package com.newmanagement.MTIT05.CustomerAccount.Controller;

import com.newmanagement.MTIT05.CustomerAccount.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class AccountController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    UserResponse createUser(@RequestBody UserResponse userRequest) {

        System.out.println("User Details: " + userRequest);

        UserResponse userResponse = new UserResponse();
        userResponse.setUserId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully Create User");
        return userResponse;

    }


}
