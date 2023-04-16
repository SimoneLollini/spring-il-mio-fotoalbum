<script>
import { store } from "../store.js";
export default {
    name: 'HeroImage',
    components: {
    }, data() {
        return {
            store
        }
    }
}
</script>

<template>
    <div class="hero_image"></div>
</template>

<style lang="scss" scoped>
.hero_image {
    height: 100vh;
    background: black;
    background-image: url(../assets/img/bg-home.jpg);
    background-size: cover;
    background-repeat: no-repeat;
}
</style>