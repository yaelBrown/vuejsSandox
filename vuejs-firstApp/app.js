window.addEventListener('load', () => {
  new Vue({
    el: '#app',
    data: {
      title: "",
      title2: 'Hello World!',
      link: 'http://www.redhat.com',
      attachRed: false
    },
    methods: {
      changeTitle: function() {
        this.title = event.target.value;
      },
      sayHello: function() {
        return 'Hello!'
      }
    }
  });
})
