<template>
    <div>
        <h1>Parent : {{ count }}</h1>
        <DrillingChild />
    </div>
</template>

<script setup>
    import DrillingChild from './DrillingChild.vue';
    import {ref, provide, readonly} from 'vue';
    const count = ref(2);
    // provide('count', count);
    provide('count', readonly(count));

</script>

<style scoped>

</style>