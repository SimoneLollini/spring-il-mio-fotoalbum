<script>
import { store } from "../store.js";
export default {
    name: 'AppMain',
    components: {

    }, data() {
        return {
            store
        }
    }, mounted() {
        store.callApi(store.API_URL_PHOTO)
    }
}
</script>

<template>
    <div class="main_wrapper" v-if="store.photos">
        <div class="container h-100 d-flex align-items-center justify-content-center">
            <div class="row">
                <div class="col-2" v-for="photo in store.photos">
                    <div class="card bg-transparent">
                        <img :src="photo.url" :alt="photo.title">
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<style lang="scss" scoped>
.main_wrapper {
    z-index: 10000;
    height: 100%;
    width: 100%;
    position: absolute;
    top: 0;
    left: 0;
}
</style>