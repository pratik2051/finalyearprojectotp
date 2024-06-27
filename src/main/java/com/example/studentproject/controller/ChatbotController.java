package com.example.studentproject.controller;

import com.example.studentproject.model.ChatModel;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1/auth/gpt")
public class ChatbotController {
    @PostMapping("/chat")
    public ResponseEntity<String> chat(@RequestBody String message) {
        RestTemplate restTemplate = new RestTemplate();
        // OpenAI URL
        String url = "https://api.openai.com/v1/engines/davinci-codex/completions";
        // Replace 'YOUR-API-KEY' with your OpenAI key
        String apiKey = "my test key YOUR-API-KEY";
        // Create HTTP headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", apiKey);
        // Create an instance of the chat model
        ChatModel chatModel = new ChatModel();
        chatModel.setPrompt(message);
        chatModel.setMaxTokens(100);

        // Make the POST request
        HttpEntity<ChatModel> entity = new HttpEntity<>(chatModel, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        // Return the response entity
        return response;
    }
}