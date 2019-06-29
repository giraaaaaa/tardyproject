import Vue from 'vue'
import Router from 'vue-router'
import myComponent from '@/components/myComponent'
// import Home from '@/components/pages/1Home'
// import Join from '@/components/pages/2Join'
// import Login from '@/components/pages/3Login'
// import FindUser from '@/components/pages/4FindUser'
// import Mypage from '@/components/pages/5Mypage'
import MakeMeeting from '@/components/pages/MakeMeeting'
import ModifyMeeting from '@/components/pages/ModifyMeeting'
import MakeMeetingDone from '@/components/MakeMeetingDone'
import GroupRoom from '@/components/pages/GroupRoom'

Vue.use(Router)

export default new Router({
  mode:"history",
  routes: [
    {
      path: '/myComponent',
      name: 'myComponent',
      component: myComponent
    },
    {
      path: '/MakeMeeting',
      name: 'MakeMeeting',
      component: MakeMeeting
    },
    {
      path: '/MakeMeetingDone',
      name: 'MakeMeetingDone',
      component: MakeMeetingDone
    },
    {
      path: '/GroupRoom',
      name: 'GroupRoom',
      component: GroupRoom
    },
    {
      path: '/ModifyMeeting',
      name: 'ModifyMeeting',
      component: ModifyMeeting
    },
    // {
    //   path: '/find-user',
    //   name: 'FindUser',
    //   component: FindUser
    // },
    // {
    //   path: '/mypage',
    //   name: 'Mypage',
    //   component: Mypage
    // }
  
  ]
})
