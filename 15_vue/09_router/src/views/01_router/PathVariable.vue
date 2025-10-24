<template>
    <div>
<h1>PathVariable</h1>
<h2>넘어온 PathVariable 값 (id) = {{ currentRoute.params.id }}</h2>
    </div>
</template>

<script setup>

// useRoute를 활용한 라우팅 관련 정보 추출
 import {useRoute} from 'vue-router';

 const currentRoute = useRoute();

</script>

<style scoped>

</style>