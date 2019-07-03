<template>
  <!-- header -->
  <div>
    <HeaderComponent></HeaderComponent>
    inner-banner
    <section class="inner-banner" id="home">
      <div class="inner-layer">
        <div class="container">
        </div>
      </div>
    </section>
    <!-- //inner-banner -->
    <br>
    <div class="breadcrumb-w3pvt">
      <div class="container">
        <nav aria-label="breadcrumb">
          <ol class="breadcrumb">
            <li class="breadcrumb-item">
              <a href="/GroupRoom">Home</a>
            </li>
            <li class="breadcrumb-item" aria-current="page">Meeting</li>
          </ol>
        </nav>
      </div>
    </div>

    <br>
    <br>
    <div>
      <div class="container">
        <form>
           
     

          <div class="form-group">
            <label for="meettingname" >모임 이름 : {{this.$store.state.meettingname}} </label>
          </div>
          <div class="form-group">
            <label for="member">인 원 : {{this.$store.state.member}} </label>

          </div>
          <div class="form-group">
            <label for="meetingcontent">모임 설명 : {{this.$store.state.meetingcontent}}</label>
          </div>
          <div class="form-group">
            <label for="meetingtime">시간 :  {{this.$store.state.meetingtime}}</label>
            
            
          </div>
          <div class="form-group">
            <label for="meetinglocation">장소 :  {{this.$store.state.meetinglocation}}</label>

          </div>

          <div class="form-group">
            <label for="latepenalty">지각비용 :  {{this.$store.state.latepenalty}}</label>

          </div>
          <!-- <div class="form-group">
            <label for="profilepic">모임 프로필 사진첨부</label>
            <input type="text" class="form-control" id="explain" v-model="profilepic" placeholder="사진을 입력해주세요.">

          </div> -->
          <!-- <div class="form-group">
            <label for="personal">공개여부</label>
            <input type="radio" name="personal" value="HTML" id="1">공개
            <input type="radio" name="personal" value="HTML" id="2">비공개
          </div> -->
          <router-link class="btn btn-outline-secondary btn-sm" to="/GroupRoom">확인</router-link>
          <router-link class="btn btn-outline-secondary btn-sm" to="/ModifyMeeting">수정</router-link>
          <input type="button" style="float:none" class="btn btn-outline-secondary btn-sm" value="삭제">

        </form>
      </div>
      <br>
      <br>
      <br>
      <br>
    </div>
    <CopyRight></CopyRight>
    <MoveTop></MoveTop>
  </div>
</template>

<script>
  import CopyRight from "@/components/common/CopyRight/"
  import HeaderComponent from "@/components/common/HeaderComponent/"
  import MoveTop from "@/components/common/MoveTop/"
  import GroupRoom from "@/components/pages/GroupRoom"
  import axios from 'axios'
  import {store} from '../../store'
  export default {

    data() {
      return {
        context : 'http://localhost:9000/meetings',
        meettingname: '',
        member: '',
        meetingcontent: '',
        meetingtime: '',
        meetinglocation: '',
        latepenalty: '',
        meetinglist:[]
        // profilepic: 'def',
        // personal: 'open'
        
      }
    },
    created() {
          axios.get(`${this.context}/list`).then((response) => {
              console.log(response);
              if (response.status == 200) {
                this.meetinglist = response.data;
                // store.state.id = response.date;
              }
          });
        },
    components: {
      CopyRight,
      HeaderComponent,
      MoveTop
    },
    methods: {
      num(){
        let number = this.$store.state.id;
      },
        
      // addSubmit() {
      //       // make ajax request and pass the data. I'm not certain how to do it with axios but something along the lines of this
      //       axios.post('/list', {
      //         meettingname : this.meetingname,
      //         member : this.member,
      //         meetingcontent : this.meetingcontent,
      //         meetingtime : this.meetingtime,
      //         meetinglocation : this.meetinglocation,
      //         latepenalty : this.latepenalty
      //       })},
      // save(e) {
       
      //   let data = {
      //     meettingname: this.meettingname,
      //     member: this.member,
      //     meetingcontent: this.meetingcontent,
      //     meetingtime: this.meetingtime,
      //     meetinglocation: this.meetinglocation,
      //     latepenalty: this.latepenalty,
      //     // profilepic: this.profilepic,
      //     // personal: this.personal
      //   }
      //   alert(data.meettingname)
      //   // alert(data.personal)
      //   let headers = {
      //    'Content-Type': 'application/json',
      //    'Authorization' : 'JWT fefege..'
      //   }
      //   e.preventDefault();
      //   axios.post(`${this.context}`,
      //             JSON.stringify(data),
      //             {headers: headers})
      //     .then(res=>{
      //       alert(`SUCCESS2 : ${res.data}`)
      //       location.href="/GroupRoom";            
      //     })
      //     .catch(e=>{
      //       alert('ERROR')
      //     })
      // }


    }
  }
</script>



<style scoped>
  /* header{background:black;} */

</style>
