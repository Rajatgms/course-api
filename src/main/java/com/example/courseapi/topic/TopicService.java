package com.example.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("1", "TopicName1", "TopicDescription1"),
                    new Topic("2", "TopicName2", "TopicDescription2")
            )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

}
