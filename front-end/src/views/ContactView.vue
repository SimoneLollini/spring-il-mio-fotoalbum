<script>
import OverlayGradient from "../components/OverlayGradient.vue";
import AppHeader from "../components/AppHeader.vue";
import HeroImage from "../components/HeroImage.vue";

import { store } from "../store.js";
import axios from "axios";
export default {
    name: 'ContactView',
    components: {
        AppHeader,
        HeroImage,
        OverlayGradient,

    },
    data() {
        return {
            store,
            email: "",
            messageText: "",
            formLoading: false,
            form_info: false,
            errors: null,
        }
    },
    methods: {
        sendForm() {
            this.formLoading = true
            const data = {
                "email": this.email,
                "text": this.messageText
            }
            axios.post('http://localhost:8080/api/messages', data).then((response) => {
                if (response.data) {
                    this.form_info = true
                    this.email = ""
                    this.messageText = ""
                } else {
                    this.errors = response.data.errors;
                }
                this.formLoading = false
            });
        }
    }
}
</script>

<template>
    <div class="canvas_contact w-100 position-absolute top-0 left-0">
        <div class="p-5 col-5 text-white">
            <h1>Contact</h1>
            <form @submit.prevent="sendForm()">
                <div class="mb-3">
                    <label for="" class="form-label">Email</label>
                    <input required type="email" name="email" id="email" v-model="email" class="form-control"
                        placeholder="name@example.com" aria-describedby="emailHelper">
                    <small id="emailHelper">Inserisci la tua email</small>
                </div>
                <div class="mb-3">
                    <label for="messageText" class="form-label">Messaggio</label>
                    <textarea required name="messageText" id="messageText" v-model="messageText" class="form-control"
                        placeholder="Inserisci messaggio " aria-describedby="messageTextHelper" />
                    <small id="messageTextHelper">Inserisci messaggio </small>
                </div>
                <button type="submit" class="btn btn-dark" :disabled="formLoading">
                    {{ formLoading ? 'Caricamento...' : 'Invia' }} </button>
            </form>
        </div>
    </div>
    <OverlayGradient />
    <HeroImage />
</template>
<style scoped lang="scss">
.canvas_contact {
    z-index: 10000;
}
</style>
