<template>
  <div class="hello">
    <event_map>
    </event_map>
  </div>
</template>

  </div>
</template>

<script>
import event_map from './map.vue';

export default {
  name: 'index',
  components: {event_map},

  data () {
    return {
      msg: 'Welcome to Your hue Vue.js App',
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

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
.hello {
  width: 50%;
  height: 90%;
}
</style>
