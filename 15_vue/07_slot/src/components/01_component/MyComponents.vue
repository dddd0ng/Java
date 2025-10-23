<!-- 
플러그인 설치 이후 vbase-3-setup로 작성
-->

<!-- 
template (템플릿 영역이라고 함)
vue는 사용자의 화면에 보여질 부분을 template 영역에 html요소들로 작성한다.
(template 태그는 DOM tree로 구성되지 않고 렌더링 될 때 해석되지 않는다.)
-->
<template>
    <div>
<h1 id="test">MyComponent</h1>
    </div>
</template>

<!-- 
script (스크립트 영역)
setup 키워드 덕에 setup() 함수 내부 코드만 작성해도 된다.
setup을 안쓰면 setup()함수 만들면서 직접 이것저것 써야함
반환할거면 return문까지 써야함
-->
<script setup>
 import {onMounted} from 'vue';

 onMounted (()=>{
console.log ('MyComponent 부착!');
 })
</script>


<!-- 
style scoped
현재 컴포넌트에서만 적용되는 스타일을 작성한다.(범위 css)
(해당 컴포넌트가 또 다른 컴포는트를 품고 있으면 하위 컴포넌트에도 적용되는 css)
-->
<style scoped>
#test{
    color:blue;
}
</style>

