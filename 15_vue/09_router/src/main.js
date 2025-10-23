import { createApp } from 'vue'
import App from './App.vue'
import router from './router/01_router.js';


//터미널에서 num install vue-router@next로 Dependency추가(package.json에)

// createApp(App).use(router).mount('#app')
// 위에코드들 길어지다보면 아래처럼 씀
const app = createApp(App);
app.use(router);
app.mount('#app');
