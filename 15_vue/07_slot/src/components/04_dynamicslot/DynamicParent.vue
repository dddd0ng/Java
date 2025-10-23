<template>
    <div class="parentContainer">
<input type="text" v-model="dynamicName">
<DynamicChild>
    <template #[dynamicName]>
{{ dynamicName }}

    </template>
    </DynamicChild>
    </div>
</template>

<script setup>
import DynamicChild from './DynamicChild.vue';
import {ref} from 'vue';

const dynamicName = ref('');
</script>

<style scoped>

    .parentContainer {
        display: flex;
        align-items: center;
        flex-direction: column;
        border: 1px solid black;
    }
</style>