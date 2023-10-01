package com.pun.jol.dataaccess.service;

import com.pun.jol.dataaccess.dto.InformationDto;
import com.pun.jol.dataaccess.entity.Information;
import com.pun.jol.dataaccess.entity.Topic;
import com.pun.jol.dataaccess.repository.InformationRepository;
import com.pun.jol.dataaccess.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformationService {
    @Autowired private InformationRepository repository;
    @Autowired private TopicRepository topicRepository;
    @Autowired private InformationDto informationDto;

    public Information saveInformation(Information information) {
        return repository.save(information);
    }

    public List<Information> getAllInformation() {
        return repository.findAll();
    }

    public InformationDto getAllInformationByTopic(int topicId) {
        Topic topic = topicRepository.findByCode(topicId);
        List<Information> allInformation = repository.findByTopicId(topicId);
        informationDto.setTopicName(topic.getName());
        informationDto.setInformations(allInformation);
        return informationDto;
    }

    public void deleteInformationById(long id) {
        repository.deleteById(id);
    }

    public void updateInformationById(Information information) {
        Optional<Information> info = repository.findById(information.getId());
        if (info.isPresent()) {
            Information updatedInformation = info.get();
            updatedInformation.setQuestion(information.getQuestion());
            updatedInformation.setTopicId(information.getTopicId());
            updatedInformation.setAnswer(information.getAnswer());
            repository.save(updatedInformation);
        }
    }
}
