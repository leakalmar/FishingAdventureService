import { createRouter, createWebHistory } from 'vue-router'

const routes = [{
        path: '/',
        name: 'Home',
        component: () =>
            import ('../views/Home.vue')
    },
    {
        path: '/profile',
        name: 'profile',
        component: () =>
            import ('../views/Profile.vue')
    },
    {
        path: '/about',
        name: 'About',
        component: () =>
            import ('../views/About.vue')
    },
    {
        path: '/search',
        name: 'Search',
        component: () =>
            import ('../views/Search.vue'),
        children: [{
            path: '',
            name: 'SearchAll',
            component: () =>
                import ('../views/Search.vue')
        }, {
            path: 'boats',
            name: 'SearchBoats',
            component: () =>
                import ('../views/Search.vue')
        }, {
            path: 'cottages',
            name: 'SearchCottages',
            component: () =>
                import ('../views/Search.vue')
        }, {
            path: 'adventures',
            name: 'SearchAdventures',
            component: () =>
                import ('../views/Search.vue')
        }]
    }
]
const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})
export default router