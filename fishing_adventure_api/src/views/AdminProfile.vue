<template>
  <div>
    <UserInfo></UserInfo>
    <StatisticsHomeOwner></StatisticsHomeOwner>
  </div>
</template>

<script>
import UserInfo from "@/components/UserProfile/UserInfo.vue";
import StatisticsHomeOwner from "@/components/UserProfile/StatisticsHomeOwner.vue";
export default {
  components: { UserInfo, StatisticsHomeOwner },
};
</script>

<style scoped></style>
