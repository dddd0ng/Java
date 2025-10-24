<template>
    <div>
        <h1>Parent : {{ count }}</h1>
        <DrillingChild />
    </div>
</template>

<!-- 
Props Drilling
상위 컴포넌트에서 하위 컴포넌트로 데이터를 전달하는 과정에서 
중간에 너무 많은 하위 컴포넌트들을 거쳐가는 경우가 생길 수 있다.
이렇게 여러 컴포넌트를 거쳐 props를 전달하다보면 코드를 복잡하게 만들고
유지보수를 힘들게 한다. vue에서는 부모 컴포넌트의 상태값을 하위 컴포넌트 중에
필요 시 inject하여 어디서든 쓸 수 있게 하는 방법을 제공한다.
(다만, readonly를 고려하는 편이 유지보수 측면에서 도움이 되고 안티패턴을 방지할 수 있다.)

장점
1. Props drilling을 피해 유지보수가 쉬워질 수도 있다.(잘 쓴다면)


단점
1. 어떤 자식 컴포넌트가 inject에 갔는지 알기가 쉽지 않다.
2. readonly를 매번 고려해야 한다.
3. 중간에 여러 컴포넌트가 있으면 구조를 더 복잡하게 할 수 있다.

-->

<script setup>
    import DrillingChild from './DrillingChild.vue';
    import {ref, provide, readonly} from 'vue';
    const count = ref(2);
    // provide('count', count);
    provide('count', readonly(count));

</script>

<style scoped>

</style>