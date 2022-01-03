<template>
  <div
    class="modal fade dark"
    id="NewCottageModal"
    aria-labelledby="NewCottageModalLabel"
    aria-hidden="true"
    data-bs-backdrop="static"
    data-bs-keyboard="false"
    v-on:show="closeModal"
  >
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="modal-header">
          <h3>
            New reservation
          </h3>
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="modal"
            v-on:click="closeModal"
          >
            <i class="fas fa-times fa-lg"></i>
          </button>
        </div>
        <div class="modal-body" v-if="mode == '1'">
          <h6 style="color: white"><b>Select date range:</b></h6>
          <Datepicker
            style="
              width: 100%;
              margin-right: 10px;
              border: 1px solid white;
              border-radius: 5px;
            "
            dark
            id="picker"
            v-model="dateRange"
            range
            :enableTimePicker="true"
          ></Datepicker>
          
          <textarea
            class="login-inputs-textarea"
            placeholder="Cottage description"
            v-model="numberOfPersons"
          />
          <label class="error" :id="'cottageNameErr' + cottageId" name="labels">
          </label>
        </div>
        
          <button
            type="button"
            class="btn btn-outline-primary"
            v-on:click="createCottage"
            v-if="mode == '6' && cottage == undefined"
          >
            Create
          </button>
          <button
            type="button"
            class="btn btn-outline-primary"
            v-on:click="updateCottage"
            v-if="mode == '6' && cottage != undefined"
          >
            Save
          </button>
        </div>
      </div>
    </div>
</template>

