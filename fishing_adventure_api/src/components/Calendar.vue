<template>
  <div class="card bg-dark text-white" style="margin: 5% 15%">
    <FullCalendar :options="calendarOptions" />
  </div>
</template>
<script>
import "@fullcalendar/core/vdom"; // solves problem with Vite
import FullCalendar from "@fullcalendar/vue3";
import dayGridPlugin from "@fullcalendar/daygrid";
import timeGridPlugin from "@fullcalendar/timegrid";

export default {
  components: {
    FullCalendar, // make the <FullCalendar> tag available
  },
  data() {
    return {
      calendarOptions: {
        plugins: [dayGridPlugin, timeGridPlugin],
        initialDate: "2021-12-05",
        headerToolbar: {
          left: "prev,next today",
          center: "title",
          right: "dayGridMonth,timeGridWeek,timeGridDay",
        },
        editable: true,
        selectable: true,
        selectMirror: true,
        dayMaxEvents: true,
        initialView: "dayGridMonth",
        dateClick: this.handleDateClick,
        events: [
          {
            id: 2,
            title: "Villa Madam",
            start: "2021-12-07",
            end: "2021-12-10",
          },
          {
            id: 5,
            title: "Villa Madam",
            start: "2021-12-11",
            end: "2021-12-13",
          },
        ],
      },
    };
  },
  methods: {
    handleDateClick: function (arg) {
      alert("date click! " + arg.dateStr);
    },
  },
};
</script>
<style scoped></style>
