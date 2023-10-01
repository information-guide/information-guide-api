package com.pun.jol.dataaccess.dto;

import com.pun.jol.dataaccess.entity.Information;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class InformationDto {
    private String topicName;
    private List<Information> informations;
}
