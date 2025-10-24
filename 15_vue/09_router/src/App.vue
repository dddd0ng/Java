<script setup>
  import {RouterLink, RouterView} from 'vue-router';
</script>

<!--
  RouterLink
  1. to 속성을 쓰면 url 주소를 바꿔준다.(클라이언트 라우팅, location.href 속성을 바꾸는 것과 같은 효과가 발생한다.)
  2. active-class를 쓰면 활성화된 버튼에 class 속성을 부여해서 css 적용
  3. replace를 쓰면 뒤로 가기를 막는 효과를 낼 수도 있다.
-->
<template>
  <header>
    <!-- <h2>basic router</h2>
    <nav>
      <RouterLink to="/" active-class="active" replace>Home</RouterLink>
      <RouterLink to="/pathvariable/1" active-class="active" replace>PathVariable</RouterLink>
      <RouterLink to="/querystring?name=홍길동&age=20" active-class="active" replace>QueryString</RouterLink>
    </nav> -->
    <h2>nested router</h2>
    <nav>
      <RouterLink to="/" active-class="active" replace>Home</RouterLink>
      <RouterLink to="/nested/home" active-class="active" replace>중첩</RouterLink>
      <RouterLink to="/nested/view" active-class="active" replace>중첩</RouterLink>
    </nav>
  </header>
  <main>
    <RouterView/>
  </main>
</template>

<style scoped>
  nav {
    width: 100%;
    font-size: 12px;
    text-align: center;
    margin-top: 2rem;
    font-size: 30px;
  }

  a {
    margin-left: 10px;
  }

  .active {
    color: red;
    text-decoration: none;
  }

  main {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
  }

  header {
    text-align: center;
  }
</style>