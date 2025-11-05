import { defineStore } from 'pinia'

export const useCartoonStore = defineStore('cartoon', {
    state: () => ({
        cartoons: []
    }),
    actions: {
        async fetchCartoons() {
            const response = await fetch("https://api.sampleapis.com/cartoons/cartoons2D")
            this.cartoons = await response.json()
        },
        deleteCartoon(id) {
            this.cartoons = this.cartoons.filter(cartoon => cartoon.id !== id)
        }
    }
})