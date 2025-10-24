import { createRouter, createWebHistory } from 'vue-router';

import HomeView from '@/views/01_router/HomeView.vue';
// import NestedHome from '@/views/02_nestedRouter/NestedHome.vue';
import RootRouter from '@/views/02_nestedRouter/RootRouter.vue';
import NestedView from '@/views/02_nestedRouter/NestedView.vue';

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            component: HomeView
        },
        {
            path: '/nested',
            component: RootRouter,
            children: [
                {
                    path: 'home',

                    // lazy loaded : 코드를 분할(정크)해서 필요한 시점에 가져옴으로써 메모리 낭비를 줄이고
                    //속도 및 성능 향상을 도모 할 수 있다. (코드 스플리팅)
                    // component: NestedHome
                    component: () => import('@/views/02_nestedRouter/NestedHome.vue')
                },
                {
                    path: 'view',
                    component: NestedView
                }
            ]
        }
    ]
})

export default router;