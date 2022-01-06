package com.newmanagement.MTIT05.CustomerFeedback.Service;

import com.newmanagement.MTIT05.CustomerFeedback.dto.CreateUserRequest;
import com.newmanagement.MTIT05.CustomerFeedback.dto.CreateUserResponse;
import com.newmanagement.MTIT05.CustomerFeedback.dto.FeedbackRequest;
import com.newmanagement.MTIT05.CustomerFeedback.dto.FeedbackResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class FeedbackServiceImp {
    @Autowired
    private RestTemplate restTemplate;

    public FeedbackResponse createFeedback(FeedbackRequest feedbackRequest){

        var userCreationRequest= new CreateUserRequest();
        userCreationRequest.setCustomerItem(feedbackRequest.getCustomerItem());
        userCreationRequest.setCustomerName(feedbackRequest.getCustomerName());
        ResponseEntity<CreateUserResponse> createUserResponse =  restTemplate.postForEntity("http://localhost:8080/users",userCreationRequest, CreateUserResponse.class);

        var feedbackResponse = new FeedbackResponse();
        feedbackResponse.setFeedbackId(UUID.randomUUID().toString());
        feedbackResponse.setUserId(createUserResponse.getBody().getUserId());
        feedbackResponse.setMessage("Successfully create the feedback");

        return  feedbackResponse;

    }

    @Bean
    public RestTemplate  restTemplate(RestTemplateBuilder builder){
        return  builder.build();
    }


}
