package com.tardy.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.tardy.web.common.lambda.IFunction;
import com.tardy.web.common.lambda.ISupplier;
import com.tardy.web.domain.MeetingDTO;
import com.tardy.web.entities.MeetingRoom;
import com.tardy.web.repositories.MeetingRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    @Autowired ModelMapper modelMapper;
    
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

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
        // entity.setProfilepic(dto.getProfilepic());
        // entity.setPersonal(dto.getPersonal());
        entity.setProfilepic("사진");
        entity.setPersonal("공개");
        System.out.println("엔티티로 바뀐 정보 : " + entity.toString());

        meetingRepository.save(entity);


        map.put("result", "SUCCESS");
        return map;
    }
    @DeleteMapping("/list/{id}")
    public void    deleteById(@PathVariable Long id){
        System.out.println("deleteById" + id);
        meetingRepository.deleteById(id);
    }
    // //모임방 수정
    @PutMapping("/{id}")
    public HashMap<String,String> update(@PathVariable String id,@RequestBody MeetingDTO dto){
        System.out.println("dd");
        System.out.println("수정하기" + dto.toString());

        HashMap<String, String> map = new HashMap<>();
        MeetingRoom entity = meetingRepository.findById(Long.parseLong(id)).get();
        entity.setMeettingname(dto.getMeettingname());
        entity.setMember(dto.getMember());
        entity.setMeetingcontent(dto.getMeetingcontent());
        entity.setMeetingtime(dto.getMeetingtime());
        entity.setMeetinglocation(dto.getMeetinglocation());
        entity.setLatepenalty(dto.getLatepenalty());
        meetingRepository.save(entity);
        map.put("result", "SUCCESS");
        return map;
    }

    
    //모임방 읽기
    @GetMapping("/list")
    public List<MeetingDTO> selectList(){
       System.out.println("리스트 출력 메소드");
       Iterable<MeetingRoom> board = meetingRepository.findAll();
       List<MeetingDTO> list = new ArrayList<>();
       for (MeetingRoom s : board){
        MeetingDTO bo = modelMapper.map(s, MeetingDTO.class);
           list.add(bo);
       }
       System.out.println(list);
       return list;
   }

}