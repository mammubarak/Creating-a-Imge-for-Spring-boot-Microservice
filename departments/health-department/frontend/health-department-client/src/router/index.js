import { createRouter, createWebHistory } from 'vue-router'
import ViewDoctors from '../views/ViewDoctors.vue'
import AddDoctors from '../views/AddDoctors.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: ViewDoctors
    },
    {
      path: '/add',
      name: 'add',
      component: AddDoctors
    },
    {
      path: '/edit/:id',
      name: 'edit',
      component: () => import('../views/UpdateDoctor.vue')
    }
  ]
})

export default router
