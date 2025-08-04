package com.example.aichatbot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.json.JSONArray;
import org.json.JSONObject;

@Service
public class OpenAiService {

    private final String OPENAI_API_KEY = "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";
    private final String OPENAI_URL = "https://api.openai.com/v1/chat/completions";

    public String getAnswer(String question) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(OPENAI_API_KEY);

        JSONObject message = new JSONObject();
        message.put("role", "user");
        message.put("content", question);

        JSONArray messages = new JSONArray();
        messages.put(message);

        JSONObject request = new JSONObject();
        request.put("model", "gpt-3.5-turbo");
        request.put("messages", messages);

        HttpEntity<String> entity = new HttpEntity<>(request.toString(), headers);

        ResponseEntity<String> response  = restTemplate.postForEntity(OPENAI_URL, entity, String.class);

        JSONObject responseObject = new JSONObject(response.getBody());
        return responseObject.getJSONArray("choices")
                .getJSONObject(0)
                .getJSONObject("message")
                .getString("content")
                .trim();
    }
}
