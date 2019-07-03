import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)
const store = new Vuex.Store({
    state: {
        id : '',
        meettingname: '',
        member: '',
        meetingcontent: '',
        meetingtime: '',
        meetinglocation: '',
        latepenalty: ''
    },
    mutations:{

    },
    getters : {
        
    }
})

export default store;
