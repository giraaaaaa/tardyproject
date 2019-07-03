<template>
  <!-- header -->
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
            <li class="breadcrumb-item">
              <a href="index.html">Home</a>
            </li>
            <li class="breadcrumb-item" aria-current="page">모임방 수정</li>
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
            <label for="people">모임 이름</label>
            <textarea class="form-control" rows="1" cols="80" name="subject" style="overflow:hidden" v-model="meettingname">
            </textarea>
          </div>
          <div class="form-group">
            <label for="people">인 원</label>
            <textarea class="form-control" rows="1" cols="80" name="subject" style="overflow:hidden" v-model="member">
            </textarea>
          </div>
          <div class="form-group">
            <label for="explain">모임 설명</label>
            <textarea class="form-control" rows="1" cols="80" name="subject" style="overflow:hidden" v-model="meetingcontent">
            </textarea>

          </div>
          <div class="form-group">
            <label for="choosetime">시간</label>
            <textarea class="form-control" rows="1" cols="80" name="subject" style="overflow:hidden" v-model="meetingtime">
            </textarea>

          </div>
          <div class="form-group">
            <label for="place">장소</label>
            <textarea class="form-control" rows="1" cols="80" name="subject" style="overflow:hidden" v-model="meetinglocation">
            </textarea>

          </div>
          <!-- <div class="form-group">
            <label for="category">카테고리</label>
          </div> -->
          <div class="form-group">
            <label for="latepenalty">지각비용</label>
             <textarea class="form-control" rows="1" cols="80" name="subject" style="overflow:hidden" v-model="latepenalty">
            </textarea>
          </div>
          <!-- <div class="form-group">
            <label for="tardyCash">썸네일 사진첨부</label>
          </div>
          <div class="form-group">
            비공개 <input type="checkbox" id="secret" class="form-check-label">
          </div> -->
          <router-link class="btn btn-outline-secondary btn-sm" to="/GroupRoom" style="float:left">확인</router-link>
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
  import {
    store
  } from '../../store'

  export default {
    data() {
      return {
        meettingname: store.state.meettingname,
        member: store.state.member,
        meetingcontent: store.state.meetingcontent,
        meetingtime: store.state.meetingtime,
        meetinglocation: store.state.meetinglocation,
        latepenalty: store.state.latepenalty
      }
    },
    components: {
      CopyRight,
      HeaderComponent,
      MoveTop
    },

    methods: {

    }


  }

</script>



<style scoped>
  /* header{background:black;} */

</style>
