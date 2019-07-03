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
            <li class="breadcrumb-item" aria-current="page">모임방 개설</li>
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
            <label for="meettingname">모임 이름</label>
            <input type="text" class="form-control" id="meettingname" aria-describedby="meettingname" v-model="meettingname"
              placeholder="이름을 입력해주세요.">
            <small id="meettingname" class="form-text text-muted"></small>
          </div>
          <div class="form-group">
            <label for="member">인 원</label>
            <input type="text" class="form-control" id="member" aria-describedby="member" v-model="member" placeholder="인원을 입력해주세요.">

          </div>
          <div class="form-group">
            <label for="meetingcontent">모임 설명</label>
            <input type="text" class="form-control" id="explain" v-model="meetingcontent" placeholder="내용을 입력해주세요.">
          </div>
          <div class="form-group">
            <label for="meetingtime">시간</label>
            <input type="text" class="form-control" id="explain" v-model="meetingtime" placeholder="시간을 입력해주세요.">

          </div>
          <div class="form-group">
            <label for="meetinglocation">장소</label>
            <input type="text" class="form-control" id="explain" v-model="meetinglocation" placeholder="장소를 입력해주세요.">

          </div>

          <div class="form-group">
            <label for="latepenalty">지각비용</label>
            <input type="text" class="form-control" id="explain" v-model="latepenalty" placeholder="지각비용을 입력해주세요.">

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
          <button @click="save" class="btn btn-outline-secondary btn-sm"  style="float:left" >확인
          </button>
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
  import axios from 'axios'

  export default {
   
    data() {
      return {
        context : 'http://localhost:9000/meetings',
        meettingname: '',
        member: '',
        meetingcontent: '',
        meetingtime: '',
        meetinglocation: '',
        latepenalty: ''
        // profilepic: 'def',
        // personal: 'open'
      }
    },

    components: {
      CopyRight,
      HeaderComponent,
      MoveTop
    },
    methods: {
      // sad(e){
      //   meettingname = this.meetingname,
      //   member = this.member,
      //   meetingcontent = this.meetingcontent,
      //   meetingtime = this.meetingtime,
      //   meetinglocation = this.meetinglocation,
      //   latepenalty = this.latepenalty,
      //   profilepic = 'def',
      //   personal = "open"
      // },
      save(e) {
       
        let data = {
          meettingname: this.meettingname,
          member: this.member,
          meetingcontent: this.meetingcontent,
          meetingtime: this.meetingtime,
          meetinglocation: this.meetinglocation,
          latepenalty: this.latepenalty,
          // profilepic: this.profilepic,
          // personal: this.personal
        }
        alert(data.meettingname)
        // alert(data.personal)
        let headers = {
         'Content-Type': 'application/json',
         'Authorization' : 'JWT fefege..'
        }
        e.preventDefault();
        axios.post(`${this.context}`,
                  JSON.stringify(data),
                  {headers: headers})
          .then(res=>{
            alert(`SUCCESS2 : ${res.data}`)
            location.href="/GroupRoom";            
          })
          .catch(e=>{
            alert('ERROR')
          })
      }


    }
  }
</script>



<style scoped>
  /* header{background:black;} */

</style>
