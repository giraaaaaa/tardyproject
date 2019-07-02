package com.tardy.web.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
@Setter
@ToString
@Table(name = "MEETINGROOM")
public class MeetingRoom implements Serializable{  //매퍼역할
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private Long id;
   @Column(name="meettingname") private String meettingname;
   @Column(name="member") private String member;
   @Column(name="meetingcontent") private String meetingcontent;
   @Column(name="meetingtime") private String meetingtime;
   @Column(name="meetinglocation") private String meetinglocation;
   @Column(name="latepenalty") private String latepenalty;
   @Column(name="profilepic") private String profilepic;
   @Column(name="personal") private String personal;
    //이름이 같으면 생략가능



   @Override
   public String toString(){
       return String.format("고객정보 No: %d\n"
       +"MEETTINGNAME: %s", id,meettingname
       +"MEMBER: %s",member
       +"MEETINGCONTENT: %s", meetingcontent
       +"MEETINGTIME: %s", meetingtime
       +"MEETINGLOCATION: %s", meetinglocation
       +"LATEPENALTY: %s", latepenalty
       +"PRFILEPIC: %s", profilepic
       +"PERSONAL: %s", personal
       );
   }

   //resultMap이라 생각
   @Builder
   private MeetingRoom(String meettingname,String member,
   String meetingContent,String meetingtime,String meetinglocation,String latepenalty,String profilepic,String  personal){
       this.meettingname = meettingname;
       this.member = member;
       this.meetingcontent = meetingContent;
       this.meetingtime = meetingtime;
       this.meetinglocation = meetinglocation;
       this.latepenalty = latepenalty;
       this.profilepic = profilepic;
       this.personal = personal;
   }


}