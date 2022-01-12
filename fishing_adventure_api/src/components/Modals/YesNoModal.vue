<template>
  <div
    class="modal fade dark"
    id="YesNoModal"
    aria-labelledby="YesNoModalLabel"
    aria-hidden="true"
    data-bs-backdrop="static"
    data-bs-keyboard="false"
  >
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content" style="height: auto">
        <div
          class="modal-body"
          style="text-align: center; padding: 2rem 0px; color: white"
        >
          <h2>{{ question }}</h2>
        </div>

        <div class="modal-footer">
          <button
            type="button"
            style="width: 4rem"
            class="btn btn-outline-primary"
            v-on:click="this.$emit('answer', 'yes')"
            data-bs-dismiss="modal"
          >
            Yes
          </button>
          <button
            type="button"
            style="width: 4rem"
            class="btn btn-outline-primary"
            v-on:click="this.$emit('answer', 'no')"
            data-bs-dismiss="modal"
          >
            No
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  components: {},
  name: "YesNoModal",
  props: ["question"],
};
</script>

<style scoped src="@/css/newCottageModal.css"></style>
