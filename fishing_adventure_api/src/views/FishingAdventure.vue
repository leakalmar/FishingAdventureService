<template>
  <div class="fa-page">
    <div class="main-img-fa">
      <img src="@/assets/fa7.jpg" alt="" />
      <div class="tagline-fa">
        <h2>
          Start your adventure <br />
          today!
        </h2>
        <button class="book-btn">Book an adventure</button>
      </div>
    </div>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark navbar-info">
      <div class="container-fluid">
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarText"
          aria-controls="navbarText"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0 menu-ol-fa">
            <li
              v-on:click="changeMenuDisplay"
              id="about-fa"
              style="border-bottom: 1px solid white"
            >
              About
            </li>
            <li v-on:click="changeMenuDisplay" id="ex-info-fa">
              Extra Information
            </li>
            <li v-on:click="changeMenuDisplay" id="loc-fa">Location</li>
            <li v-on:click="changeMenuDisplay" id="pl-fa">Pricelist</li>
            <li v-on:click="changeMenuDisplay" id="instr-fa">Instructor</li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="menu-fa">
      <div class="menu-body-fa">
        <div class="menu-about-fa" style="text-align: justify">
          <div class="ma-top-part">
            <h3>Adventure Title</h3>
            <h5>For up to 3 people</h5>
          </div>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
            eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
            ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
            aliquip ex ea commodo consequat. Duis aute irure dolor in
            reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
            pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
            culpa qui officia deserunt mollit anim id est laborum.
          </p>
        </div>

        <div class="menu-ex-info-fa" style="display: none">
          <div class="ei-bonus">
            <h4>With every reservation you will get:</h4>
            <ul>
              <li>
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="14"
                  height="12"
                  style="color: rgb(22, 82, 161)"
                  fill="currentColor"
                  class="bi bi-circle-fill"
                  viewBox="0 0 16 16"
                >
                  <circle cx="5" cy="5" r="5" />
                </svg>
                A fishing rod and reel
              </li>

              <li>
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="14"
                  height="12"
                  style="color: rgb(22, 82, 161)"
                  fill="currentColor"
                  class="bi bi-circle-fill"
                  viewBox="0 0 16 16"
                >
                  <circle cx="5" cy="5" r="5" />
                </svg>
                A fishing line
              </li>
              <li>
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="14"
                  height="12"
                  style="color: rgb(22, 82, 161)"
                  fill="currentColor"
                  class="bi bi-circle-fill"
                  viewBox="0 0 16 16"
                >
                  <circle cx="5" cy="5" r="5" />
                </svg>
                A tackle box
              </li>
            </ul>
          </div>

          <div class="ei-rules">
            <h4>Rulebook:</h4>
            <ul>
              <li>
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="13"
                  height="13"
                  fill="currentColor"
                  style="color: green; margin: 0 4px 1px 0"
                  class="bi bi-check-circle"
                  viewBox="0 0 16 16"
                >
                  <path
                    d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"
                  />
                  <path
                    d="M10.97 4.97a.235.235 0 0 0-.02.022L7.477 9.417 5.384 7.323a.75.75 0 0 0-1.06 1.06L6.97 11.03a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 0 0-1.071-1.05z"
                  />
                </svg>
                Pets
              </li>

              <li>
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="13"
                  height="13"
                  fill="currentColor"
                  style="color: red; margin: 0 4px 1px 0"
                  class="bi bi-x-circle"
                  viewBox="0 0 16 16"
                >
                  <path
                    d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"
                  />
                  <path
                    d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"
                  />
                </svg>
                No smoking
              </li>

              <li>
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="13"
                  height="13"
                  fill="currentColor"
                  style="color: red; margin: 0 4px 1px 0"
                  class="bi bi-x-circle"
                  viewBox="0 0 16 16"
                >
                  <path
                    d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"
                  />
                  <path
                    d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"
                  />
                </svg>
                No littering
              </li>
            </ul>
          </div>
        </div>

        <div class="menu-loc-fa" style="display: none">
          <div class="loc-info">
            <h5>Bulevar Evrope 20</h5>
            <h5>Novi Sad</h5>
            <h5>45.246117, 19.816604</h5>
          </div>

          <div class="map-fa"></div>
        </div>

        <div class="menu-pl-fa" style="display: none">
          <h5>Additional services:</h5>
          <table class="table table-striped">
            <tbody>
              <tr>
                <td class="as-title">Fishing boat</td>
                <td><span class="as-price">$45</span></td>
                <td> you will not be restricted to only fishing on the shore</td>
              </tr>

              <tr>
                <td class="as-title">Professional fishing gear</td>
                <td><span class="as-price">$70</span></td>
                <td> high quality rods, reels and lures</td>
              </tr>
            </tbody>

            <tbody></tbody>
          </table>

          <h6 style="margin-top: 5%">
            *In case of cancelation the instructor keeps 20% of the full payment
            including bought additional services
          </h6>
        </div>

        <div class="menu-instr-fa" style="display: none">
          <h4>John Smith</h4>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
            eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
            ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
            aliquip ex ea commodo consequat. Duis aute irure dolor in
            reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
            pariatur.
          </p>
        </div>
      </div>
    </div>

    <div class="bottom-part-fa">
      <div class="pa-title-fa">
        <h2>Previous adventures</h2>
      </div>
      <div
        id="carouselExampleIndicators"
        class="carousel slide"
        data-bs-ride="carousel"
        style="
          padding: 0% 7%;
          background: #212529;
          height: 450px;
          width: 75%;
          margin: 20px auto 0 auto;
        "
      >
        <div class="carousel-indicators">
          <button
            type="button"
            data-bs-target="#carouselExampleIndicators"
            data-bs-slide-to="0"
            class="active"
            aria-current="true"
            aria-label="Slide 1"
          ></button>
          <button
            type="button"
            data-bs-target="#carouselExampleIndicators"
            data-bs-slide-to="1"
            aria-label="Slide 2"
          ></button>
          <button
            type="button"
            data-bs-target="#carouselExampleIndicators"
            data-bs-slide-to="2"
            aria-label="Slide 3"
          ></button>
        </div>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img
              src="@/assets/fa18.jpg"
              class="d-block w-100"
              alt="..."
              style="object-fit: contain; height: 450px"
            />
          </div>
          <div class="carousel-item">
            <img
              src="@/assets/fa19.jpg"
              class="d-block w-100"
              alt="..."
              style="object-fit: contain; height: 450px"
            />
          </div>
          <div class="carousel-item">
            <img
              src="@/assets/fa20.jpg"
              class="d-block w-100"
              alt="..."
              style="object-fit: contain; height: 450px"
            />
          </div>
        </div>
        <button
          class="carousel-control-prev"
          type="button"
          data-bs-target="#carouselExampleIndicators"
          data-bs-slide="prev"
          style="width: 7%"
        >
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button
          class="carousel-control-next"
          type="button"
          data-bs-target="#carouselExampleIndicators"
          data-bs-slide="next"
          style="width: 7%"
        >
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>

      <div class="special-offers-fa">
        <div class="so-title-fa">
          <h2>Special Offers</h2>
        </div>
      </div>

      <div class="special-offers-fa">
        <div class="so-title-fa">
          <h2>Past experiences</h2>
        </div>

        <div class="review-fa continer">
          <div class="review-tp">
            <img class="user-rev-img" src="@/assets/fa7.jpg" alt="" />
            <div class="rev-info">
              <h5>John Smith</h5>
              <h6>01.12.2021.</h6>
            </div>
            <div
              style="
                margin-left: auto;
                display: inline-flex;
                justify-content: flex-end;
                align-content: center;
              "
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                width="16"
                height="16"
                fill="currentColor"
                class="bi bi-star-fill rev-star"
                viewBox="0 0 16 16"
              >
                <path
                  d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z"
                />
              </svg>
              <svg
                xmlns="http://www.w3.org/2000/svg"
                width="16"
                height="16"
                fill="currentColor"
                class="bi bi-star-fill rev-star"
                viewBox="0 0 16 16"
              >
                <path
                  d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z"
                />
              </svg>
              <svg
                xmlns="http://www.w3.org/2000/svg"
                width="16"
                height="16"
                fill="currentColor"
                class="bi bi-star-fill rev-star"
                viewBox="0 0 16 16"
              >
                <path
                  d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z"
                />
              </svg>
              <svg
                xmlns="http://www.w3.org/2000/svg"
                width="16"
                height="16"
                fill="currentColor"
                class="bi bi-star-fill rev-star"
                viewBox="0 0 16 16"
              >
                <path
                  d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z"
                />
              </svg>
            </div>
          </div>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
            eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
            ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
            aliquip ex ea commodo consequat. Duis aute irure dolor in
            reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
            pariatur.
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "FishingAdventure",
  methods: {
    changeMenuDisplay: function (event) {
      let elID = event.currentTarget.id;
      document.getElementById("about-fa").style.borderBottom = "0px";
      document.getElementById("ex-info-fa").style.borderBottom = "0px";
      document.getElementById("loc-fa").style.borderBottom = "0px";
      document.getElementById("pl-fa").style.borderBottom = "0px";
      document.getElementById("instr-fa").style.borderBottom = "0px";

      document.getElementById(elID).style.borderBottom = "1px solid white";

      if (elID == "about-fa") {
        document.querySelector(".menu-about-fa").style.display = "block";
        document.querySelector(".menu-ex-info-fa").style.display = "none";
        document.querySelector(".menu-loc-fa").style.display = "none";
        document.querySelector(".menu-pl-fa").style.display = "none";
        document.querySelector(".menu-instr-fa").style.display = "none";
      } else if (elID == "ex-info-fa") {
        document.querySelector(".menu-about-fa").style.display = "none";
        document.querySelector(".menu-ex-info-fa").style.display = "flex";
        document.querySelector(".menu-loc-fa").style.display = "none";
        document.querySelector(".menu-pl-fa").style.display = "none";
        document.querySelector(".menu-instr-fa").style.display = "none";
      } else if (elID == "loc-fa") {
        document.querySelector(".menu-about-fa").style.display = "none";
        document.querySelector(".menu-ex-info-fa").style.display = "none";
        document.querySelector(".menu-loc-fa").style.display = "inline-flex";
        document.querySelector(".menu-pl-fa").style.display = "none";
        document.querySelector(".menu-instr-fa").style.display = "none";
      } else if (elID == "pl-fa") {
        document.querySelector(".menu-about-fa").style.display = "none";
        document.querySelector(".menu-ex-info-fa").style.display = "none";
        document.querySelector(".menu-loc-fa").style.display = "none";
        document.querySelector(".menu-pl-fa").style.display = "block";
        document.querySelector(".menu-instr-fa").style.display = "none";
      } else {
        document.querySelector(".menu-about-fa").style.display = "none";
        document.querySelector(".menu-ex-info-fa").style.display = "none";
        document.querySelector(".menu-loc-fa").style.display = "none";
        document.querySelector(".menu-pl-fa").style.display = "none";
        document.querySelector(".menu-instr-fa").style.display = "block";
      }
    },
  },
};
</script>

<style scoped src="@/css/fishingAdventure.css"></style>
