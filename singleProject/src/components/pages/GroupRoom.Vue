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
            <li class="breadcrumb-item">
              <a href="index.html">Home</a>
            </li>
            <li class="breadcrumb-item" aria-current="page">모임방</li>
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
            <th style="width:15%">선택</th>

          </tr>
        </thead>
        <tbody>
          <tr>
            <th>4</th>
            <td>액트액트 리액트</td>
            <td>19/06/29 4:30</td>
            <td>종각역 YMCA 7층</td>
            <router-link class="btn btn-outline-secondary btn-sm" to="/ModifyMeeting">수정</router-link>
            <input type="button" style="float:none" class="btn btn-outline-secondary btn-sm" value="삭제">
          </tr>
          <tr>
            <th>3</th>
            <td>액트액트 리액트</td>
            <td>19/06/29 4:30</td>
            <td>종각역 YMCA 7층</td>
            <router-link class="btn btn-outline-secondary btn-sm" to="/ModifyMeeting">수정</router-link>
            <input type="button" style="float:none" class="btn btn-outline-secondary btn-sm" value="삭제">
          </tr>
          <tr>
            <th>2</th>
            <td>스프링 부트</td>
            <td>19/06/29 4:30</td>
            <td>종각역 YMCA 7층</td>
            <router-link class="btn btn-outline-secondary btn-sm" to="/ModifyMeeting">수정</router-link>
            <input type="button" style="float:none" class="btn btn-outline-secondary btn-sm" value="삭제">

          </tr>
          <tr>
            <th>1</th>
            <td>자바 스크립트</td>
            <td>19/06/29 4:30</td>
            <td>종각역 YMCA 7층</td>
            <router-link class="btn btn-outline-secondary btn-sm" to="/ModifyMeeting">수정</router-link>
            <input type="button" style="float:none" class="btn btn-outline-secondary btn-sm" value="삭제">
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
  export default {


    data() {
      return {
      }
    },
    components: {
      HeaderComponent,
      CopyRight,
      MoveTop
    },
    methods: {
      // (){}
    }
  }

</script>


<style scoped>
  /* header{background:black;} */

</style>
