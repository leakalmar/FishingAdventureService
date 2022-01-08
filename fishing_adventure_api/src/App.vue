<template>
  <NavBar></NavBar>
  <router-view />
  <Footer></Footer>
</template>

<script>
import NavBar from "@/components/Utils/NavBar.vue";
import Footer from "@/components/Utils/Footer.vue";
export default {
  components: {
    NavBar,
    Footer,
  },
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

::-webkit-scrollbar {
  width: 10px;
}

::-webkit-scrollbar-track {
  border-radius: 5px;
  box-shadow: inset 0 0 10px rgba(0, 0, 0, 0.25);
}

::-webkit-scrollbar-thumb {
  background-color: rgba(44, 53, 63, 1);
  box-shadow: inset 0 0 10px rgba(255, 255, 255, 0.25);
}

::-webkit-scrollbar-thumb:hover {
  background-color: rgba(255, 255, 255, 0.493);
  box-shadow: inset 0 0 10px rgba(0, 0, 0, 0.315);
}

.btn-primary:hover {
  box-shadow: 3px 5px 0px 0px rgb(22 20 20 / 66%) !important;
  transition: 0.5s;
}
</style>
