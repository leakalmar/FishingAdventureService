<template>
  <div class="title">
    <h1>Cottage occupancy calendar</h1>
  </div>
  <VCalendar></VCalendar>
</template>

<script>
import VCalendar from "@/components/Calendar.vue";
export default {
  components: { VCalendar },
};
</script>

<style scoped>
.title {
  color: white;
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  margin: 5%;
}
h1 {
  color: white !important;
}
</style>
