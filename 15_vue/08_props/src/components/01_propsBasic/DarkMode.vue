<!--
    부모로부터 전달된 이벤트(사용자 정의형)를 활용해 부모의 이벤트를 발동시켜 부모의
    이벤트 핸들러 함수를 실행한다. 
    (자식 컴포넌트가 부모 컴포넌트로 발산(emit('원하는 이벤트명')))
-->
<template>
    <button @click="emit('toggle')">다크 모드 토글</button>
</template>

<script setup>
    import { defineEmits } from 'vue';

    /*
        부모로부터 이벤트들을 물려 받아 이벤트를 호출할 수 있는 호출기(emit) 반환받기
        (defineEmits에 물려받은 이벤트들을 배열로 나열)
    */
    const emit = defineEmits(['toggle']);
</script>

<style scoped>

</style>