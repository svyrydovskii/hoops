<template>
  <gmap-map
    :center="center"
    :zoom="7"
    style="width: 50%; height: 100%"
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
  /////////////////////////////////////////
  // New in 0.4.0
  import * as VueGoogleMaps from 'vue2-google-maps';
  import Vue from 'vue';

  Vue.use(VueGoogleMaps, {
    load: {
      key: 'AIzaSyDSm0iVeOTOJ5vC7y2yzsrDRPJCj2c1ZOU',
      v: '3',
      // libraries: 'places', //// If you need to use place input
    }
  });

  export default {
    name: 'map',
    data () {
      return {
        center: {lat: 10.0, lng: 10.0},
        markers: [{
          position: {lat: 10.0, lng: 10.0}
        }, {
          position: {lat: 11.0, lng: 11.0}
        }]
      }
    }
  }
</script>
