<script>
import { store } from "./store.js";
import HomeView from "./views/HomeView.vue";
export default {
    name: 'App',
    components: {
        HomeView
    },
    data() {
        return {
            store,
        }
    }
}
</script>

<template>
    <RouterView></RouterView>
</template>
<style lang="scss">
@use './assets/scss/style.scss' as *;
</style>

