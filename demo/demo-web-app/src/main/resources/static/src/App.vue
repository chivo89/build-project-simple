<template>
  <div id="app">
    <HeaderView></HeaderView>
    <img src="./assets/logo.png">
    <router-view/>
    <FooterView></FooterView>
  </div>
</template>

<script>
import HeaderView from './components/layouts/Header.vue';
import FooterView from './components/layouts/Footer.vue';

export default {
  name: 'App',
  data() {
		return {
		};
	},
	created() {
	},
	updated() {
	},
	destroyed() {
	},
  components: {
    HeaderView,
    FooterView
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
