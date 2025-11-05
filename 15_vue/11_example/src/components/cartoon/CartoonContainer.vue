<script setup>
import { onMounted, ref } from "vue";
import CartoonCard from "./CartoonCard.vue";

const cartoons = ref([]);

onMounted(async () =>{
    const jsonData = fetch("https://api.sampleapis.com/cartoons/cartoons2D")
                    .then(response => response.json());
    cartoons.value = await jsonData;
    console.log('가져온 데이터: ', cartoons.value);
});
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