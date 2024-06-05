<template>
    <main>
        <Navbar />

        <!-- Table-->
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center">View Doctors</h1>
                    <!--Add button -->
                    <a href="/add" class="btn btn-primary">Add Doctors</a>
                    <table class="table table-striped">
                        <thead>
                          <tr>
                            
                            <th scope="col">Id</th>
                            <th scope="col">Reg-Number</th>
                            <th scope="col">NIC</th>
                            <th scope="col">Name</th>
                            <th scope="col">Specialization</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone Number</th>
                            <th scope="col">Reg-Date</th>
                            <th scope="col">Exp-Date</th>
                            <th scope="col">Action</th>
                          </tr>
                        </thead>
                        <tbody>
                          <tr v-for="doctor in doctors" :key="doctor.id">

                           
                            <th scope="row">{{doctor.id}}</th>
                            <td>{{doctor.regNum}}</td>
                            <td>{{doctor.nic}}</td>
                            <td>{{doctor.name}}</td>
                            <td>{{doctor.specialization}}</td>
                            <td>{{doctor.email}}</td>
                            <td>{{doctor.pNo}}</td>
                            <td>{{doctor.regDate}}</td>
                            <td>{{doctor.expDate}}</td>
                            <td>
                              <a class="btn btn-primary" :href="`/edit/${doctor.id}`">Edit</a>
                              <button class="btn btn-danger mx-2" @click="deleteDoctor(doctor.id)">Delete</button>
                            </td>
                          </tr>
                        </tbody>
                      </table>
                </div>
            </div>
        </div>
        
    </main>
</template>


<script>
import Navbar from '../components/navbar.vue';


    export default {
        name: 'ViewDoctors',
        components: {
            Navbar
        },
        data() {
            return {
                doctors: []
            }
        },

        beforeMount(){
            this.getDoctors()
        },

        methods: {
            getDoctors(){
                fetch('http://localhost:8080/doctors')
                .then(res => res.json())
                .then(data => {
                    this.doctors = data
                    console.log(data)
                })
            },
            deleteDoctor(id){
                fetch(`http://localhost:8080/doctor/${id}`, {
                    method: 'DELETE'
                })
                .then(data => {
                    console.log(data)
                    this.getDoctors()
                })
            }
        }

    }

</script>