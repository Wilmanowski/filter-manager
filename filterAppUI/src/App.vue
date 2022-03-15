<template>
  <div class="container">
    <form>
      <label for="name">Select column:</label><br/>
      <select @change="handleChange">
        <option value="1" data-foo = "kolumna1">kolumna1</option>
        <option value="2" data-foo = "kolumna2">kolumna2</option>
        <option value="3" data-foo = "kolumna3">kolumna3</option>
        <option value="4" data-foo = "kolumna4">kolumna4</option>
      </select>
    </form>
        <table>
            <tr>
              <th>ID </th>
              <th>kolumna1 </th>
              <th>kolumna2 </th>
              <th>kolumna3 </th> 
              <th>kolumna4 </th>
            </tr>
        </table>
        <div v-for="post in posts" :key="post.id">
          <table>
            
            <tr>
              <th>{{post.id}}</th>
              <th>{{post.kolumna1}}</th>  
              <th>{{post.kolumna2}}</th>               
              <th>{{post.kolumna3}}</th>             
              <th>{{post.kolumna4}}</th>
            </tr>
          </table>
        </div>
   </div>
</template>



<script>
import axios from 'axios'

export default {
  name: "App",
  data() {
      return{
          posts: [],

      }
  },
  methods: {
    
     handleChange(e) {
        var column = e.target.options[e.target.options.selectedIndex].dataset.foo     
        axios.get(`http://localhost:8080/api/${column}`)
          .then((response) => {
              console.log(response.data)
              this.posts = response.data
          })
          .catch((error));
      
        
     }
      
  }
};
</script>

<style scoped>
form {
  text-align: center;
  margin-top: 30px;
  font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
  color: blue;
  
}

select {
  margin-top: 10px;
  height: 50px;
  width: 500px;
  color: black;
  margin-bottom: 50px;
}

table,th,td{
  margin: auto;
  border-style: solid;
  border-color: red;
}

</style>
