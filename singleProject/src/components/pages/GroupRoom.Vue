<template>
  <div>
    <HeaderComponent></HeaderComponent>
    <!-- inner-banner -->
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
            <li class="breadcrumb-item active" aria-current="page">Home</li>
          </ol>
        </nav>
      </div>
    </div>
    <br>
    <br>
    <div class="container" style="text-align: center">

      <div class="row">
        <!-- <img class="card-img-top" src="..." alt="Card image cap"> -->
        <div class="col">
          <div class="card-body">
            <h5 class="card-title">박강사님과 함께하는 취업스터디</h5>
            <p class="card-text">Mama, just killed a man
              Put a gun against his head
              Pulled my trigger, now he's dead
              Mama, life had just begun
              But now I've gone and thrown it all away
              Mama, oh oh
              Didn't mean to make you cry
              If I'm not back again this time tomorrow
              Carry on, carry on, as if nothing really matters
            </p>

            <!-- <a href="#" class="btn btn-primary">Go somewhere</a> -->
          </div>
        </div>
        <div class="col">

          <div class="card-body">
            <h5 class="card-title">현재인원</h5>
            <img src="../../../static/images/1oneyoung.png" class="rounded-circle" alt="Cinque Terre">
            <img src="../../../static/images/2oneyoung.png" class="rounded-circle" alt="Cinque Terre">
            <img src="../../../static/images/3oneyoung.png" class="rounded-circle" alt="Cinque Terre">
            <br><br>

            <a href="#" class="btn btn-primary">더 보기</a>
          </div>
        </div>

      </div>

      <br><br><br>
      <table class="table">
        <thead>
          <tr>
            <th style="width:10%">no</th>
            <th style="width:20%">스케쥴명</th>
            <th style="width:15%">시간</th>
            <th style="width:15%">장소</th>
            <!-- <th style="width:15%">선택</th> -->

          </tr>
        </thead>
        <tbody>
            <tr v-for="item in meetinglist" v-bind:key="item">
                <td>{{item.id}}</td>
                <!-- <td><router-link @click="move(item)" to="/Meeting">{{item.meettingname}}</router-link></td> -->
                <td><a @click="move(item)">{{item.meettingname}}</a></td>
                <td>{{item.meetingtime}}</td>
                <td>{{item.meetinglocation}}</td>
            </tr>



          
        </tbody>
      </table>
      <router-link class="btn btn-outline-secondary btn-sm" to="/MakeMeeting" style="float:right">글쓰기</router-link>



    </div>
    <br>
    <br>
    <br>
    <br>
    <CopyRight></CopyRight>
    <MoveTop></MoveTop>

  </div>
</template>

<script>
  import CopyRight from "@/components/common/CopyRight/"
  import HeaderComponent from "@/components/common/HeaderComponent/"
  import MoveTop from "@/components/common/MoveTop/"
  import {store} from '../../store'
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
        latepenalty: '',
        meetinglist:[]
        // profilepic: 'def',
        // personal: 'open'
        
      }
    },
    components: {
      HeaderComponent,
      CopyRight,
      MoveTop
    },
    
    created() {
          axios.get(`${this.context}/list`).then((response) => {
              console.log(response);
              if (response.status == 200) {
                this.meetinglist = response.data;
              }
          });
        },
    methods: {
      move(item){
        store.state.id = item.id;
        store.state.meettingname = item.meettingname;  
        store.state.member = item.member;  
        store.state.meetingcontent = item.meetingcontent;  
        store.state.meetingtime = item.meetingtime;  
        store.state.meetinglocation = item.meetinglocation;  
        store.state.latepenalty = item.latepenalty;  
                alert(store.state.id);
                alert(store.state.meetinglocation);

               this.$router.push('/Meeting');
        },   
       addSubmit() {
            // make ajax request and pass the data. I'm not certain how to do it with axios but something along the lines of this
            axios.post('/list', {
              meettingname : this.meetingname,
              member : this.member,
              meetingcontent : this.meetingcontent,
              meetingtime : this.meetingtime,
              meetinglocation : this.meetinglocation,
              latepenalty : this.latepenalty
            })}
    }
  }

</script>


<style scoped>
  /* header{background:black;} */

</style>
