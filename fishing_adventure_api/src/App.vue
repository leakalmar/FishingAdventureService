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

.btn-outline-primary {
  color: white !important;
  border-color: white !important;
}

.btn-outline-primary:hover {
  color: black !important;
  border-color: black !important;
  background-color: white !important;
}

.btn-outline-primary:focus-visible,
.btn-outline-primary:focus {
  box-shadow: 0 0 0 0.25rem rgba(255, 255, 255, 0.575) !important;
}

h1 {
  color: #0b4f6e;
}

p {
  color: white;
}

h6 {
  color: white;
}
</style>
