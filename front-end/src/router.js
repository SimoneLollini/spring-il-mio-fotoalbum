import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '/src/views/HomeView.vue';
import ContactView from '/src/views/ContactView.vue';
import PhotoView from '/src/views/PhotoView.vue';


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
        },
        {
            path: '/photo/:id',
            name: 'single-photo',
            component: PhotoView
        }
    ]
});
export { router };