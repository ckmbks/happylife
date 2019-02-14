import request from '@/utils/request'

export function loginByUsername(userName, password) {
  return request({
    url: '/user/login',
    method: 'post',
    data: {
      userName,
      password
    }
  })
}

export function logout() {
  return request({
    url: '/login/logout',
    method: 'post'
  })
}

export function getUserInfo(token) {
  return request({
    url: '/user/getByToken',
    method: 'get',
    params: {
      token
    }
  })
}
