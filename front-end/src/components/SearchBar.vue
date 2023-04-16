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
        <button class=" btn p-1 btn_darker" @click="store.callApi(store.API_URL_PHOTO)">Cerca</button>
    </div>
</template>

<style lang="scss" scoped>
@use '../assets/scss/partials/variables.scss' as *;

.search_bar {
    width: 100%;
    display: flex;
    justify-content: right;
    margin: 10px;

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

    .btn_darker {
        background-color: darken($color: #000000, $amount: 0);
        margin-left: 3px;
        border: none;
        border-radius: 5px;
        color: $light;
        font-size: 0.8rem;
        font-weight: 300;
    }
}
</style>