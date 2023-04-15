<script>
import { store } from "../store.js";
export default {
    name: 'SearchBar',
    emits: ['CallSearch'],
    data() {
        return {
            store
        }
    }
}
</script>


<template>
    <div class="search_bar gap-2 pt-2">
        <input class="form_control" @keyup.enter="$emit('CallSearch')" type="text" placeholder="Cerca"
            v-model="store.photoToSearch">
        <button class="btn_danger" @click="store.callApi(store.API_URL_PHOTO)">Cerca</button>
    </div>
</template>

<style lang="scss" scoped>
@use '../assets/scss/partials/variables.scss' as *;

.search_bar {
    display: flex;
    justify-content: center;

    input {
        font-weight: 200;
        color: white;
        border-radius: 5px;
        height: 1.5rem;
        width: 180px;
        background-color: #333333;
        border: none;
        border-bottom: 1px solid #8c8c8c;
        padding: 0 10px;
    }

    ::placeholder {
        opacity: 0.3;
        font-weight: 200;
        color: white;
    }

    .btn_danger {
        background-color: $bf_danger;
        border: none;
        border-radius: 5px;
        color: $light;
        font-size: 0.9rem;
        font-weight: 300;
    }
}
</style>