package com.tardy.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * MeetingDTO
 */
@Data
@Component
@Lazy
public class MeetingDTO {
    private String id,
                meettingname,
                member,
                meetingcontent,
                meetingtime,
                meetinglocation,
                latepenalty,
                profilepic,
                personal;
    
}