<template>
  <nav-bar></nav-bar>
  <!-- <div id="nav">
    <router-link to="/">Home</router-link> |
    <router-link to="/about">About</router-link> |
    <router-link to="/profile">Profile</router-link>
  </div> -->
  <router-view />
  <div class="container"></div>
</template>

<script>
import NavBar from "@/components/NavBar.vue";
export default {
  components: { "nav-bar": NavBar },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  overflow-x: hidden;
}

h1 {
  color: #0b4f6e;
}

p {
  color: white;
}
</style>
