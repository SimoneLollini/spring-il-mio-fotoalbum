<script>
export default {
    name: 'NavLinks',
    components: {
    }, data() {
        return {

        }
    }
}
</script>

<template>
    <router-link :to="{ name: 'home' }">
        <div class="text-white">
            Home
        </div>
    </router-link>
    <router-link :to="{ name: 'contact' }">
        <div class="text-white">
            Contact
        </div>
    </router-link>
</template>

<style lang="scss" scoped>
a {
    text-decoration: none;
    padding-right: 1rem;
}
</style>
