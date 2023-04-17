<script>
import OverlayGradient from "../components/OverlayGradient.vue";
import AppHeader from "../components/AppHeader.vue";
import HeroImage from "../components/HeroImage.vue";
import AppMain from "../components/AppMain.vue";
import { store } from "../store.js";
import axios from "axios";
export default {
    name: 'HomeView',
    components: {
        AppHeader,
        OverlayGradient,
    },
    data() {
        return {
            store,
            loading: true,
            photo: null,
            errors: null
        }
    }, mounted() {
        const url = store.API_URL_PHOTO + "/" + this.$route.params.id;
        axios.get(url)
            .then(response => {
                this.loading = false
                this.photo = response.data
            }).catch(error => {
                this.errors = response.data.errors;
            })
    }
}
</script>

<template>
    <div class="wrapper_background">
        <div class="container py-5 text-white" v-if="!this.loading">
            <div class="row pt-5">
                <div class="col-6">
                    <img width="600" :src="this.photo.url" alt="">
                </div>
                <div class="col-6">
                    <h1 class="pb-2"> {{ this.photo.title }}</h1>
                    <p class="pb-2"> {{ this.photo.description }}</p>
                    <div class="btn badge m-1" :class="store.categoryColor()" v-for=" category in photo.categories">
                        {{ category.name }}
                    </div>
                </div>
            </div>
        </div>
        <div v-else class="container py-5 text-white">
            <h1 class="text-center">Caricamento...</h1>
        </div>

    </div>
</template>
<style scoped lang="scss">
.wrapper_background {
    height: 100vh;
    background-image: linear-gradient(rgb(17, 17, 17), rgb(62, 62, 62));
}
</style>
