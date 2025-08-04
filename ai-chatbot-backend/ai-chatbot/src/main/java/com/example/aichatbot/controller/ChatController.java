
package com.example.aichatbot.controller;

import com.example.aichatbot.service.OpenAiService;
import com.example.aichatbot.model.ChatLog;
import com.example.aichatbot.repository.ChatLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private OpenAiService openAiService;

    @Autowired
        private ChatLogRepository chatLogRepository;

    @PostMapping
    public String askQuestion(@RequestBody String question) {
        String answer = openAiService.getAnswer(question);
        chatLogRepository.save(new ChatLog(question, answer));
        return answer;
    }
}
