<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png" />
    <Todos v-bind:todos="todos" />
  </div>
</template>

<script>
import Todos from "./components/Todos.vue";

export default {
  name: "app",
  components: {
    Todos
  },
  data() {
    return {
      todos: [
        {
          'id': 1,
          'name': `Todo Item`,
          'isCompleted': false
        },
        {
          "id": 2,
          "name": "Todo Item",
          "isCompleted": false
        },
        {
          "id": 3,
          "name": "Todo Item",
          "isCompleted": false
        }
      ]
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
