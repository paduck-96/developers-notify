package com.developers.notify.developers.service;

import com.developers.notify.developers.entity.Subscription;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.List;
;

public interface SubscribeService {
    public void mentorPublishMessage(String mentorName, String message);
    public SseEmitter subscribeMentorAndMessage(String mentorName, String userName);
    public void unsubscribeMentor(String mentorName, String userName);
    ///
    public List<Subscription> getAllSubscriptions(String userName);
    public List<String> getUserList(String mentorName);
    public void saveSubscription(String userName, String mentorName);

    public void deleteSubscription(String userName, String mentorName);
}
