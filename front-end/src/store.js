import { reactive } from "vue";
import axios from "axios";
export const store = reactive({
    error: null,
    photos: null,
    isVisible: false,
    photoToSearch: '',
    API_URL_PHOTO: 'http://localhost:8080/api/photos',
    // getPhotos(call) {
    //     axios
    //         .get(call)
    //         .then((response) => {
    //             console.log(response);
    //             // this.photos = response.data.results.data;
    //             // this.results = response.data.results;
    //             // this.loading = false;
    //         })
    //         .catch((error) => {
    //             console.error(error);
    //             this.error = error.message;
    //             this.loading = false;
    //         });
    // },
    callApi(URL) {
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
    // callApi(URL_PHOTO) {
    //     Promise.all(URL_PHOTO).then(response => {
    //         console.log(response);
    //         // this.photos = response.data.results
    //         // console.log(this.photos);
    //     });
    // }
    //     , searchForphoto() {
    //         if (store.photoToSearch === '') {
    //             console.log('Non hai inserito nessun parametro di ricerca!');
    //             return store.isVisible = false
    //         }
    //         const API_URL_PHOTO = `${store.API_URL_PHOTO}&q=${store.photoToSearch}`
    //         const AllPhotos = axios.get(API_URL_PHOTO);
    //         store.callApi(AllPhotos)
    //         store.isVisible = true
    //         setTimeout(function () {
    //             console.log('fuzione asincrona');
    //             window.scrollTo(0, 550)
    //         }, 300)

    //     }
},
)