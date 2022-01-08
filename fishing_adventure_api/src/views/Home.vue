<template>
  <div class="d-block">
    <div class="container">
      <span>
        <p id="text1">Welcome to</p>
        <img src="@/assets/logo_white.png" id="text2" />
      </span>
    </div>
  </div>
  <div class="home">
    <HomeComponent />
  </div>
</template>

<script>
import HomeComponent from "@/components/Utils/HomeComponent.vue";

export default {
  name: "Home",
  components: {
    HomeComponent,
  },
};
</script>

<style scoped>
.d-block {
  background-image: linear-gradient(rgba(4, 9, 30, 0), rgba(4, 9, 30, 0.527)),
    url(../assets/b8-crop.jpg);
  background-size: cover;
  height: 70vh;
}

.container {
  position: relative;
  top: 50%;
  left: 50%;
  font-family: "Franklin Gothic Medium", "Arial Narrow", Arial, sans-serif;
  transform: translate(-50%, -50%);
  width: 100%;
  margin: 0;
}

.container span {
  text-transform: uppercase;
  display: block;
  opacity: 0;
  font-weight: 700;
  margin-bottom: 10px;
  position: relative;
  animation: animation1 0.5s ease-out forwards;
}

#text1,
#text2 {
  margin: 0;
  opacity: 0;
}

#text1 {
  color: white;
  letter-spacing: 8px;
  font-size: 20px;
  animation: animation2 0.75s ease-out 0s forwards;
}

#text2 {
  margin-top: 20px;
  width: 50vh;
  animation: animation2 0.75s ease-out 1s forwards;
}
@keyframes animation1 {
  100% {
    opacity: 1;
  }
}

@keyframes animation2 {
  100% {
    opacity: 1;
    transform: scale(1.5);
  }
}
</style>
