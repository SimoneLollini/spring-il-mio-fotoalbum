<script>
import { store } from "../store.js";
export default {
    name: 'AppMain',
    components: {

    },
    data() {
        return {
            store,
        }
    },
    methods: {},
    mounted() {
        store.callApi(store.API_URL_PHOTO)
    }
}
</script>

<template>
    <div class="main_wrapper" v-if="store.photos">
        <div class="container h-100 d-flex align-items-center justify-content-center">
            <div class="row gap-3 justify-content-center">
                <div class="col-2" v-for="photo in store.photos">
                    <router-link :to="{ name: 'single-photo', params: { id: photo.id } }" href="/"
                        class=" h-100 card bg-transparent">
                        <img :src="photo.url" :alt="photo.title">
                    </router-link>
                </div>
            </div>
        </div>
    </div>
</template>

<style lang="scss" scoped>
.main_wrapper {
    height: 100%;
    width: 100%;
    position: absolute;
    top: 0;
    left: 0;


    .not_found {
        background-color: rgba(0, 0, 0, 0.556);
        padding: 1.5rem 2rem;
        border-radius: 1.5rem;
    }
}

.wrapper_slider {
    width: 1200px;
    height: 800px;
}
</style>