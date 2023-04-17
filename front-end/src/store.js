import { reactive } from "vue";
import axios from "axios";
export const store = reactive({
    error: null,
    photos: [],
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
                this.photos = response.data
            })
            .catch(error => {
                this.errored = true
            })
            .finally(() => this.loading = false)
    },
    isPhotosEmpty() {
        return this.photos.length > 0
    },
    categoryColor() {
        const randValue = Math.floor(Math.random() * 8);
        switch (randValue) {
            case 1:
                return "bg-dark"
                break;
            case 3:
                return "bg-info"
                break;
            case 4:
                return "bg-warning"
                break;
            case 5:
                return "bg-danger"
                break;
            case 6:
                return "bg-success"
                break;
            case 7:
                return "bg-secondary"
                break;

            default:
                return "bg-primary"
                break;
        }


    }
},
)