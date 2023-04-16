<script>
export default {
    name: 'OverlayGradient',
    components: {

    }
}
</script>

<template>
    <div class="hero_image"></div>
</template>

<style lang="scss" scoped>
.hero_image {
    height: 100vh;
    width: 100vw;
    position: absolute;
    top: 0;
    left: 0;
    background-image: linear-gradient(rgba(17, 17, 17, 0.808), rgba(62, 62, 62, 0.109));
}
</style>