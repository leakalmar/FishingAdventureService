import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'
import Datepicker from 'vue3-date-time-picker';
import 'vue3-date-time-picker/dist/main.css';
import VCalendar from 'v-calendar';
import VueGoogleMaps from '@fawmi/vue-google-maps';
import Toaster from '@meforma/vue-toaster';
createApp(App).use(VueGoogleMaps, {
    load: {
        key: 'AIzaSyDS-rs0HVP_awX2aP1u49VhJzJcL_K3lko',
        libraries: ["places"],
        language: 'en',
    }
}).use(VueAxios, axios).use(router).use(VCalendar, { componentPrefix: 'vc' }).component('Datepicker', Datepicker).use(Toaster, {
    position: 'bottom'
}).mount('#app')