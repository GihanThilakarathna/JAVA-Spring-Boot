package com.newmanagement.MTIT05.CustomerFeedback.feedbackController;

import com.newmanagement.MTIT05.CustomerFeedback.Service.FeedbackServiceImp;
import com.newmanagement.MTIT05.CustomerFeedback.dto.FeedbackRequest;
import com.newmanagement.MTIT05.CustomerFeedback.dto.FeedbackResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/feedbacks")
public class Controller {
    @Autowired
    private FeedbackServiceImp feedbackServiceImp;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    FeedbackResponse createFeedback(@RequestBody FeedbackRequest request) {
        System.out.println("Feedback Description :" + request);
        return feedbackServiceImp.createFeedback(request);

    }


}
