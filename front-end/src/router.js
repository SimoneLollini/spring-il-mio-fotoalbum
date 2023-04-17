import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '/src/views/HomeView.vue';
import ContactView from '/src/views/ContactView.vue';

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            name: 'home',
            component: HomeView
        }, {
            path: '/contact',
            name: 'contact',
            component: ContactView
        }
    ]
});
export { router };