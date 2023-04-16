<script>
import { store } from "../store.js";
import SearchBar from './SearchBar.vue';
export default {
    name: 'AppHeader',
    components: {
        SearchBar,
    }, data() {
        return {
            store
        }
    }
}
</script>

<template>
    <header>
        <div class="container d-flex justify-content-between align-items-center">
            <SearchBar />
        </div>
    </header>
    <div class="hero_image"></div>
</template>

<style lang="scss" scoped>
header {
    z-index: 1000;
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
}
</style>