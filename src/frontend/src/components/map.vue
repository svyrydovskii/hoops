<template>
    <gmap-map
      :center="center"
      :zoom="zoom"
      style="width: 100%; height: 100%"
    >
      <gmap-marker
        :key="index"
        v-for="(m, index) in markers"
        :position="m.position"
        :clickable="true"
        :draggable="true"
        @click="center=m.position"
      ></gmap-marker>
    </gmap-map>
</template>

<script>
  import * as VueGoogleMaps from 'vue2-google-maps';
  import Vue from 'vue';

    Vue.use(VueGoogleMaps, {
      load: {
        key: 'AIzaSyDSm0iVeOTOJ5vC7y2yzsrDRPJCj2c1ZOU',
        v: '3',
         libraries: 'places',
      }
    });
  const vm = this;

  export default {
    name: 'event_map',
    mounted: function() {
      this.getPlaces();
    },

    methods: {
        getPlaces: function() {
//          ToDo just localhost call to verify that everything works, should be replaced with proper endpoint
          let url = 'http://localhost:8090';
          this.$http.get(url)
          .then(function (response) {
            console.log(response.data)
            response.data.forEach((el) => {
              this.markers.push({position: el})
            })
          })
          .catch(function (error) {
//            ToDo some error message
          })
        }
    },

    data () {
      return {
        center: {lat: 50.4, lng: 30.5},
        zoom: 11,
        markers: [],
      }
    }
  }
</script>
