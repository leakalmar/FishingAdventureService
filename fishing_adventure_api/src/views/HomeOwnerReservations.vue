<template>
  <div>
    <div class="title">
      <h1>My reservations</h1>
      <i
        class="fas fa-id-card fa-3x"
        style="font-family: 'Font Awesome 5 Pro'"
      ></i>
    </div>
    <div class="input-group pb-3 pt-3" style="background-color: #212529">
      <div class="container" style="display: flex">
        <button type="button" class="btn btn-outline-primary text-nowrap me-2">
          New reservation
        </button>
        <div class="input-group">
          <input
            class="form-control me-2"
            type="search"
            placeholder="Search"
            aria-label="Search"
          />
        </div>
        <Datepicker
          style="
            width: 100%;
            margin-right: 10px;
            border: 1px solid white;
            border-radius: 5px;
          "
          dark
          id="picker"
          v-model="date"
          range
          :enableTimePicker="false"
        ></Datepicker>
      </div>
    </div>
    <div style="margin-top: 5%">
      <CottageReservationCard
        v-for="index in 10"
        :key="index"
      ></CottageReservationCard>
    </div>
  </div>
</template>

<script>
import CottageReservationCard from "@/components/CottageReservationCard.vue";
export default {
  components: { CottageReservationCard },
  data: function () {
    return {
      numberOfPersons: "",
    };
  },
  methods: {},
};
</script>

<style scoped src="@/css/mycottages.css"></style>
