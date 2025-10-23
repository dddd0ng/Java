<template>
    <div class="parentContainer">
<input type="text" v-model="dynamicName">
<DynamicChild>

    <!-- #[]는 동적 태그 이름을 사용할 때 사용한다. -->
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