<!-- 
다른 SFC(single file component) (다른 파일)을 불러올 때는
상대경로(./) 또는 src부터의 경로인 절대경로(@)를 사용할 수 있다. 
-->

<script setup>
// import MyComponents from './components/01_component/MyComponents.vue';
import MyComponents from '@/components/01_component/MyComponents.vue'; 
import SlotParent from './components/02_slotIntro/SlotParent.vue';

</script>

<template>
<header>
  </header>
<div class="redColor">
  <MyComponents/>
</div>
  <main>
    <SlotParent/>
    </main>

</template>

<style scoped>
.redColor{
  color:red;
}
</style>
