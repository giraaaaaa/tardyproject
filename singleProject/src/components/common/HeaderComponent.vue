<template>
  <header>
    <div class="container">
      <!-- nav -->
      <nav class="py-3 d-lg-flex">
        <div id="logo">
          <h1> <a href="#"><span class="fa fa-university"></span> TardyGram</a></h1>
        </div>
        <label for="drop" class="toggle"><span class="fa fa-bars"></span></label>
        <input type="checkbox" id="drop" />
        <ul class="menu ml-auto mt-1">
          <li class="active"><a href="#">Menu1</a></li>
          <li class=""><a href="#">Menu2</a></li>
          <li class=""><a href="#">Menu3</a></li>
          <li class=""><a href="#">Menu4</a></li>
          <li class="last-grid">
            <router-link to="/GroupRoom">모임방</router-link>
          </li>
        </ul>
      </nav>
      <!-- //nav -->
    </div>
  </header>
</template>
<script>
  export default {
    data() {
      return {
        
      }
    },

    methods: {
      // (){}
    }
  }

</script>
