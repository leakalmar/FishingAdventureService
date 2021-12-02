import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'
import Datepicker from 'vue3-date-time-picker';
import 'vue3-date-time-picker/dist/main.css'


createApp(App)
    .use(VueAxios, axios)
    .use(router)
    .component('Datepicker', Datepicker)
    .mount('#app')