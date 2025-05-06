package com.umsl.course_service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InstructorEventListener {

    @KafkaListener(topics = "instructor-events", groupId = "course-group")
    public void onMessage(String message) {
        System.out.println("▶️  course‑service received instructor event → " + message);
    }
}
