
package com.example.aichatbot.repository;

import com.example.aichatbot.model.ChatLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatLogRepository extends JpaRepository<ChatLog, Long> {}
