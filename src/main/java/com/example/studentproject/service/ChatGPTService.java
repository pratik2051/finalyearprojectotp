package com.example.studentproject.service;

import com.example.studentproject.dto.requests.ChatGPTRequest;
import com.example.studentproject.dto.responses.ChatGPTResponse;
import com.example.studentproject.model.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class ChatGPTService {

    @Value("${openai.api.key}")
    private String apiKey;

    private static final String OPEN_AI_CHAT_ENDPOINT = "https://api.openai.com/v1/engines/gpt-3.5-turbo/completions";

    private final RestTemplate restTemplate;

    public ChatGPTService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ChatGPTResponse getChatGPTResponse(String prompt) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + apiKey);

        ChatGPTRequest chatGPTRequest = new ChatGPTRequest();
        chatGPTRequest.setModel("gpt-3.5-turbo");
        chatGPTRequest.setMessages(Collections.singletonList(new Message("user", prompt)));
        chatGPTRequest.setMax_tokens(20);

        HttpEntity<ChatGPTRequest> requestEntity = new HttpEntity<>(chatGPTRequest, headers);

        try {
            ResponseEntity<ChatGPTResponse> responseEntity = restTemplate.exchange(
                    OPEN_AI_CHAT_ENDPOINT,
                    HttpMethod.POST,
                    requestEntity,
                    ChatGPTResponse.class
            );
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                return responseEntity.getBody();
            } else {
                // Handle unexpected status code or errors
                throw new RuntimeException("Unexpected status code: " + responseEntity.getStatusCode());
            }
        } catch (Exception e) {
            // Handle exceptions here
            throw new RuntimeException("Failed to call OpenAI API: " + e.getMessage(), e);
        }
    }
}