<template>
  <header class="mui-appbar">
    <div class="mui-col-xs-12 mui-col-md-6 mui-col-md-offset-6">
      <ul>
        <li>
          <router-link :to="{name: 'index'}">Home</router-link>
        </li>
        <li>
          <router-link :to="{name: 'about'}">About</router-link>
        </li>
      </ul>
    </div>
  </header>
</template>

<script>
  export default {
    name: 'navigation',
    data() {
      return {}
    }
  }
</script>

<style lang="scss">

$color: white;

header {
  vertical-align:middle;
  ul {
    margin-top: 15px;
    li {
      list-style-type: none;
      font-size: 22px;
      margin-right: 30px;
      display: inline-block;

      a {
        color: $color;
        cursor: pointer;
        position: relative;
        text-decoration: none !important;

        &:before {
          content: "";
          position: absolute;
          width: 100%;
          height: 2px;
          bottom: 0;
          left: 0;
          background-color: $color;
          visibility: hidden;
          -webkit-transform: scaleX(0);
          transform: scaleX(0);
          -webkit-transition: all 0.3s ease-in-out 0s;
          transition: all 0.3s ease-in-out 0s;
        }
        &:hover:before {
          visibility: visible;
          -webkit-transform: scaleX(1);
          transform: scaleX(1);
        }
      }
    }
  }
}
</style>
