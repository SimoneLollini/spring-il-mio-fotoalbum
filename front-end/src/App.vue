<script>
import AppHeader from "./components/AppHeader.vue";
import { store } from "./store.js";
export default {
    name: 'App',
    components: {
        AppHeader,
    },
    data() {
        return {
            store
        }
    }
}
</script>

<template>
    <AppHeader />
</template>
<style scoped lang="scss"></style>

