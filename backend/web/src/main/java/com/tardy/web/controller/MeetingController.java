package com.tardy.web.controller;

import java.util.HashMap;

import com.tardy.web.common.lambda.IFunction;
import com.tardy.web.common.lambda.ISupplier;
import com.tardy.web.domain.MeetingDTO;
import com.tardy.web.entities.MeetingRoom;
import com.tardy.web.repositories.MeetingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MeetingController
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/meetings")
public class MeetingController {
    @Autowired MeetingDTO meeting;
    @Autowired MeetingRepository meetingRepository;
    

    //모임방 만들기
    @PostMapping("")
    public HashMap<String, String> save(@RequestBody MeetingDTO dto){
        System.out.println("dd");
        System.out.println("방 만들기" + dto.toString());
        HashMap<String, String> map = new HashMap<>();
        MeetingRoom entity = new MeetingRoom();
        // entity.setId(dto.getId());
        entity.setMeettingname(dto.getMeettingname());
        entity.setMember(dto.getMember());
        entity.setMeetingcontent(dto.getMeetingcontent());
        entity.setMeetingtime(dto.getMeetingtime());
        entity.setMeetinglocation(dto.getMeetinglocation());
        entity.setLatepenalty(dto.getLatepenalty());
        entity.setProfilepic(dto.getProfilepic());
        entity.setPersonal(dto.getPersonal());
       
        System.out.println("엔티티로 바뀐 정보 : " + entity.toString());

        


        map.put("result", "SUCCESS");
        return map;
    }
    // //모임방 삭제
    // public void name() {
        
    // }
    // //모임방 수정
    // public void name() {
        
    // }
    // //모임방 읽기
    // public void name() {
        
    // }
}