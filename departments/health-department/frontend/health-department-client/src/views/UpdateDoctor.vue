<template>
    <main>
        <Navbar/>
        <div class="my-5">
            <div class="mx-auto w-25 " style="max-width:100%;">
              <h2 class="text-center mb-3">Update Doctor</h2>
              <form @submit.prevent="updateDoctor">
                 <!--id-->
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="id" class="form-label">Id</label>
                    <input id="id"  type="text" name="id" class="form-control" placeholder="Id" required v-model="doctor.id">
                  </div>
                </div>

                <!--nic-->
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="nic" class="form-label">NIC</label>
                    <input id="nic"  type="text" name="nic" class="form-control" placeholder="NIC" required v-model="doctor.nic">
                  </div>
                </div>


                <!--name-->
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input id="name"  type="text" name="name" class="form-control" placeholder="Name" required v-model="patient.name">
                  </div>
                </div>

                <!--specialization-->
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="specialization" class="form-label">Specialization</label>
                    <input id="specialization"  type="text" name="specialization" class="form-control" placeholder="Specialization" required v-model="doctor.specialization">
                  </div>
                </div>

                
                <!--Email-->
                <div class="row">
                    <div class="col-md-12 form-group mb-3">
                      <label for="email" class="form-label">Email</label>
                      <input id="email" type="email"  name="email" class="form-control" placeholder="email" required v-model="doctor.email" >
                    </div>
                  </div>

                <!--Phone Number-->
                <div class="row">
                    <div class="col-md-12 form-group mb-3">
                      <label for="pNo" class="form-label">Phone Number</label>
                      <input id="pNo" type="text"  name="pNo" class="form-control" placeholder="Phone Number" required v-model="doctor.pNo" >
                    </div>
                  </div>

                   <!--reg-date-->
                <div class="row">
                    <div class="col-md-12 form-group mb-3">
                      <label for="reg-date" class="form-label">License Registration Date</label>
                      <input id="reg-date" type="date"  name="reg-date" class="form-control" placeholder="license registered date" required v-model="doctor.reg_date" >
                    </div>
                  </div>

                  <!--exp-date-->
                <div class="row">
                    <div class="col-md-12 form-group mb-3">
                      <label for="exp-date" class="form-label">License Expire Date</label>
                      <input id="exp-date" type="date"  name="exp-date" class="form-control" placeholder="license expire date" required v-model="doctor.exp_date" >
                    </div>
                  </div>
      
      
               
               
                <div class="row">
                  <div class="col-md-12 form-group">
                    <input class="btn btn-primary w-100" type="submit" value="Submit">
                  </div>
                </div>
      
                <div>
                  
                </div>
              </form>
        
            </div>
          </div>

    </main>
</template>


<script>
import Navbar from '../components/navbar.vue';

export default {
    name: 'UpdateDoctor',
    components: {
        Navbar
    },

    data(){
        return {
            doctor : {
                    id:'',
                    nic:'',
                    name: '',
                    specialization:'',
                    email: '',
                    pNo: '',
                    reg_date: '',
                    exp_date: ''
            
            }
        }
    },

    beforeMount(){
        this.getDoctors();
    },

    methods: {
        getDoctors(){
            fetch(`http://localhost:8080/doctor/${this.$route.params.id}`)
            .then(res => res.json())
            .then(data => {
                this.doctor = data;
                console.log(this.doctor);
            })

        },
        updateDoctor(){
            fetch(`http://localhost:8080/doctor`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(this.doctor)
            })
            .then(data => {
                console.log(data);
                this.$router.push('/');
            })
        }
    }
}

</script>