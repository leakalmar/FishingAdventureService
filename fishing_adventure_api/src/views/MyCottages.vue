<template>
  <div>
    <div class="title">
      <h1>My cottages</h1>
      <i
        class="far fa-home fa-3x"
        style="font-family: 'Font Awesome 5 Pro'"
      ></i>
    </div>
    <div class="input-group pb-3 pt-3" style="background-color: #212529">
      <form class="container" style="display: flex">
        <div class="input-group">
          <input
            class="form-control me-2"
            type="search"
            placeholder="Search"
            aria-label="Search"
          />
          <div style="display: flex">
            <span class="input-group-text">Price</span>
            <input
              class="form-control me-2"
              type="search"
              placeholder="Enter price.."
              aria-label="Enter price.."
            />
          </div>
          <div style="display: flex">
            <span class="input-group-text">Rating</span>
            <div class="rating-div form-control">
              <div class="rating">
                <input type="radio" name="star" id="star1" value="5" />
                <label for="star1"></label>
                <input type="radio" name="star" id="star2" value="4" />
                <label for="star2"></label>
                <input type="radio" name="star" id="star3" value="3" />
                <label for="star3"></label>
                <input type="radio" name="star" id="star4" value="2" />
                <label for="star4"></label>
                <input type="radio" name="star" id="star5" value="1" />
                <label for="star5"></label>
              </div>
            </div>
          </div>
        </div>
      </form>
    </div>
    <div style="margin-top: 5%">
      <CottageCard v-for="index in 10" :key="index"></CottageCard>
    </div>
  </div>
</template>

<script>
import CottageCard from "@/components/CottageCard.vue";
export default {
  components: { CottageCard },
  data: function () {
    return {
      numberOfPersons: "",
    };
  },
  methods: {},
};
</script>

<style scoped src="@/css/mycottages.css"></style>
