import { createRouter, createWebHashHistory, createWebHistory } from 'vue-router';
import HomeView from '@/views/01_router/HomeView.vue';
import PathVariable from '@/views/01_router/PathVariable.vue';
import QueryString from '@/views/01_router/QueryString.vue';

const router = createRouter({
    history: createWebHistory(),
    // history: createWebHashHistory(),
    routes: [
        {
            path: '/',
            component: HomeView
        },
        {
            /* 
            pathvariable 형태의 라우팅은 경로상의 값을 받아 줄
            변수를 작성하는 형태로 설정해야 한다.
            */
            path: '/pathvariable/:id',
            component: PathVariable
        },
        {
            path: '/querystring',
            component: QueryString
        }
    ]
});

export default router;