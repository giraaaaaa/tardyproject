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
    <br><br>
    <form>
      <div class="form-group" style="text-align: center">
        <label for="place">
          <h3>모임방 개설이 완료되었습니다.</h3>
          <h3>http://localhost:8080/MakeMeetingDone#</h3>
          <button type="button" class="btn btn-success">복사하기</button>

        </label>
      </div>
    </form>

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
      return {}
    },
    components: {
      CopyRight,
      HeaderComponent,
      MoveTop
    }



  }

</script>



<style scoped>
</style>
