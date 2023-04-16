import { reactive } from "vue";
import axios from "axios";
export const store = reactive({
    error: null,
    photos: null,
    loading: true,
    photoToSearch: '',
    API_URL_PHOTO: 'http://localhost:8080/api/photos',
    callApi(URL) {
        if (this.photoToSearch) {
            URL += "?q=" + this.photoToSearch.toLocaleLowerCase()
        }
        axios
            .get(URL)
            .then(response => {
                console.log(response);
                this.photos = response.data
            })
            .catch(error => {
                console.log(error)
                this.errored = true
            })
            .finally(() => this.loading = false)
    }
},
)