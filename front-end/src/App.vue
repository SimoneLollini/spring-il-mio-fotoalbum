<script>
import OverlayGradient from "./components/OverlayGradient.vue";
import AppHeader from "./components/AppHeader.vue";
import HeroImage from "./components/HeroImage.vue";
import AppMain from "./components/AppMain.vue"
import { store } from "./store.js";
export default {
    name: 'App',
    components: {
        AppHeader,
        HeroImage,
        OverlayGradient,
        AppMain
    },
    data() {
        return {
            store
        }
    }
}
</script>

<template>
    <OverlayGradient />
    <AppHeader />
    <HeroImage />
    <AppMain />
</template>
<style lang="scss">
@use './assets/scss/style.scss' as *;
</style>

