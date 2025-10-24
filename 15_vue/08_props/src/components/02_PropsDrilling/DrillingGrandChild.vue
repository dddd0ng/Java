<template>
    <div>
        <h3>GrandChild: {{ injectedCount }}</h3>
        <button @click="injectedCount++;"> GrandChild에서 값 증가</button>
    </div>
</template>

<script setup>
    import {inject} from 'vue';

    const injectedCount = inject('count');
</script>

<style scoped>

</style>