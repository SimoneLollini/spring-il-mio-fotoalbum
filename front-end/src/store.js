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
                console.log(response);
                this.photos = response.data
            })
            .catch(error => {
                console.log(error)
                this.errored = true
            })
            .finally(() => this.loading = false)
    },
    isPhotosEmpty() {
        return this.photos.length > 0
    },
    mouveSlider: () => {
        store.photos.forEach(element => {
            element.position++
            if (element.position > 1300) {
                element.position = -1200
            }
        });
    },
    addKeyPosition: () => {
        store.photos.forEach((element, i) => {
            console.log(i)
            if (i == 0) {
                element.position = 10;
            } else if (i == 1) {
                element.position = 20;
            } else {
                element.position = i * 10;
            }
        });
    },
},
)