<script>
import axios from "axios";
export default {
  components: {
   
  },
  props: ["cottage", "date", "persons"],
  name: "RegisterModal",
  data: function () {
    return {
      mode: "1",
      cottageName: "",
      cottageDescription: "",
      images: [],
      street: "",
      city: "",
      country: "",
      postal_code: "",
      rooms: [],
      rules: [],
      priceList: [],
      files: "",
      flagRules: true,
      flagRooms: true,
      flagPriceList: true,
      cottageId: undefined,
      dateRange: [],
      numberOfPersons:0,
      lat: "",
      lng: "",
    };
  },
  mounted: function () {
    var element = document.getElementById("logIn-btn");
    element.classList.add("active");
  },
  beforeUpdate:function(){
      //this.dateRange = Date.parse(this.date.split(",")[0]);
      this.dateRange.push(new Date(Date.parse(this.date.split(",")[0])));
      this.dateRange.push(new Date(Date.parse(this.date.split(",")[1])));
      this.numberOfPersons = this.persons;
      console.log(this.dateRange);
      
  },
  methods: {
    nextClick: function () {
      if (this.mode == "1") {
        if (!this.cottageName || !this.cottageDescription) {
          document.getElementById("cottageNameErr" + this.cottageId).innerHTML =
            "All fields must be filled.";
        } else {
          this.mode = "2";
          document.getElementById(
            "back-btn" + this.cottageId
          ).style.visibility = "visible";
          document.getElementById("cottageNameErr" + this.cottageId).innerHTML =
            "";
        }
      } else if (this.mode == "2") {
        console.log(this.images);
        console.log(this.files);
        if (!this.images && !this.files) {
          document.getElementById(
            "cottageImagesErr" + this.cottageId
          ).innerHTML = "Minimum one image is required.";
        } else {
          this.mode = "3";
          document.getElementById(
            "cottageImagesErr" + this.cottageId
          ).innerHTML = "";
        }
      } else if (this.mode == "3") {
        if (!this.street || !this.city || !this.country) {
          document.getElementById("secondErr" + this.cottageId).style =
            "color: red";
        } else {
          this.mode = "4";
          document.getElementById("secondErr" + this.cottageId).style =
            "color: white";
        }
      } else if (this.mode == "4") {
        if (this.flagRooms) {
          document.getElementById("roomErr" + this.cottageId).innerHTML = "";
          this.mode = "5";
        } else {
          document.getElementById("roomErr" + this.cottageId).innerHTML =
            "All fields must be filled.";
        }
      } else if (this.mode == "5") {
        if (this.flagRules) {
          document.getElementById("ruleErr" + this.cottageId).innerHTML = "";
          this.mode = "6";
        } else {
          document.getElementById("ruleErr" + this.cottageId).innerHTML =
            "All fields must be filled.";
        }
      }
    },
    backClick: function () {
      if (this.mode == "2") {
        this.mode = "1";
        document.getElementById("back-btn" + this.cottageId).style.visibility =
          "hidden";
      } else if (this.mode == "3") {
        this.mode = "2";
      } else if (this.mode == "4") {
        this.mode = "3";
      } else if (this.mode == "5") {
        this.mode = "4";
      } else if (this.mode == "6") {
        this.mode = "5";
      }
    },
    closeModal: function () {
      this.mode = "1";
      if (!this.cottage) {
        this.cottageName = "";
        this.cottageDescription = "";
        this.images = [];
        this.street = "";
        this.city = "";
        this.country = "";
        this.rooms = [];
        this.rules = [];
        this.priceList = [];
      }
      let container = document.getElementsByClassName("pac-container")[0];
      if (container) {
        container.remove();
      }
    },

    uploaded: function (files) {
      this.files = files;
    },
    changeAddress: function (address) {
      if (address == undefined) {
        document.getElementById("secondErr" + this.cottageId).style =
          "color: red;";
      } else {
        document.getElementById("secondErr" + this.cottageId).style =
          "color: white;";
        this.street = address.street;
        this.city = address.city;
        this.postal_code = address.postal_code;
        this.country = address.country;
        this.lng = address.lng;
        this.lat = address.lat;
      }
    },
    roomsUpdated: function (retval) {
      this.flagRooms = retval.result;
      if (retval.result) {
        this.rooms = retval.newRooms;
      }
    },
    rulesUpdated: function (retVal) {
      this.flagRules = retVal.result;
      if (retVal.result) {
        this.rules = retVal.newRules;
      }
    },
    priceListUpdated: function (retVal) {
      this.flagPriceList = retVal.result;
      if (retVal.result) {
        this.priceList = retVal.newPriceList;
      }
    },
    updateCottage: function () {
      if (!this.flagPriceList) {
        document.getElementById("priceListErr" + this.cottageId).innerHTML =
          "All fields must be filled.";
      } else {
        let additionalServices = [];
        for (let service of this.priceList) {
          additionalServices.push({ name: service.name, price: service.price });
        }

        let rulesFinal = [];
        for (let rule of this.rules) {
          rulesFinal.push({ content: rule.content, isEnforced: rule.type });
        }

        let roomsFinal = [];
        for (let room of this.rooms) {
          roomsFinal.push({ bedNumber: room.beds });
        }
        let home = {
          name: this.cottageName,
          description: this.cottageDescription,
          images: null,
          location: {
            longitude: 0,
            latitude: 0,
            address: {
              street: this.street,
              city: this.city,
              country: this.country,
            },
          },
          rooms: roomsFinal,
          rules: rulesFinal,
          additionalServices: additionalServices,
        };

        axios
          .post("http://localhost:8080/vacationHome/newHome", home, {
            headers: {
              "Access-Control-Allow-Origin": "http://localhost:8080",
              Authorization: "Bearer " + localStorage.jwt,
            },
          })
          .then(window.location.reload());
      }
    },
    createCottage: function () {
      if (!this.flagPriceList) {
        document.getElementById("priceListErr" + this.cottageId).innerHTML =
          "All fields must be filled.";
      } else {
        let additionalServices = [];
        for (let service of this.priceList) {
          additionalServices.push({ name: service.name, price: service.price });
        }

        let rulesFinal = [];
        for (let rule of this.rules) {
          rulesFinal.push({ content: rule.content, isEnforced: rule.type });
        }

        let roomsFinal = [];
        for (let room of this.rooms) {
          roomsFinal.push({ bedNumber: room.beds });
        }
        let home = {
          name: this.cottageName,
          description: this.cottageDescription,
          images: null,
          location: {
            longitude: 0,
            latitude: 0,
            address: {
              street: this.street,
              city: this.city,
              country: this.country,
            },
          },
          rooms: roomsFinal,
          rules: rulesFinal,
          additionalServices: additionalServices,
        };

        axios
          .post("http://localhost:8080/vacationHome/newHome", home, {
            headers: {
              "Access-Control-Allow-Origin": "http://localhost:8080",
              Authorization: "Bearer " + localStorage.jwt,
            },
          })
          .then(window.location.reload());
      }
    },
  },
};
</script>

<style scoped src="@/css/newCottageModal.css"></style>
