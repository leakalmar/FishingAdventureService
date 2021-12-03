<template>
  <div>
    <div class="title">
      <h1>Find your perfect vacation</h1>
      <i class="far fa-home fa-3x" style="font-family: 'Font Awesome 5 Pro'"></i
      ><i
        v-if="searching == '' || searching == 'boats'"
        class="far fa-anchor fa-3x"
        style="font-family: 'Font Awesome 5 Pro'"
      ></i>
      <i
        v-if="searching == '' || searching == 'adventures'"
        class="far fa-fish fa-3x"
        style="font-family: 'Font Awesome 5 Pro'"
      ></i>
    </div>
    <div class="input-group pb-3 pt-3" style="background-color: #212529">
      <form class="container">
        <input
          class="form-control me-2"
          type="search"
          placeholder="Search"
          aria-label="Search"
        />
        <Datepicker
          style="width: 100%; margin-right: 10px"
          dark
          id="picker"
          v-model="date"
          range
          :enableTimePicker="false"
        ></Datepicker>
        <div class="input-group">
          <span class="input-group-text">Number of persons</span>
          <input
            type="number"
            min="1"
            max="15"
            v-model="numberOfPersons"
            class="form-control me-2"
          />
        </div>
      </form>
    </div>
    <div v-if="searching == 'cottages'" style="margin-top: 5%">
      <CottageCard v-for="index in 10" :key="index"></CottageCard>
    </div>
  </div>
</template>

<script>
import Datepicker from "vue3-date-time-picker";
import "vue3-date-time-picker/dist/main.css";
import { ref, onMounted } from "vue";
import CottageCard from "@/components/CottageCard.vue";
export default {
  components: { Datepicker, CottageCard },
  setup() {
    const date = ref();

    // For demo purposes assign range from the current date
    onMounted(() => {
      const startDate = new Date();
      const endDate = new Date(new Date().setDate(startDate.getDate() + 7));
      date.value = [startDate, endDate];
    });

    return {
      date,
    };
  },
  data: function () {
    return {
      numberOfPersons: "",
      searching: "",
    };
  },
  mounted: function () {
    if (window.location.href.includes("/search/cottages")) {
      this.searching = "cottages";
    } else if (window.location.href.includes("/search/adventures")) {
      this.searching = "adventures";
    } else if (window.location.href.includes("/search/boats")) {
      this.searching = "boats";
    }
  },
  methods: {},
};
</script>

<style scoped>
.carousel {
  position: relative;
  top: 80%;
  left: 50%;
  transform: translate(-50%, 0%);
  width: 100%;
}

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
.form-control {
  background-color: #393c3f73;
  color: white;
}

.form-control:focus {
  box-shadow: 0 0 0 0.2rem rgba(255, 255, 255, 0.432);
}

.container {
  display: flex;
}

.form-floating > label {
  color: gray;
}

.input-group-text {
  background-color: #393c3f73;
  color: gray;
}
</style>
