<script setup>
import { onMounted } from "vue";
import { storeToRefs } from 'pinia'
import { useCartoonStore } from '../../stores/cartoonStore'
import CartoonCard from "./CartoonCard.vue";

const cartoonStore = useCartoonStore()
const { cartoons } = storeToRefs(cartoonStore)

onMounted(() => {
    cartoonStore.fetchCartoons()
})
</script>

<template>
    <div class="container">
        <CartoonCard v-for="cartoon in cartoons" :cartoon="cartoon" :key="cartoon.id"/>
    </div>
</template>


<style scoped>
.container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    align-items: center;
    margin: 0 auto;
}
</style>