<!--
    Props와 Slot의 차이점
    Props는 부모가 자식에게 데이터를 전달할 때 사용 
    Slot은 부모가 자식에게 태그를 전달할 때 사용

    Props는 기본적으로 readonly의 개념을 통해 자식 컴포넌트에서 
    수정해도 부모에 영향을 주지 않는다.(안티패턴 방지)

    Slot은 이름(named)을 활용해 자식에게 선택권을 주거나 
    런타임 시점에 동적으로 이름을 바꿔서 전달할 수 있다.
-->

<template>
    <div :class="{container:true, dark:darkState}" >

        <!-- 원하는 이름으로 부모 컴포넌트의 데이터(상태)를 전달할 수 있다.
         (Props, 일반적으로는 같은 이름을 사용) -->
        <PropsChild :message="message2" />

        <!-- Props로 물려준 부모의 상태는 자식에서 수정하더라도 부모의 상태는 영향을 받지 않음 -->
        <ReadProps :readValue="readValue"/>
        <br>
        {{ readValue }}

        <DarkMode @toggle="toggleDarkMode"/>
    </div>
</template>

<script setup>
    import PropsChild from './PropsChild.vue';
    import ReadProps from './ReadProps.vue';
    import DarkMode from './DarkMode.vue';

    import {ref} from 'vue';

    const message2 = ref('hello');
    const readValue = ref('Vue는 재밌다');
    const darkState = ref(false);

    function toggleDarkMode() {
        darkState.value = !darkState.value;
    }

</script>

<style scoped>
    .container{
        border: 1px solid;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    .dark{
        background-color: black;
        color: white;
    }
</style>